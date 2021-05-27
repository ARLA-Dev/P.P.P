package BD;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class OperarLogin {

    private Modelo login = null;

    public boolean Ingresar(String clave) {

        this.login = login;
        ResultSet rs = null;
        boolean resultado = false;

        Modelo login = new Modelo();
        BDConex bd = new BDConex();

        rs = bd.consultar("SELECT * FROM clave WHERE clave='" + clave + "';");

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
        bd.desconectar();
        return resultado;
    }

    public boolean modificar(String clave_vieja, String clave_nueva) {

        int op = 0;
        BDConex bd = new BDConex();
        boolean correcto = false;

        op = bd.ejecutar("UPDATE clave SET clave=\"" + clave_nueva + "\" WHERE clave=\"" + clave_vieja + "\"");

        if (op > 0) {
            correcto = true;
            JOptionPane.showMessageDialog(null, "La Contraseña se modificó exitosamente", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ocurrio un Error al modificar la Contraseña \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        bd.desconectar();
        return correcto;
    }
}
