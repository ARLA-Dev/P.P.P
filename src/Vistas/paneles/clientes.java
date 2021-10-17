package Vistas.paneles;

import BD.Desplegable_cliente;
import BD.Desplegable_mp;
import BD.Modelo;
import BD.OperarClientes;
import Principal.Globales;
import Vistas.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.nashorn.internal.objects.Global;

public class clientes extends javax.swing.JPanel {

    public clientes(JPanel botones) {

        initComponents();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.botones = botones;
        cargarCB();
        nombre.setText("");
        direccion.setText("");
        tlf.setText("");
        rif.setText("");
        desplegable1.setSelectedIndex(-1);
        desplegable2.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccion = new javax.swing.JTextField();
        desplegable1 = new javax.swing.JComboBox<>();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        titulo10 = new javax.swing.JLabel();
        desplegable2 = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JTextField();
        rif = new javax.swing.JTextField();
        titulo8 = new javax.swing.JLabel();
        tlf = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 590));
        setMinimumSize(new java.awt.Dimension(600, 590));
        setName("Materia Prima"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        direccion.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 350, -1));

        desplegable1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable1.setBorder(null);
        desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable1.setOpaque(false);
        desplegable1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegable1ItemStateChanged(evt);
            }
        });
        add(desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 350, -1));

        titulo1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo1.setText("Limpiar");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        titulo2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo2.setText("Registrados");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        titulo3.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo3.setText("Documento de Identidad");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        titulo4.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo4.setText("Dirección");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        crear.setBorderPainted(false);
        crear.setContentAreaFilled(false);
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.setFocusPainted(false);
        crear.setFocusable(false);
        crear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear2.png"))); // NOI18N
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setFocusPainted(false);
        modificar.setFocusable(false);
        modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar2.png"))); // NOI18N
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barriendo.png"))); // NOI18N
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFocusPainted(false);
        limpiar.setFocusable(false);
        limpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barriendo2.png"))); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        volver.setBorderPainted(false);
        volver.setContentAreaFilled(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setFocusPainted(false);
        volver.setFocusable(false);
        volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver2.png"))); // NOI18N
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        titulo5.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo5.setText("Nombre");
        add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        titulo6.setText("Clientes");
        add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        titulo7.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo7.setText("Modificar");
        add(titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        titulo10.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo10.setText("Crear");
        add(titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        desplegable2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "J-" }));
        desplegable2.setBorder(null);
        desplegable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable2.setOpaque(false);
        add(desplegable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, -1));

        nombre.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 350, -1));

        rif.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        rif.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rifKeyTyped(evt);
            }
        });
        add(rif, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 290, 30));

        titulo8.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo8.setText("Teléfono");
        add(titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        tlf.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        tlf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tlf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tlfKeyTyped(evt);
            }
        });
        add(tlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        botones.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        desplegable1.setSelectedIndex(-1);
        desplegable2.setSelectedIndex(0);
        direccion.setText("");
        tlf.setText("");
        rif.setText("");
        nombre.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (nombre.getText().equals("") || rif.getText().equals("") || tlf.getText().equals("") || direccion.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            OperarClientes op = new OperarClientes();
            op.Crear(nombre.getText().toUpperCase(), tlf.getText().toUpperCase(), direccion.getText().toUpperCase(), desplegable2.getSelectedItem().toString() + "" + rif.getText());
            cargarCB();
            desplegable1.setSelectedIndex(-1);
            desplegable2.setSelectedIndex(0);
            direccion.setText("");
            tlf.setText("");
            rif.setText("");
            nombre.setText("");
        }
    }//GEN-LAST:event_crearActionPerformed

    private void desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegable1ItemStateChanged

        if (desplegable1.getSelectedIndex() >= 0) {

            nombre.setText(lista_cli.get(desplegable1.getSelectedIndex()).getNombre_cli());
            tlf.setText((lista_cli.get(desplegable1.getSelectedIndex()).getTelefono_cli()));
            direccion.setText((lista_cli.get(desplegable1.getSelectedIndex()).getDireccion_cli()));
            ci_viejo = lista_cli.get(desplegable1.getSelectedIndex()).getCi_cli();

            String letra;
            letra = lista_cli.get(desplegable1.getSelectedIndex()).getCi_cli();
            letra = letra.substring(0, 2);
            desplegable2.setSelectedItem(letra);
            letra = lista_cli.get(desplegable1.getSelectedIndex()).getCi_cli();
            letra = letra.substring(2);
            rif.setText(letra);
        }
    }//GEN-LAST:event_desplegable1ItemStateChanged

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (desplegable1.getSelectedIndex() == -1) {

            JOptionPane.showMessageDialog(null, "  ¡No ha hecho una elección!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else if (nombre.getText().equals("") || tlf.getText().equals("") || direccion.getText().equals("") || rif.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            int i;
            i = 0;

            if (ci_viejo.equals(desplegable2.getSelectedItem().toString() + "" + rif.getText().toUpperCase())) {

                i = 0;
            } else {

                i = 1;
            }

            OperarClientes op = new OperarClientes();
            op.modificar(nombre.getText().toUpperCase(), tlf.getText().toUpperCase(), desplegable2.getSelectedItem().toString() + "" + rif.getText().toUpperCase(), direccion.getText().toUpperCase(), i, ci_viejo);
            cargarCB();
            desplegable1.setSelectedIndex(-1);
            desplegable2.setSelectedIndex(0);
            direccion.setText("");
            tlf.setText("");
            rif.setText("");
            nombre.setText("");
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void rifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rifKeyTyped
        
        char c = evt.getKeyChar();
        verificar.soloNumeros(c, evt);
        verificar.validarLongitud(rif, 9, evt);
        
    }//GEN-LAST:event_rifKeyTyped

    private void tlfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlfKeyTyped
        
        char c = evt.getKeyChar();
        verificar.soloNumeros(c, evt);
        verificar.validarLongitud(tlf, 10, evt);
        
    }//GEN-LAST:event_tlfKeyTyped

    JPanel botones;

    public void cargarCB() {

        desplegable1.removeAllItems();
        Desplegable_cliente lista = new Desplegable_cliente();
        lista_cli = lista.Desplegable_cliente();

        if (lista_cli.size() > 0) {
            for (int i = 0; i < lista_cli.size(); i++) {

                desplegable1.addItem(lista_cli.get(i).getNombre_cli());
            }
        }
    }

    ArrayList<Modelo> lista_cli;
    String ci_viejo;
    Globales verificar = new Globales();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JComboBox<String> desplegable2;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rif;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JTextField tlf;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
