package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OperarMateriaP {

    private Modelo modelo = null;

    public boolean buscar(String nombre) {

        ResultSet rs = null;
        BDConex bd = new BDConex();
        boolean resultado;
        resultado = false;

        rs = bd.consultar("SELECT * FROM `materia_prima` WHERE `nombre` = \"" + nombre + "\"");

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

    public boolean Crear(String nombre, double precio, String unidad_medida) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;
        Modelo modelo = null;

        if (!buscar(nombre)) {

            op = bd.ejecutar("INSERT INTO `ppp`.`materia_prima` (`nombre`, `precio`, `uni_med`, `id`) "
                    + "VALUES ('" + nombre + "', '" + precio + "', '" + unidad_medida + "', NULL);");

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

    public boolean modificar(String nombre, String unidad_medida, int id, double precio, int i) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        if (i == 0) {

            op = bd.ejecutar("UPDATE materia_prima SET nombre=\"" + nombre + "\",uni_med=\"" + unidad_medida + "\",precio=\"" + precio + "\" WHERE id = " + id);

            if (op > 0) {

                correcto = true;
                JOptionPane.showMessageDialog(null, "   ¡Modificaión Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
            } else {

                JOptionPane.showMessageDialog(null, "¡Ocurrio un error en la operación! \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }

        } else {

            if (!buscar(nombre)) {

                op = bd.ejecutar("UPDATE materia_prima SET nombre=\"" + nombre + "\",uni_med=\"" + unidad_medida + "\",precio=\"" + precio + "\" WHERE id = " + id);

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

}
