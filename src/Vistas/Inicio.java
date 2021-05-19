package Vistas;

import Vistas.paneles.clientes;
import Vistas.paneles.documentos;
import Vistas.paneles.listados;
import Vistas.paneles.materia_prima;
import Vistas.paneles.productos;
import java.awt.Desktop;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("hh:mm:ss a");
        reloj.setText(formateador.format(LocalDateTime.now()));
        reloj();
        mp = new materia_prima(botones);
        carta.add(mp);
        cli = new clientes(botones);
        carta.add(cli);
        produc = new productos(botones);
        carta.add(produc);
        list = new listados(botones);
        carta.add(list);
        docu = new documentos(botones);
        carta.add(docu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        lateral = new javax.swing.JPanel();
        titulo6 = new javax.swing.JLabel();
        reloj = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        dolar = new javax.swing.JButton();
        ws = new javax.swing.JButton();
        titulo8 = new javax.swing.JLabel();
        contra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        carta = new javax.swing.JPanel();
        botones = new javax.swing.JPanel();
        materia_prima = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        productos = new javax.swing.JButton();
        titulo2 = new javax.swing.JLabel();
        clientes = new javax.swing.JButton();
        titulo3 = new javax.swing.JLabel();
        listados = new javax.swing.JButton();
        titulo4 = new javax.swing.JLabel();
        documentos = new javax.swing.JButton();
        titulo5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pérez Productos Clean");
        setMinimumSize(new java.awt.Dimension(950, 700));
        setName("Inicio"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setFocusPainted(false);
        salir.setFocusable(false);
        salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir2.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 40));

        lateral.setBackground(new java.awt.Color(153, 153, 153));
        lateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lateral.setForeground(new java.awt.Color(204, 204, 204));
        lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo6.setText("Dólar Paralelo");
        lateral.add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        reloj.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        reloj.setText("HH:MM:SS AA");
        lateral.add(reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo200x200.png"))); // NOI18N
        lateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        titulo7.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo7.setText("WhatsApp Web");
        lateral.add(titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        dolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dolar1.png"))); // NOI18N
        dolar.setBorderPainted(false);
        dolar.setContentAreaFilled(false);
        dolar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dolar.setFocusPainted(false);
        dolar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dolar2.png"))); // NOI18N
        dolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dolarActionPerformed(evt);
            }
        });
        lateral.add(dolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        ws.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whatsapp.png"))); // NOI18N
        ws.setBorderPainted(false);
        ws.setContentAreaFilled(false);
        ws.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ws.setFocusPainted(false);
        ws.setFocusable(false);
        ws.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/whatsapp2.png"))); // NOI18N
        ws.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wsActionPerformed(evt);
            }
        });
        lateral.add(ws, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        titulo8.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo8.setText("Cambio de Contraseña");
        lateral.add(titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        contra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena.png"))); // NOI18N
        contra.setBorderPainted(false);
        contra.setContentAreaFilled(false);
        contra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contra.setFocusPainted(false);
        contra.setFocusable(false);
        contra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contrasena2.png"))); // NOI18N
        lateral.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);
        lateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 260, 3));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setOpaque(true);
        lateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 260, 3));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setOpaque(true);
        lateral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 260, 3));

        getContentPane().add(lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 700));

        carta.setOpaque(false);
        carta.setLayout(new java.awt.CardLayout());

        botones.setOpaque(false);
        botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        materia_prima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/materia_prima.png"))); // NOI18N
        materia_prima.setBorderPainted(false);
        materia_prima.setContentAreaFilled(false);
        materia_prima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        materia_prima.setFocusPainted(false);
        materia_prima.setFocusable(false);
        materia_prima.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/materia_prima2.png"))); // NOI18N
        materia_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materia_primaActionPerformed(evt);
            }
        });
        botones.add(materia_prima, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, -1));

        titulo1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo1.setText("Materia Prima");
        botones.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto.png"))); // NOI18N
        productos.setBorderPainted(false);
        productos.setContentAreaFilled(false);
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productos.setFocusPainted(false);
        productos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/producto2.png"))); // NOI18N
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        botones.add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        titulo2.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo2.setText("Productos");
        botones.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        clientes.setBorderPainted(false);
        clientes.setContentAreaFilled(false);
        clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientes.setFocusPainted(false);
        clientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente2.png"))); // NOI18N
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        botones.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        titulo3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo3.setText("Clientes");
        botones.add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        listados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listados.png"))); // NOI18N
        listados.setBorderPainted(false);
        listados.setContentAreaFilled(false);
        listados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listados.setFocusPainted(false);
        listados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listados2.png"))); // NOI18N
        listados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadosActionPerformed(evt);
            }
        });
        botones.add(listados, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        titulo4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo4.setText("Listados");
        botones.add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));

        documentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documentos.png"))); // NOI18N
        documentos.setBorderPainted(false);
        documentos.setContentAreaFilled(false);
        documentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        documentos.setFocusPainted(false);
        documentos.setFocusable(false);
        documentos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documentos1.png"))); // NOI18N
        documentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentosActionPerformed(evt);
            }
        });
        botones.add(documentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        titulo5.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo5.setText("Documentos");
        botones.add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, 20));

        carta.add(botones, "card2");

        getContentPane().add(carta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 640, 630));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 2, 36)); // NOI18N
        jLabel1.setText("Pérez Productos Clean");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        fondo.setMaximumSize(new java.awt.Dimension(950, 700));
        fondo.setMinimumSize(new java.awt.Dimension(950, 700));
        fondo.setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        if(JOptionPane.showConfirmDialog(null, "¿Desea volver al login?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
        
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_salirActionPerformed

    private void dolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dolarActionPerformed
        try {
            
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/enparalelovzla/?hl=es-la").toURI());
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_dolarActionPerformed

    private void wsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wsActionPerformed
        try {
            
            Desktop.getDesktop().browse(new URL("https://web.whatsapp.com/").toURI());
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_wsActionPerformed

    private void materia_primaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materia_primaActionPerformed
        
        mp.setVisible(true);
        botones.setVisible(false);     
    }//GEN-LAST:event_materia_primaActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
        
        botones.setVisible(false);
        cli.setVisible(true);
        
    }//GEN-LAST:event_clientesActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        
        botones.setVisible(false);
        produc.setVisible(true);
        
    }//GEN-LAST:event_productosActionPerformed

    private void listadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadosActionPerformed
        
        botones.setVisible(false);
        list.setVisible(true);
        
    }//GEN-LAST:event_listadosActionPerformed

    private void documentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentosActionPerformed
        
        botones.setVisible(false);
        docu.setVisible(true);
        
    }//GEN-LAST:event_documentosActionPerformed

    public void Inicio() {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public void reloj() {

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("hh:mm:ss a");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        reloj.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }
    
    materia_prima mp;
    clientes cli;
    productos produc;
    listados list;
    documentos docu;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JPanel carta;
    private javax.swing.JButton clientes;
    private javax.swing.JButton contra;
    private javax.swing.JButton documentos;
    private javax.swing.JButton dolar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel lateral;
    private javax.swing.JButton listados;
    private javax.swing.JButton materia_prima;
    private javax.swing.JButton productos;
    private javax.swing.JLabel reloj;
    private javax.swing.JButton salir;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JButton ws;
    // End of variables declaration//GEN-END:variables
}
