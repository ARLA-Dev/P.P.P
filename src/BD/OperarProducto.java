package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarProducto {

    private Modelo modelo = null;

    public boolean buscar(String nombre) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `producto` WHERE `nombre` = \"" + nombre + "\"");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultado;
    }

    public boolean Crear(String nombre, int cantidad, String uni_med, int cant_mayor, double transporte_prod, double mano_prod, double mano_venta) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        if (!buscar(nombre)) {

            op = bd.ejecutar("INSERT INTO `ppp`.`producto` (`nombre`, `cantidad`, `uni_med`,`cant_mayor`,`transporte_prod`,"
                    + "`mano_prod`,`mano_venta`, `id`) "
                    + "VALUES ('" + nombre + "', '" + cantidad + "', '" + uni_med + "', '" + cant_mayor + "',"
                    + "'" + transporte_prod + "','" + mano_prod + "','" + mano_venta + "', NULL);");

            if (op > 0) {

                correcto = true;
            } else {
                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "     ¡Registro Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String nombre, int cantidad, String uni_med, int cant_mayor, double transporte_prod, double mano_prod, double mano_venta, int id) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE producto SET nombre=\"" + nombre + "\",cantidad=\"" + cantidad + "\",uni_med=\"" + 
        uni_med + "\",cant_mayor=\"" + cant_mayor + "\",transporte_prod=\"" + transporte_prod + "\",mano_prod=\"" + 
        mano_prod+ "\",mano_venta=\"" + mano_venta +"\" WHERE id = " + id);

        if (op > 0) {

            correcto = true;
            JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public int ultimo_producto() {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        int resultado;
        resultado = 0;

        rs = bd.consultar("SELECT MAX(id) AS id FROM producto");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                resultado = Integer.parseInt(rs.getString("id"));
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultado;
    }

    public boolean Crear_ingrediente(int id, double cantidad, int id_p) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        op = bd.ejecutar("INSERT INTO `ppp`.`ingredientes` (`id_mp`, `id_produc`, `cantidad`, `id`) "
                + "VALUES ('" + id + "', '" + id_p + "', '" + cantidad + "', NULL);");

        if (op > 0) {

            correcto = true;
        }

        bd.desconectar();
        return correcto;
    }

    public ArrayList BuscarconMatriz() {

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

                result = bd.consultar("SELECT * FROM `materia_prima` ORDER BY nombre");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_mp(result.getString("nombre"));
                    iv.setPrecio_mp(Double.parseDouble(result.getString("precio")));
                    iv.setUnidad_medida_mp(result.getString("uni_med"));
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

    public ArrayList llenar_listdo() {

        ArrayList lista = new ArrayList<>();
        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        PreparedStatement statement = null;
        ResultSet result = null;
        ResultSet result2 = null;
        Connection connection;

        Modelo iv;
        connection = bd.getConexion();

        try {

            if (connection != null) {

                result = bd.consultar("SELECT * FROM `producto` ORDER BY nombre");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_pro(result.getString("nombre"));
                    iv.setCantida_mayor(Integer.parseInt(result.getString("cant_mayor")));
                    iv.setUni_med(result.getString("uni_med"));

                    result2 = bd.consultar("SELECT * FROM `ingredientes`, `materia_prima` WHERE `ingredientes`.`id_produc` = " + Integer.parseInt(result.getString("id")) + " "
                            + "AND `ingredientes`.`id_mp` = `materia_prima`.`id`");

                    double costo;
                    costo = 0;

                    while (result2.next() == true) {

                        costo = costo + (Double.parseDouble(result2.getString("ingredientes.cantidad")) * Double.parseDouble(result2.getString("materia_prima.precio")));
                    }

                    costo = costo + Double.parseDouble(result.getString("transporte_prod")) + Double.parseDouble(result.getString("mano_prod")) + Double.parseDouble(result.getString("mano_venta"));
                    costo = costo + costo * 0.3;
                    costo = costo / Integer.parseInt(result.getString("cantidad"));
                    iv.setPrecio_detal(costo);
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

    public boolean borrar_ingrediente(int id) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        op = bd.ejecutar("DELETE FROM `ppp`.`ingredientes` WHERE `ingredientes`.`id` = " + id + "");

        if (op > 0) {

            correcto = true;
        }

        bd.desconectar();
        return correcto;
    }

    public boolean modificar_ingrediente(int id, double cantidad) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        op = bd.ejecutar("UPDATE ingredientes SET cantidad=\"" + cantidad + "\" WHERE id = " + id);

        if (op > 0) {

            correcto = true;
        }

        bd.desconectar();
        return correcto;
    }

    public boolean buscar_ingrediente(int id_mp, int id_p) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `ingredientes` WHERE `id_mp` = \"" + id_mp + "\" AND `id_produc` = \"" + id_p + "\"");

        try {
            if (rs.first()) {
                rs.beforeFirst();
                rs.next();
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return resultado;
    }
}
