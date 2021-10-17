package Vistas.paneles;

import BD.Desplegable_cliente;
import BD.Desplegable_mp;
import BD.Desplegable_producto;
import BD.Modelo;
import BD.OperarProducto;
import Vistas.Inicio;
import clases.condominio;
import clases.cotizacion;
import clases.data_condominio;
import clases.data_cotizacion;
import clases.data_detal;
import clases.data_mayor;
import clases.detal;
import clases.mayor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

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
        iva0.setSelected(true);
        obtenerMatriz_pro();
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
        iva0 = new javax.swing.JRadioButton();
        iva16 = new javax.swing.JRadioButton();
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
        p = new javax.swing.JPanel();
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
        desplegable2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Condominio" }));
        desplegable2.setBorder(null);
        desplegable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable2.setOpaque(false);
        desplegable2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegable2ItemStateChanged(evt);
            }
        });
        add(desplegable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 350, -1));

        buttonGroup1.add(iva0);
        iva0.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        iva0.setSelected(true);
        iva0.setText("0%");
        iva0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iva0.setContentAreaFilled(false);
        iva0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iva0.setFocusable(false);
        add(iva0, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        buttonGroup1.add(iva16);
        iva16.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        iva16.setText("16%");
        iva16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        iva16.setContentAreaFilled(false);
        iva16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iva16.setFocusable(false);
        add(iva16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

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
        listado_detal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_detalActionPerformed(evt);
            }
        });
        add(listado_detal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        listado_mayor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        listado_mayor.setBorderPainted(false);
        listado_mayor.setContentAreaFilled(false);
        listado_mayor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listado_mayor.setFocusable(false);
        listado_mayor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        listado_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_mayorActionPerformed(evt);
            }
        });
        add(listado_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        listado_condominio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar.png"))); // NOI18N
        listado_condominio.setBorderPainted(false);
        listado_condominio.setContentAreaFilled(false);
        listado_condominio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listado_condominio.setFocusable(false);
        listado_condominio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/descargar3.png"))); // NOI18N
        listado_condominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_condominioActionPerformed(evt);
            }
        });
        add(listado_condominio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        p.setBackground(new java.awt.Color(255, 255, 255));
        p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        productos.setViewportView(p);

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
        nota_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota_entregaActionPerformed(evt);
            }
        });
        add(nota_entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        botones.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        desplegable1.setSelectedIndex(0);
        desplegable2.setSelectedIndex(0);
        iva0.setSelected(true);
        cargar_producto();
    }//GEN-LAST:event_limpiarActionPerformed

    private void cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizacionActionPerformed

        boolean vacio;
        vacio = false;

        for (int i = 0; i < listamp.size(); i++) {

            if (cb[i].isSelected()) {

                if (jt[i].getText().equals("")) {

                    vacio = true;

                }
            }
        }

        if (vacio == false) {

            datasource4 = new data_cotizacion();
            cotizacion c = new cotizacion(ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo);
            c.setNombre(lista_cli.get(desplegable1.getSelectedIndex()).getNombre_cli());
            c.setIdentificacion(lista_cli.get(desplegable1.getSelectedIndex()).getCi_cli());
            c.setDireccion(lista_cli.get(desplegable1.getSelectedIndex()).getDireccion_cli());
            c.setTelefono(lista_cli.get(desplegable1.getSelectedIndex()).getTelefono_cli());
            precios_u = "";
            cantidades = "";
            descripciones = "";
            totales = "";
            precios = 0;
            String aux;
            DecimalFormat df2 = new DecimalFormat("#0,00");

            for (int i = 0; i < listamp.size(); i++) {

                if (cb[i].isSelected()) {

                    cantidades = cantidades + "" + jt[i].getText() + "\n";
                    descripciones = descripciones + "" + miLista_aux.get(i).getNombre_pro() + " (" + miLista_aux.get(i).getUni_med() + ")\n";

                    if (desplegable2.getSelectedItem().equals("Normal")) {

                        if (Integer.parseInt(jt[i].getText()) >= miLista_aux.get(i).getCantida_mayor()) {

                            precios_u = precios_u + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 0.90) + " $ \n";
                            totales = totales + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 0.90 * Integer.parseInt(jt[i].getText())) + " $ \n";
                            aux = df.format((miLista_aux.get(i).getPrecio_detal()) * 0.90 * Integer.parseInt(jt[i].getText()));
                            aux = aux.replace(",", ".");
                            precios = precios + Double.parseDouble(aux);

                        } else {

                            precios_u = precios_u + "" + df.format(miLista_aux.get(i).getPrecio_detal()) + " $ \n";
                            totales = totales + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * Integer.parseInt(jt[i].getText())) + " $ \n";
                            aux = df.format((miLista_aux.get(i).getPrecio_detal()) * Integer.parseInt(jt[i].getText()));
                            aux = aux.replace(",", ".");
                            precios = precios + Double.parseDouble(aux);
                        }

                    } else {

                        precios_u = precios_u + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 1.10) + " $ \n";
                        totales = totales + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 1.10 * Integer.parseInt(jt[i].getText())) + " $ \n";
                        aux = df.format((miLista_aux.get(i).getPrecio_detal()) * 1.10 * Integer.parseInt(jt[i].getText()));
                        aux = aux.replace(",", ".");
                        precios = precios + Double.parseDouble(aux);
                    }
                }
            }

            if (iva0.isSelected()) {

                c.setIva("No Aplica");
                c.setTotal(precios + " $");

            } else {
                
                c.setIva(df.format(precios * 0.16)+" $");
                c.setTotal(df.format(precios *1.16) + " $");
            }

            c.setPrecio_u(precios_u);
            c.setCantidades(cantidades);
            c.setDescripciones(descripciones);
            c.setPrecio_to(totales);
            c.setBase(precios + "$");
            datasource4.addCotizacion(c);
            desplegable2.setSelectedIndex(0);
            desplegable1.setSelectedIndex(0);
            cargar_producto();

            try {

                obtenerMatriz_pro();
                JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\ppp\\cotizacion.jasper");
                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, datasource4);
                JasperViewer view = new JasperViewer(jasperPrint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } catch (JRException ex) {

                JOptionPane.showMessageDialog(null, "error +" + ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "¡Faltan datos en productos!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cotizacionActionPerformed

    private void listado_detalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_detalActionPerformed

        try {

            obtenerMatriz_pro();
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\ppp\\lista_detal.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, datasource);
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {

            JOptionPane.showMessageDialog(null, "error +" + ex);
        }
    }//GEN-LAST:event_listado_detalActionPerformed

    private void listado_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_mayorActionPerformed

        try {

            obtenerMatriz_pro();
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\ppp\\lista_mayor.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, datasource2);
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {

            JOptionPane.showMessageDialog(null, "error +" + ex);
        }

    }//GEN-LAST:event_listado_mayorActionPerformed

    private void listado_condominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_condominioActionPerformed

        try {

            obtenerMatriz_pro();
            JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\ppp\\lista_condominio.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, datasource3);
            JasperViewer view = new JasperViewer(jasperPrint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {

            JOptionPane.showMessageDialog(null, "error +" + ex);
        }
    }//GEN-LAST:event_listado_condominioActionPerformed

    private void desplegable2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegable2ItemStateChanged

        if (desplegable2.getSelectedItem().equals("Normal")) {

            cargar_producto();

        } else {
            cargar_producto(1);
        }
    }//GEN-LAST:event_desplegable2ItemStateChanged

    private void nota_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota_entregaActionPerformed
        
        boolean vacio;
        vacio = false;

        for (int i = 0; i < listamp.size(); i++) {

            if (cb[i].isSelected()) {

                if (jt[i].getText().equals("")) {

                    vacio = true;

                }
            }
        }

        if (vacio == false) {

            datasource4 = new data_cotizacion();
            cotizacion c = new cotizacion(ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo, ci_viejo);
            c.setNombre(lista_cli.get(desplegable1.getSelectedIndex()).getNombre_cli());
            c.setIdentificacion(lista_cli.get(desplegable1.getSelectedIndex()).getCi_cli());
            c.setDireccion(lista_cli.get(desplegable1.getSelectedIndex()).getDireccion_cli());
            c.setTelefono(lista_cli.get(desplegable1.getSelectedIndex()).getTelefono_cli());
            precios_u = "";
            cantidades = "";
            descripciones = "";
            totales = "";
            precios = 0;
            String aux;
            DecimalFormat df2 = new DecimalFormat("#0,00");

            for (int i = 0; i < listamp.size(); i++) {

                if (cb[i].isSelected()) {

                    cantidades = cantidades + "" + jt[i].getText() + "\n";
                    descripciones = descripciones + "" + miLista_aux.get(i).getNombre_pro() + " (" + miLista_aux.get(i).getUni_med() + ")\n";

                    if (desplegable2.getSelectedItem().equals("Normal")) {

                        if (Integer.parseInt(jt[i].getText()) >= miLista_aux.get(i).getCantida_mayor()) {

                            precios_u = precios_u + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 0.90) + " $ \n";
                            totales = totales + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 0.90 * Integer.parseInt(jt[i].getText())) + " $ \n";
                            aux = df.format((miLista_aux.get(i).getPrecio_detal()) * 0.90 * Integer.parseInt(jt[i].getText()));
                            aux = aux.replace(",", ".");
                            precios = precios + Double.parseDouble(aux);

                        } else {

                            precios_u = precios_u + "" + df.format(miLista_aux.get(i).getPrecio_detal()) + " $ \n";
                            totales = totales + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * Integer.parseInt(jt[i].getText())) + " $ \n";
                            aux = df.format((miLista_aux.get(i).getPrecio_detal()) * Integer.parseInt(jt[i].getText()));
                            aux = aux.replace(",", ".");
                            precios = precios + Double.parseDouble(aux);
                        }

                    } else {

                        precios_u = precios_u + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 1.10) + " $ \n";
                        totales = totales + "" + df.format((miLista_aux.get(i).getPrecio_detal()) * 1.10 * Integer.parseInt(jt[i].getText())) + " $ \n";
                        aux = df.format((miLista_aux.get(i).getPrecio_detal()) * 1.10 * Integer.parseInt(jt[i].getText()));
                        aux = aux.replace(",", ".");
                        precios = precios + Double.parseDouble(aux);
                    }
                }
            }

            if (iva0.isSelected()) {

                c.setIva("No Aplica");
                c.setTotal(precios + " $");

            } else {
                
                c.setIva(df.format(precios * 0.16)+" $");
                c.setTotal(df.format(precios *1.16) + " $");
            }

            c.setPrecio_u(precios_u);
            c.setCantidades(cantidades);
            c.setDescripciones(descripciones);
            c.setPrecio_to(totales);
            c.setBase(precios + "$");
            datasource4.addCotizacion(c);
            desplegable2.setSelectedIndex(0);
            desplegable1.setSelectedIndex(0);
            cargar_producto();

            try {

                obtenerMatriz_pro();
                JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\ppp\\nota_entrega.jasper");
                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, datasource4);
                JasperViewer view = new JasperViewer(jasperPrint, false);
                view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                view.setVisible(true);
            } catch (JRException ex) {

                JOptionPane.showMessageDialog(null, "error +" + ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "¡Faltan datos en productos!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_nota_entregaActionPerformed

    public void obtenerMatriz_pro() {

        OperarProducto op = new OperarProducto();
        ArrayList<Modelo> miLista = op.llenar_listdo();
        double detal, Mayor, Condominio;
        DecimalFormat df = new DecimalFormat("#0.00");
        lista_d = new ArrayList<detal>();
        datasource = new data_detal();
        datasource2 = new data_mayor();
        datasource3 = new data_condominio();
        miLista_aux = new ArrayList<Modelo>();
        miLista_aux = miLista;

        for (int i = 0; i < miLista.size(); i++) {

            detal = 0;
            Mayor = 0;
            Condominio = 0;

            detal = miLista.get(i).getPrecio_detal();
            Mayor = detal - detal * 0.1;
            Condominio = detal + detal * 0.1;
            detal d = new detal(miLista.get(i).getNombre_pro() + "", df.format(detal) + "$");
            mayor m = new mayor(miLista.get(i).getNombre_pro() + " (" + miLista.get(i).getCantida_mayor() + " " + miLista.get(i).getUni_med() + ")", df.format(Mayor) + "$");
            condominio c = new condominio(miLista.get(i).getNombre_pro() + "", df.format(Condominio) + "$");
            datasource2.addMayor(m);
            datasource.addDetal(d);
            datasource3.addCondominio(c);
        }
    }

    public void cargarCB() {

        desplegable1.removeAllItems();
        Desplegable_cliente lista = new Desplegable_cliente();
        lista_cli = lista.Desplegable_cliente();

        if (lista_cli.size() > 0) {
            for (int i = 0; i < lista_cli.size(); i++) {

                desplegable1.addItem(lista_cli.get(i).getNombre_cli() + " - " + lista_cli.get(i).getCi_cli());
            }
        }

        desplegable2.setSelectedIndex(0);
    }

    public void cargar_producto() {

        Desplegable_producto lista = new Desplegable_producto();
        listamp = lista.Desplegable_producto(1);

        if (listamp.size() > 0) {

            p.removeAll();
            p.repaint();
            GridLayout gl = new GridLayout(listamp.size(), 3);
            p.setLayout(gl);
            cb = new JCheckBox[listamp.size()];
            jt = new JTextField[listamp.size()];
            jl = new JLabel[listamp.size()];

            for (int i = 0; i < listamp.size(); i++) {

                cb[i] = new JCheckBox(listamp.get(i).getNombre_pro() + " (" + listamp.get(i).getCantida_mayor() + ")");
                cb[i].setFont(new Font("Arial", Font.BOLD, 12));
                jt[i] = new JTextField();
                jt[i].setFont(new Font("Arial", Font.BOLD, 12));
                jl[i] = new JLabel((df.format(((listamp.get(i).getTotal() + listamp.get(i).getTransporte_pro() + listamp.get(i).getMano_obra_pro() + listamp.get(i).getMano_obra_v())
                        + ((listamp.get(i).getTotal() + listamp.get(i).getTransporte_pro() + listamp.get(i).getMano_obra_pro() + listamp.get(i).getMano_obra_v()) * 0.3)) / listamp.get(i).getCantidad_pro())) + "$ / " + listamp.get(i).getUni_med());
                jl[i].setFont(new Font("Arial", Font.BOLD, 12));
                p.add(cb[i]);
                p.add(jt[i]);
                p.add(jl[i]);
            }
        }
    }

    public void cargar_producto(int n) {

        Desplegable_producto lista = new Desplegable_producto();
        listamp = lista.Desplegable_producto(1);

        if (listamp.size() > 0) {

            p.removeAll();
            p.repaint();
            GridLayout gl = new GridLayout(listamp.size(), 3);
            p.setLayout(gl);
            cb = new JCheckBox[listamp.size()];
            jt = new JTextField[listamp.size()];
            jl = new JLabel[listamp.size()];

            for (int i = 0; i < listamp.size(); i++) {

                cb[i] = new JCheckBox(listamp.get(i).getNombre_pro());
                cb[i].setFont(new Font("Arial", Font.BOLD, 12));
                jt[i] = new JTextField();
                jt[i].setFont(new Font("Arial", Font.BOLD, 12));
                jl[i] = new JLabel((df.format(((listamp.get(i).getTotal() + listamp.get(i).getTransporte_pro() + listamp.get(i).getMano_obra_pro() + listamp.get(i).getMano_obra_v())
                        + ((listamp.get(i).getTotal() + listamp.get(i).getTransporte_pro() + listamp.get(i).getMano_obra_pro() + listamp.get(i).getMano_obra_v()) * 0.3)) * 1.10 / listamp.get(i).getCantidad_pro())) + "$ / " + listamp.get(i).getUni_med());
                jl[i].setFont(new Font("Arial", Font.BOLD, 12));
                p.add(cb[i]);
                p.add(jt[i]);
                p.add(jl[i]);
            }
        }
    }

    DecimalFormat df = new DecimalFormat("#0.00");
    JCheckBox[] cb;
    JTextField[] jt;
    JLabel[] jl;
    ArrayList<Modelo> listamp;
    ArrayList<Modelo> lista_cli;
    String ci_viejo;
    JPanel botones;
    ArrayList<detal> lista_d;
    data_detal datasource;
    data_mayor datasource2;
    data_condominio datasource3;
    data_cotizacion datasource4;
    String cantidades, descripciones, precios_u, precio_to, base, totales, iva;
    double precios;
    ArrayList<Modelo> miLista_aux;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cotizacion;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JComboBox<String> desplegable2;
    private javax.swing.JRadioButton iva0;
    private javax.swing.JRadioButton iva16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listado_condominio;
    private javax.swing.JButton listado_detal;
    private javax.swing.JButton listado_mayor;
    private javax.swing.JButton nota_entrega;
    private javax.swing.JPanel p;
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
