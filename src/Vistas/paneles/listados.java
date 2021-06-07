package Vistas.paneles;

import BD.Modelo;
import BD.OperarClientes;
import BD.OperarMateriaP;
import BD.OperarProducto;
import Vistas.Inicio;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class listados extends javax.swing.JPanel {

    public listados(JPanel botones) {

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
        panel_pateria_prima.setVisible(true);
        panel_clientes.setVisible(false);
        panel_producto.setVisible(false);
        obtenerMatriz_mp();
        obtenerMatriz_cli();
        obtenerMatriz_pro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desplegable1 = new javax.swing.JComboBox<>();
        titulo2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        titulo6 = new javax.swing.JLabel();
        base = new javax.swing.JPanel();
        panel_pateria_prima = new javax.swing.JScrollPane();
        tabla_materia_prima = new javax.swing.JTable();
        panel_producto = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        panel_clientes = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(600, 590));
        setMinimumSize(new java.awt.Dimension(600, 590));
        setName("Listados"); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(600, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desplegable1.setFont(new java.awt.Font("Britannic Bold", 0, 18)); // NOI18N
        desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Materia Prima", "Clientes", "Productos" }));
        desplegable1.setBorder(null);
        desplegable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        desplegable1.setOpaque(false);
        desplegable1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegable1ItemStateChanged(evt);
            }
        });
        add(desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 350, -1));

        titulo2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        titulo2.setText("Seleccionar Categoría");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

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

        titulo6.setFont(new java.awt.Font("Britannic Bold", 0, 36)); // NOI18N
        titulo6.setText("Listados");
        add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setLayout(new java.awt.CardLayout());

        tabla_materia_prima.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_materia_prima.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        tabla_materia_prima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Unidad de Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_materia_prima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_materia_prima.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_materia_prima.setName("Materia Prima"); // NOI18N
        tabla_materia_prima.setOpaque(false);
        tabla_materia_prima.getTableHeader().setResizingAllowed(false);
        tabla_materia_prima.getTableHeader().setReorderingAllowed(false);
        panel_pateria_prima.setViewportView(tabla_materia_prima);

        base.add(panel_pateria_prima, "card2");

        tabla_productos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_productos.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio al Detal", "Precio al Mayor", "Precio Condominio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_productos.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_productos.setName("Productos"); // NOI18N
        tabla_productos.setOpaque(false);
        tabla_productos.getTableHeader().setResizingAllowed(false);
        tabla_productos.getTableHeader().setReorderingAllowed(false);
        panel_producto.setViewportView(tabla_productos);

        base.add(panel_producto, "card3");

        panel_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabla_clientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_clientes.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Documento de Identidad", "Teléfono", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_clientes.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_clientes.setName("Clientes"); // NOI18N
        tabla_clientes.setOpaque(false);
        tabla_clientes.getTableHeader().setResizingAllowed(false);
        tabla_clientes.getTableHeader().setReorderingAllowed(false);
        panel_clientes.setViewportView(tabla_clientes);

        base.add(panel_clientes, "card4");

        add(base, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 610, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed

        botones.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_volverActionPerformed

    private void desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegable1ItemStateChanged

        if (desplegable1.getSelectedItem().equals("Materia Prima")) {

            panel_pateria_prima.setVisible(true);
            panel_clientes.setVisible(false);
            panel_producto.setVisible(false);
        }

        if (desplegable1.getSelectedItem().equals("Clientes")) {

            panel_pateria_prima.setVisible(false);
            panel_clientes.setVisible(true);
            panel_producto.setVisible(false);
        }

        if (desplegable1.getSelectedItem().equals("Productos")) {

            panel_pateria_prima.setVisible(false);
            panel_clientes.setVisible(false);
            panel_producto.setVisible(true);
        }
    }//GEN-LAST:event_desplegable1ItemStateChanged

    JPanel botones;

    public void obtenerMatriz_mp() {

        OperarMateriaP op = new OperarMateriaP();
        ArrayList<Modelo> miLista = op.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) tabla_materia_prima.getModel();

        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombre_mp(), miLista.get(i).getPrecio_mp(), miLista.get(i).getUnidad_medida_mp()});
        }
    }

    public void obtenerMatriz_cli() {

        OperarClientes op = new OperarClientes();
        ArrayList<Modelo> miLista = op.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) tabla_clientes.getModel();

        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombre_cli(), miLista.get(i).getCi_cli(), miLista.get(i).getTelefono_cli(), miLista.get(i).getDireccion_cli()});
        }
    }
    
    public void obtenerMatriz_pro() {
        
        OperarProducto op = new OperarProducto();
        ArrayList<Modelo> miLista = op.llenar_listdo();
        DefaultTableModel model = (DefaultTableModel) tabla_productos.getModel();
        double detal, mayor, condominio;
        DecimalFormat df = new DecimalFormat("#.00");
        
        
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {
            
            detal = 0;
            mayor = 0;
            condominio = 0;
            
            detal = miLista.get(i).getPrecio_detal();
            mayor = detal - detal * 0.1;
            condominio = detal + detal * 0.1;
            
            model.addRow(new Object[]{miLista.get(i).getNombre_pro(), df.format(detal)+"$", df.format(mayor)+"$ ("+ miLista.get(i).getCantida_mayor()+" "+ miLista.get(i).getUni_med() +")", df.format(condominio)+"$"});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JComboBox<String> desplegable1;
    private javax.swing.JScrollPane panel_clientes;
    private javax.swing.JScrollPane panel_pateria_prima;
    private javax.swing.JScrollPane panel_producto;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JTable tabla_materia_prima;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo6;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
