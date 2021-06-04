package Vistas.paneles;

import BD.Desplegable_cliente;
import BD.Desplegable_mp;
import BD.Desplegable_producto;
import BD.Modelo;
import BD.OperarProducto;
import Principal.Globales;
import Vistas.Inicio;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

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
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMinimum(1);
        modeloSpinner.setStepSize(1);
        cantidad.setModel(modeloSpinner);
        cantidad.setValue(1);
        SpinnerNumberModel modeloSpinner2 = new SpinnerNumberModel();
        modeloSpinner2.setMinimum(1);
        modeloSpinner2.setStepSize(1);
        cantidad_mayor.setModel(modeloSpinner2);
        cantidad_mayor.setValue(1);
        cargarmp();
        cargarCB();
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
        mp = new javax.swing.JPanel();
        titulo11 = new javax.swing.JLabel();
        cantidad_mayor = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        titulo12 = new javax.swing.JLabel();
        mano_obra_ventas = new javax.swing.JTextField();
        titulo13 = new javax.swing.JLabel();
        transporte_produc = new javax.swing.JTextField();
        titulo14 = new javax.swing.JLabel();
        mano_obra_produc = new javax.swing.JTextField();
        calculadora = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 590));
        setMinimumSize(new java.awt.Dimension(600, 590));
        setName("Materia Prima"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio_detal.setEditable(false);
        precio_detal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        precio_detal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(precio_detal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 220, -1));

        desplegable2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        titulo3.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo3.setText("Cantidad al Mayor");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 150, -1));

        titulo4.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo4.setText("Precio al Detal");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

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
        add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, -1));

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
        add(titulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        titulo6.setText("Productos");
        add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        titulo7.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo7.setText("Modificar");
        add(titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, -1, -1));

        titulo10.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo10.setText("Crear");
        add(titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, -1, -1));

        nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 270, -1));

        titulo8.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo8.setText("Costo de Producción");
        add(titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        costo_produc.setEditable(false);
        costo_produc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costo_produc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(costo_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 220, -1));

        cantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 30));

        desplegable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jabón", "Desinfectante", "Cloro" }));
        desplegable1.setBorder(null);
        desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable1.setOpaque(false);
        desplegable1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegable1ItemStateChanged(evt);
            }
        });
        add(desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, -1));

        titulo9.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo9.setText("Total de Producción");
        add(titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        total_pro.setEditable(false);
        total_pro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        total_pro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(total_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 220, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 5, 250));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mp.setBackground(new java.awt.Color(204, 204, 204));
        mp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(mp);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 370, 250));

        titulo11.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo11.setText("Cantidad");
        add(titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        cantidad_mayor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add(cantidad_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 10, 190));

        titulo12.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo12.setText("En Inventario");
        add(titulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        mano_obra_ventas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mano_obra_ventas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mano_obra_ventas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mano_obra_ventasKeyTyped(evt);
            }
        });
        add(mano_obra_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 240, -1));

        titulo13.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo13.setText("Transporte de Producción");
        add(titulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        transporte_produc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        transporte_produc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        transporte_produc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transporte_producKeyTyped(evt);
            }
        });
        add(transporte_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 240, -1));

        titulo14.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        titulo14.setText("Mano de obra de Producción");
        add(titulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        mano_obra_produc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mano_obra_produc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mano_obra_produc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mano_obra_producKeyTyped(evt);
            }
        });
        add(mano_obra_produc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 240, -1));

        calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora.png"))); // NOI18N
        calculadora.setBorderPainted(false);
        calculadora.setContentAreaFilled(false);
        calculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculadora.setFocusPainted(false);
        calculadora.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculadora1.png"))); // NOI18N
        calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraActionPerformed(evt);
            }
        });
        add(calculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));
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
        cantidad.setValue(1);
        cantidad_mayor.setValue(1);
        transporte_produc.setText("");
        mano_obra_produc.setText("");
        mano_obra_ventas.setText("");
        cargarCB();
        cargarmp();
    }//GEN-LAST:event_limpiarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        if (nombre.getText().equals("") || transporte_produc.getText().equals("") || mano_obra_produc.getText().equals("")
                || mano_obra_ventas.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

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

                boolean correcto;
                correcto = false;

                OperarProducto op = new OperarProducto();
                correcto = op.Crear(nombre.getText().toUpperCase(), (Integer) cantidad.getValue(), desplegable2.getSelectedItem().toString(),
                        (Integer) cantidad_mayor.getValue(), Double.parseDouble(transporte_produc.getText()), Double.parseDouble(mano_obra_produc.getText()),
                        Double.parseDouble(mano_obra_ventas.getText()));

                if (correcto) {
                    int id;
                    id = op.ultimo_producto();

                    for (int i = 0; i < listamp.size(); i++) {

                        if (cb[i].isSelected()) {

                            op.Crear_ingrediente(listamp.get(i).getId_mp(), Double.parseDouble(jt[i].getText()), id);
                        }
                    }

                    JOptionPane.showMessageDialog(null, "     ¡Creación Exitosa!", "¡OPERACIÓN EXITOSA!", JOptionPane.INFORMATION_MESSAGE);
                    desplegable2.setSelectedIndex(0);
                    desplegable1.setSelectedIndex(-1);
                    precio_detal.setText("");
                    costo_produc.setText("");
                    total_pro.setText("");
                    nombre.setText("");
                    cantidad.setValue(1);
                    cantidad_mayor.setValue(1);
                    transporte_produc.setText("");
                    mano_obra_produc.setText("");
                    mano_obra_ventas.setText("");
                    cargarCB();
                    cargarmp();
                    cargar_ing();
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡Faltan datos en ingredientes!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_crearActionPerformed

    private void transporte_producKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transporte_producKeyTyped

        char c = evt.getKeyChar();
        variable.dinero(c, evt);
    }//GEN-LAST:event_transporte_producKeyTyped

    private void mano_obra_producKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mano_obra_producKeyTyped

        char c = evt.getKeyChar();
        variable.dinero(c, evt);
    }//GEN-LAST:event_mano_obra_producKeyTyped

    private void mano_obra_ventasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mano_obra_ventasKeyTyped

        char c = evt.getKeyChar();
        variable.dinero(c, evt);
    }//GEN-LAST:event_mano_obra_ventasKeyTyped

    private void calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraActionPerformed

        DecimalFormat df = new DecimalFormat("#.0");
        costo = 0;

        transporte = 0;
        mano_p = 0;
        mano_v = 0;

        if (transporte_produc.getText().equals("") || mano_obra_produc.getText().equals("") || mano_obra_ventas.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

            transporte = Double.parseDouble(transporte_produc.getText());
            mano_p = Double.parseDouble(mano_obra_produc.getText());
            mano_v = Double.parseDouble(mano_obra_ventas.getText());

            for (int i = 0; i < listamp.size(); i++) {

                if (cb[i].isSelected()) {

                    if (!jt[i].getText().equals("")) {

                        costo = costo + (listamp.get(i).getPrecio_mp() * Double.parseDouble(jt[i].getText()));

                    } else {

                        JOptionPane.showMessageDialog(null, "¡Campo vacío en el producto " + listamp.get(i).getNombre_mp() + "!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }

            costo_produc.setText(df.format(costo + transporte + mano_p + mano_v) + "$");
            total_pro.setText(df.format((costo + transporte + mano_p + mano_v) + (costo + transporte + mano_p + mano_v) * 0.3) + "$");
            precio_detal.setText(df.format(((costo + transporte + mano_p + mano_v) + (costo + transporte + mano_p + mano_v) * 0.3) / (Integer) cantidad.getValue()) + "$");
        }
    }//GEN-LAST:event_calculadoraActionPerformed

    private void desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegable1ItemStateChanged

        if (desplegable1.getSelectedIndex() >= 0) {

            cargarmp();
            nombre.setText(lista_pro.get(desplegable1.getSelectedIndex()).getNombre_pro());
            cantidad.setValue(lista_pro.get(desplegable1.getSelectedIndex()).getCantidad_pro());
            cantidad_mayor.setValue(lista_pro.get(desplegable1.getSelectedIndex()).getCantida_mayor());
            desplegable2.setSelectedItem(lista_pro.get(desplegable1.getSelectedIndex()).getUni_med());
            transporte_produc.setText(lista_pro.get(desplegable1.getSelectedIndex()).getTransporte_pro() + "");
            mano_obra_produc.setText(lista_pro.get(desplegable1.getSelectedIndex()).getMano_obra_pro() + "");
            mano_obra_ventas.setText(lista_pro.get(desplegable1.getSelectedIndex()).getMano_obra_v() + "");
            id_p = lista_pro.get(desplegable1.getSelectedIndex()).getId();

            for (int i = 0; i < lista_ing.size(); i++) {

                if (lista_pro.get(desplegable1.getSelectedIndex()).getId() == lista_ing.get(i).getId_pro_ing()) {

                    for (int j = 0; j < listamp.size(); j++) {

                        if (lista_ing.get(i).getId_mp_ing() == listamp.get(j).getId_mp()) {

                            cb[j].setSelected(true);
                            jt[j].setText(lista_ing.get(i).getCant_ing() + "");
                        }
                    }
                }
            }
            DecimalFormat df = new DecimalFormat("#.0");
            costo = 0;

            transporte = 0;
            mano_p = 0;
            mano_v = 0;

            transporte = Double.parseDouble(transporte_produc.getText());
            mano_p = Double.parseDouble(mano_obra_produc.getText());
            mano_v = Double.parseDouble(mano_obra_ventas.getText());

            for (int i = 0; i < listamp.size(); i++) {

                if (cb[i].isSelected()) {

                    if (!jt[i].getText().equals("")) {

                        costo = costo + (listamp.get(i).getPrecio_mp() * Double.parseDouble(jt[i].getText()));

                    }
                }
            }
            costo_produc.setText(df.format(costo + transporte + mano_p + mano_v) + "$");
            total_pro.setText(df.format((costo + transporte + mano_p + mano_v) + (costo + transporte + mano_p + mano_v) * 0.3) + "$");
            precio_detal.setText(df.format(((costo + transporte + mano_p + mano_v) + (costo + transporte + mano_p + mano_v) * 0.3) / (Integer) cantidad.getValue()) + "$");
        }
    }//GEN-LAST:event_desplegable1ItemStateChanged

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (nombre.getText().equals("") || transporte_produc.getText().equals("") || mano_obra_produc.getText().equals("")
                || mano_obra_ventas.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "          ¡Campo Vacío!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);

        } else {

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

                OperarProducto op = new OperarProducto();
                boolean correcto, eliminado, existe;
                correcto = false;

                for (int i = 0; i < lista_ing.size(); i++) {

                    eliminado = true;
                    for (int j = 0; j < listamp.size(); j++) {

                        if (lista_ing.get(i).getId_mp_ing() == listamp.get(j).getId_mp()) {

                            if (!cb[j].isSelected()) {

                                eliminado = false;
                            } else {

                                op.modificar_ingrediente(lista_ing.get(i).getId_ing(), Double.parseDouble(jt[j].getText()));
                            }
                        }
                    }
                    if (eliminado == false) {
                        op.borrar_ingrediente(lista_ing.get(i).getId_ing());
                    }
                }

                for (int i = 0; i < listamp.size(); i++) {

                    existe = false;
                    if (cb[i].isSelected()) {

                        existe = op.buscar_ingrediente(listamp.get(i).getId_mp(), id_p);

                        if (!existe) {

                            op.Crear_ingrediente(listamp.get(i).getId_mp(), Double.parseDouble(jt[i].getText()), id_p);
                        }
                    }
                }

                op.modificar(nombre.getText().toUpperCase(), (Integer) cantidad.getValue(), desplegable2.getSelectedItem().toString(),
                (Integer) cantidad_mayor.getValue(), Double.parseDouble(transporte_produc.getText()), Double.parseDouble(mano_obra_produc.getText()),
                Double.parseDouble(mano_obra_ventas.getText()), id_p);

                desplegable2.setSelectedIndex(0);
                desplegable1.setSelectedIndex(-1);
                precio_detal.setText("");
                costo_produc.setText("");
                total_pro.setText("");
                nombre.setText("");
                cantidad.setValue(1);
                cantidad_mayor.setValue(1);
                transporte_produc.setText("");
                mano_obra_produc.setText("");
                mano_obra_ventas.setText("");
                cargarCB();
                cargarmp();

            } else {
                JOptionPane.showMessageDialog(null, "¡Faltan datos en ingredientes!", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_modificarActionPerformed

    public void cargarmp() {

        Desplegable_mp lista = new Desplegable_mp();
        listamp = lista.Desplegable_mp();

        if (listamp.size() > 0) {

            mp.removeAll();
            mp.repaint();
            GridLayout gl = new GridLayout(listamp.size(), 3);
            mp.setLayout(gl);
            cb = new JCheckBox[listamp.size()];
            jt = new JTextField[listamp.size()];
            jl = new JLabel[listamp.size()];

            for (int i = 0; i < listamp.size(); i++) {

                cb[i] = new JCheckBox(listamp.get(i).getNombre_mp());
                cb[i].setFont(new Font("Arial", Font.BOLD, 12));
                //cb[i].setSelected(false);
                jt[i] = new JTextField();
                jt[i].setFont(new Font("Arial", Font.BOLD, 12));
                //jt[i].setText("");
                jl[i] = new JLabel(listamp.get(i).getPrecio_mp() + "$ / " + listamp.get(i).getUnidad_medida_mp());
                jl[i].setFont(new Font("Arial", Font.BOLD, 12));
                mp.add(cb[i]);
                mp.add(jt[i]);
                mp.add(jl[i]);
            }
        }
    }

    public void cargarCB() {

        desplegable1.removeAllItems();
        cargar_ing();
        Desplegable_producto lista = new Desplegable_producto();
        lista_pro = lista.Desplegable_producto();

        if (lista_pro.size() > 0) {
            for (int i = 0; i < lista_pro.size(); i++) {

                desplegable1.addItem(lista_pro.get(i).getNombre_pro());
            }
        }
        desplegable2.setSelectedIndex(0);
        desplegable1.setSelectedIndex(-1);
        precio_detal.setText("");
        costo_produc.setText("");
        total_pro.setText("");
        nombre.setText("");
        cantidad.setValue(1);
        cantidad_mayor.setValue(1);
        transporte_produc.setText("");
        mano_obra_produc.setText("");
        mano_obra_ventas.setText("");
        desplegable1.setSelectedIndex(-1);
    }

    public void cargar_ing() {

        Desplegable_producto lista = new Desplegable_producto();
        lista_ing = lista.Ingredientes();
    }

    JCheckBox[] cb;
    JTextField[] jt;
    JLabel[] jl;
    ArrayList<Modelo> listamp;
    ArrayList<Modelo> lista_pro;
    ArrayList<Modelo> lista_ing;
    JPanel botones;
    Globales variable = new Globales();
    double costo, transporte, mano_p, mano_v;
    int id_p = 1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculadora;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JSpinner cantidad_mayor;
    private javax.swing.JTextField costo_produc;
    private javax.swing.JButton crear;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JComboBox<String> desplegable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField mano_obra_produc;
    private javax.swing.JTextField mano_obra_ventas;
    private javax.swing.JButton modificar;
    private javax.swing.JPanel mp;
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
