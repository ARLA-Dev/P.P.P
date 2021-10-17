package clases;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class data_cotizacion implements JRDataSource {

    private List<cotizacion> lista = new ArrayList<cotizacion>();
    private int indice = -1;

    @Override
    public boolean next() throws JRException {

        return ++indice < lista.size();
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {

        Object valor = null;

        if ("identificacion".equals(jrField.getName())) {

            valor = lista.get(indice).getIdentificacion();

        } else if ("nombre".equals(jrField.getName())) {

            valor = lista.get(indice).getNombre();
        }
        else if ("direccion".equals(jrField.getName())) {

            valor = lista.get(indice).getDireccion();
        }
        else if ("telefono".equals(jrField.getName())) {

            valor = lista.get(indice).getTelefono();
        }
        else if ("cantidades".equals(jrField.getName())) {

            valor = lista.get(indice).getCantidades();
        }
        else if ("descripciones".equals(jrField.getName())) {

            valor = lista.get(indice).getDescripciones();
        }
        else if ("precios_u".equals(jrField.getName())) {

            valor = lista.get(indice).getPrecio_u();
        }
        else if ("precios_to".equals(jrField.getName())) {

            valor = lista.get(indice).getPrecio_to();
        }
        else if ("base".equals(jrField.getName())) {

            valor = lista.get(indice).getBase();
        }
        else if ("iva".equals(jrField.getName())) {

            valor = lista.get(indice).getIva();
        }
        else if ("total".equals(jrField.getName())) {

            valor = lista.get(indice).getTotal();
        }
        return valor;
    }

    public void addCotizacion(cotizacion c) {
        
        this.lista.add(c);
    }
}
