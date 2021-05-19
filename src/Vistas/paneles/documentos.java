package Vistas.paneles;

import Vistas.Inicio;
import javax.swing.JPanel;

public class documentos extends javax.swing.JPanel {

    public documentos(JPanel botones) {
        
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
        desplegable1.setSelectedIndex(0);
        desplegable2.setSelectedIndex(0);   
        jRadioButton1.setSelected(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desplegable1 = new javax.swing.JComboBox<>();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        titulo5 = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        desplegable2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        titulo9 = new javax.swing.JLabel();
        titulo11 = new javax.swing.JLabel();
        titulo12 = new javax.swing.JLabel();
        titulo13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titulo14 = new javax.swing.JLabel();
        listado_detal = new javax.swing.JButton();
        listado_mayor = new javax.swing.JButton();
        listado_condominio = new javax.swing.JButton();
        productos = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        cotizacion = new javax.swing.JButton();
        nota_entrega = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 590));
        setMinimumSize(new java.awt.Dimension(600, 590));
        setName("Materia Prima"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desplegable1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fulano", "Mengano", "Zutano" }));
        desplegable1.setBorder(null);
        desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable1.setOpaque(false);
        add(desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 350, -1));

        titulo1.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo1.setText("Limpiar");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, -1, -1));

        titulo2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo2.setText("Nota de Entrega");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

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
        add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

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
        titulo5.setText("Tipo de Venta");
        add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        titulo6.setText("Documentos");
        add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        desplegable2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "J-" }));
        desplegable2.setBorder(null);
        desplegable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable2.setOpaque(false);
        add(desplegable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 350, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("0%");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.setFocusable(false);
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        jRadioButton2.setText("16%");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.setFocusable(false);
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        titulo9.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo9.setText("Iva");
        add(titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        titulo11.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo11.setText("Listado Detal");
        add(titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        titulo12.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo12.setText("Listado al Mayor");
        add(titulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        titulo13.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo13.setText("Listado para");
        add(titulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 5, 420));

        titulo14.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo14.setText("Condominio");
        add(titulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        listado_detal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        listado_detal.setBorderPainted(false);
        listado_detal.setContentAreaFilled(false);
        listado_detal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listado_detal.setFocusable(false);
        listado_detal.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        add(listado_detal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        listado_mayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        listado_mayor.setBorderPainted(false);
        listado_mayor.setContentAreaFilled(false);
        listado_mayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listado_mayor.setFocusable(false);
        listado_mayor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        add(listado_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        listado_condominio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        listado_condominio.setBorderPainted(false);
        listado_condominio.setContentAreaFilled(false);
        listado_condominio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listado_condominio.setFocusable(false);
        listado_condominio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        add(listado_condominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        productos.setViewportView(jPanel1);

        add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 460, 300));

        titulo3.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo3.setText("Clientes");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        titulo4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo4.setText("Cotización");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        cotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        cotizacion.setBorderPainted(false);
        cotizacion.setContentAreaFilled(false);
        cotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cotizacion.setFocusPainted(false);
        cotizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizacionActionPerformed(evt);
            }
        });
        add(cotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        nota_entrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        nota_entrega.setBorderPainted(false);
        nota_entrega.setContentAreaFilled(false);
        nota_entrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nota_entrega.setFocusPainted(false);
        nota_entrega.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        add(nota_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        botones.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        
        desplegable1.setSelectedIndex(0);
        desplegable2.setSelectedIndex(0);   
        jRadioButton1.setSelected(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cotizacionActionPerformed

    JPanel botones;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cotizacion;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JComboBox<String> desplegable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listado_condominio;
    private javax.swing.JButton listado_detal;
    private javax.swing.JButton listado_mayor;
    private javax.swing.JButton nota_entrega;
    private javax.swing.JScrollPane productos;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo11;
    private javax.swing.JLabel titulo12;
    private javax.swing.JLabel titulo13;
    private javax.swing.JLabel titulo14;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo9;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
