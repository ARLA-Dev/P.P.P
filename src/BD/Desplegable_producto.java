package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Desplegable_producto {

    public ArrayList Desplegable_producto() {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `producto` ORDER BY nombre");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_pro(result.getString("nombre"));
                    iv.setCantidad_pro(Integer.parseInt(result.getString("cantidad")));
                    iv.setUni_med(result.getString("uni_med"));
                    iv.setCantida_mayor(Integer.parseInt(result.getString("cant_mayor")));
                    iv.setTransporte_pro(Double.parseDouble(result.getString("transporte_prod")));
                    iv.setMano_obra_pro(Double.parseDouble(result.getString("mano_prod")));
                    iv.setMano_obra_v(Double.parseDouble(result.getString("mano_venta")));
                    iv.setId(Integer.parseInt(result.getString("id")));
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }
    
    public ArrayList Ingredientes() {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `ingredientes` ORDER BY id");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setId_ing(Integer.parseInt(result.getString("id")));
                    iv.setId_mp_ing(Integer.parseInt(result.getString("id_mp")));
                    iv.setId_pro_ing(Integer.parseInt(result.getString("id_produc")));
                    iv.setCant_ing(Double.parseDouble(result.getString("cantidad")));
                    
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }
    
    public double buscar_m(int id) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        double resultado;
        resultado = 0;

        rs = bd.consultar("SELECT * FROM `ingredientes`, `materia_prima` WHERE `ingredientes`.`id_produc` = " + id + 
                " and `ingredientes`.`id_mp` = `materia_prima`.`id`");

        try {
            while (rs.next()) {
                resultado = resultado + rs.getDouble("ingredientes.cantidad") * rs.getDouble("materia_prima.precio");
            } 
        } catch (SQLException e) {

            e.printStackTrace();
        }
        
        return resultado;
    }
    
    public ArrayList Desplegable_producto(int n) {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `producto` ORDER BY nombre");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_pro(result.getString("nombre"));
                    iv.setCantidad_pro(Integer.parseInt(result.getString("cantidad")));
                    iv.setUni_med(result.getString("uni_med"));
                    iv.setCantida_mayor(Integer.parseInt(result.getString("cant_mayor")));
                    iv.setTransporte_pro(Double.parseDouble(result.getString("transporte_prod")));
                    iv.setMano_obra_pro(Double.parseDouble(result.getString("mano_prod")));
                    iv.setMano_obra_v(Double.parseDouble(result.getString("mano_venta")));
                    iv.setId(Integer.parseInt(result.getString("id")));
                    iv.setTotal(buscar_m(result.getInt("id")));
                    lista.add(iv);
                }
            }
        } catch (SQLException e) {

            System.out.println(e);

        } finally {

            try {

                connection.close();
                bd.desconectar();

            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return lista;
    }
}
