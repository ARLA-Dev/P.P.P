package Vistas.paneles;

import Vistas.Inicio;
import javax.swing.JPanel;

public class productos extends javax.swing.JPanel {

    public productos(JPanel botones) {
        
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
        desplegable2.setSelectedIndex(0);
        desplegable1.setSelectedIndex(-1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        precio_detal = new javax.swing.JTextField();
        desplegable2 = new javax.swing.JComboBox<>();
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
        nombre = new javax.swing.JTextField();
        titulo8 = new javax.swing.JLabel();
        costo_produc = new javax.swing.JTextField();
        cantidad = new javax.swing.JSpinner();
        desplegable1 = new javax.swing.JComboBox<>();
        titulo9 = new javax.swing.JLabel();
        total_pro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titulo11 = new javax.swing.JLabel();
        cantidad_mayor = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        titulo12 = new javax.swing.JLabel();
        mano_obra_ventas = new javax.swing.JTextField();
        titulo13 = new javax.swing.JLabel();
        transporte_produc = new javax.swing.JTextField();
        titulo14 = new javax.swing.JLabel();
        mano_obra_produc = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 590));
        setMinimumSize(new java.awt.Dimension(600, 590));
        setName("Materia Prima"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio_detal.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        precio_detal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(precio_detal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 220, -1));

        desplegable2.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        desplegable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Litros", "Kilos", "Gramos" }));
        desplegable2.setBorder(null);
        desplegable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable2.setOpaque(false);
        add(desplegable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, -1));

        titulo1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo1.setText("Limpiar");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        titulo2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo2.setText("Mano de obra en Ventas");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        titulo3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo3.setText("Cantidad al Mayor");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, -1));

        titulo4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo4.setText("Precio al Detal");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear.png"))); // NOI18N
        crear.setBorderPainted(false);
        crear.setContentAreaFilled(false);
        crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crear.setFocusPainted(false);
        crear.setFocusable(false);
        crear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crear2.png"))); // NOI18N
        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, -1));

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.setFocusPainted(false);
        modificar.setFocusable(false);
        modificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar2.png"))); // NOI18N
        add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, -1, -1));

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
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, -1));

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

        titulo5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo5.setText("Nombre");
        add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        titulo6.setText("Productos");
        add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        titulo7.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo7.setText("Modificar");
        add(titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, -1, -1));

        titulo10.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo10.setText("Crear");
        add(titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, -1, -1));

        nombre.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, -1));

        titulo8.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo8.setText("Costo de Producción");
        add(titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        costo_produc.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        costo_produc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(costo_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 220, -1));

        cantidad.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 20));

        desplegable1.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jabón", "Desinfectante", "Cloro" }));
        desplegable1.setBorder(null);
        desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable1.setOpaque(false);
        add(desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 270, -1));

        titulo9.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo9.setText("Total de Producción");
        add(titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        total_pro.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        total_pro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(total_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 220, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 5, 210));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 370, 250));

        titulo11.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo11.setText("Cantidad");
        add(titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, -1));

        cantidad_mayor.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        add(cantidad_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 10, 190));

        titulo12.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo12.setText("En Inventario");
        add(titulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        mano_obra_ventas.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        mano_obra_ventas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(mano_obra_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 240, -1));

        titulo13.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo13.setText("Transporte de Producción");
        add(titulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        transporte_produc.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        transporte_produc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(transporte_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 240, -1));

        titulo14.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo14.setText("Mano de obra de Producción");
        add(titulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        mano_obra_produc.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        mano_obra_produc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(mano_obra_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        botones.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        
        desplegable2.setSelectedIndex(0);
        desplegable1.setSelectedIndex(-1);
        precio_detal.setText("");
        costo_produc.setText("");
        total_pro.setText("");
        nombre.setText("");
        cantidad.setValue(0);
        cantidad_mayor.setValue(0);
        transporte_produc.setText("");
        mano_obra_produc.setText("");
        mano_obra_ventas.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    JPanel botones;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner cantidad;
    private javax.swing.JSpinner cantidad_mayor;
    private javax.swing.JTextField costo_produc;
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JComboBox<String> desplegable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField mano_obra_produc;
    private javax.swing.JTextField mano_obra_ventas;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio_detal;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo10;
    private javax.swing.JLabel titulo11;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo13;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JTextField total_pro;
    private javax.swing.JTextField transporte_produc;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
