package Principal;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

public class Globales {

    public void soloNumeros(char c, java.awt.event.KeyEvent e) {
        
        if (!Character.isDigit(c)) {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }

    public void dinero(char c, java.awt.event.KeyEvent e) {
        
        char a;
        a = '.';
        if (!Character.isDigit(c) && !(Character.compare(c, a) == 0)) {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }

    public void validarLongitud(JTextField tx, int longitud, java.awt.event.KeyEvent e) {

        if (tx.getText().length() > longitud) {
            Toolkit.getDefaultToolkit().beep();
            e.consume();
        }
    }
}
