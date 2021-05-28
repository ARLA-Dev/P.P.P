package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Desplegable_mp {

    public ArrayList Desplegable_mp() {

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
                    iv.setId_mp(Integer.parseInt(result.getString("id")));
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
