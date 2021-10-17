package clases;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class data_detal implements JRDataSource {

    private List<detal> lista = new ArrayList<detal>();
    private int indice = -1;

    @Override
    public boolean next() throws JRException {

        return ++indice < lista.size();
    }

    @Override
    public Object getFieldValue(JRField jrField) throws JRException {

        Object valor = null;

        if ("producto".equals(jrField.getName())) {

            valor = lista.get(indice).getNombre();

        } else if ("precio".equals(jrField.getName())) {

            valor = lista.get(indice).getPrecio();
        }
        return valor;
    }

    public void addDetal(detal d) {
        
        this.lista.add(d);
    }
}
