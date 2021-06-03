package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarClientes {

    private Modelo modelo = null;

    public boolean buscar(String ci) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `cliente` WHERE `ci` = \"" + ci + "\"");

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

    public boolean Crear(String nombre, String tlf, String direccion, String ci) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        if (!buscar(ci)) {

            op = bd.ejecutar("INSERT INTO `ppp`.`cliente` (`nombre`, `telefono`, `direccion`, `ci`) "
                    + "VALUES ('" + nombre + "', '" + tlf + "', '" + direccion + "', '" + ci + "');");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "     ¡Registro Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }

    public boolean modificar(String nombre, String tlf, String ci, String direccion, int i, String ci_viejo) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        if (i == 0) {

            op = bd.ejecutar("UPDATE cliente SET nombre=\"" + nombre + "\",telefono=\"" + tlf + "\",direccion=\"" + direccion + "\",ci=\"" + ci + "\" WHERE ci = \"" + ci_viejo + "\"");

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        } else {

            if (!buscar(ci)) {

                op = bd.ejecutar("UPDATE cliente SET nombre=\"" + nombre + "\",telefono=\"" + tlf + "\",direccion=\"" + direccion + "\",ci=\"" + ci + "\" WHERE ci = \"" + ci_viejo + "\"");

                if (op > 0) {

                    correcto = true;
                    JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "     ¡Registro Existente! \n    Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
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

                result = bd.consultar("SELECT * FROM `cliente` ORDER BY nombre");

                while (result.next() == true) {
                    iv = new Modelo();
                    iv.setNombre_cli(result.getString("nombre"));
                    iv.setTelefono_cli(result.getString("telefono"));
                    iv.setDireccion_cli(result.getString("direccion"));
                    iv.setCi_cli(result.getString("ci"));
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
