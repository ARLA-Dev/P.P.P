package Vistas.paneles;

import BD.Desplegable_mp;
import BD.Modelo;
import BD.OperarMateriaP;
import Vistas.Inicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class materia_prima extends javax.swing.JPanel {

    public materia_prima(JPanel botones) {

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
        desplegable1.setSelectedIndex(-1);
        desplegable2.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        desplegable1 = new javax.swing.JComboBox<>();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        desplegable2 = new javax.swing.JComboBox<>();
        titulo4 = new javax.swing.JLabel();
        crear = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        titulo10 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 590));
        setMinimumSize(new java.awt.Dimension(600, 590));
        setName("Materia Prima"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 350, -1));

        precio.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        precio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 350, -1));

        desplegable1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jabon", "Desinfectante", "Jabon azul" }));
        desplegable1.setBorder(null);
        desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable1.setOpaque(false);
        add(desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 350, -1));

        titulo1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo1.setText("Limpiar");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, -1));

        titulo2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo2.setText("En inventario");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        titulo3.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo3.setText("Precio");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        desplegable2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LITRO", "KILO", "GRAMO" }));
        desplegable2.setBorder(null);
        desplegable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable2.setOpaque(false);
        add(desplegable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 350, -1));

        titulo4.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo4.setText("Unidad de Medida");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

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
        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setFocusPainted(false);
        modificar.setFocusable(false);
        modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar2.png"))); // NOI18N
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, -1, -1));

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
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

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
        add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        titulo6.setText("Materia Prima");
        add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        titulo7.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo7.setText("Modificar");
        add(titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, -1, -1));

        titulo10.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo10.setText("Crear");
        add(titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        botones.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        desplegable1.setSelectedIndex(-1);
        desplegable2.setSelectedIndex(0);
        nombre.setText("");
        precio.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (nombre.getText().equals("") || precio.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        } else {

            OperarMateriaP op = new OperarMateriaP();
            op.Crear(nombre.getText().toUpperCase(), Double.parseDouble(precio.getText()), desplegable2.getSelectedItem().toString());
            cargarCB();
            desplegable1.setSelectedIndex(-1);
        }

    }//GEN-LAST:event_crearActionPerformed

    JPanel botones;

    public void cargarCB() {

        desplegable1.removeAllItems();
        Desplegable_mp lista = new Desplegable_mp();
        listamp = lista.Desplegable_mp();

        if (listamp.size() > 0) {
            for (int i = 0; i < listamp.size(); i++) {

                desplegable1.addItem(listamp.get(i).getNombre_mp());
            }
        }
    }
    
    ArrayList<Modelo> listamp;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JComboBox<String> desplegable2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
