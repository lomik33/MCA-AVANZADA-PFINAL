package interfaz;

import entidades.Cliente;
import entidades.Cotizacion;
import entidades.Producto;
import entidades.ProductoCotizacion;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import managers.ClienteManager;
import managers.ProductoManager;
import utils.Banxico;

/**
 *
 * @author alexismartinez
 */
public class Desktop extends javax.swing.JFrame {

    ProductoManager manager;
    ClienteManager clienteM;
    List<ProductoCotizacion> productos;

    /**
     * Creates new form Desktop
     */
    public Desktop() {
        initComponents();
        manager = new ProductoManager();
        clienteM = new ClienteManager();
        this.setLocationRelativeTo(this);
        this.jpnCotizar.setVisible(true);
        this.jpnDatos.setVisible(false);
        this.jpnInicio.setVisible(false);

        manager.toSelect().forEach(l -> this.jcbCurso.addItem(l));
        clienteM.toSelect().forEach(c -> this.jcbCliente.addItem(c));

        Date now = new Date(System.currentTimeMillis());

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

        this.lblFecha.setText(date.format(now));

        productos = new ArrayList<>();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmOpciones = new javax.swing.JPopupMenu();
        Vaciar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jpnMenu = new javax.swing.JPanel();
        btnCotizar = new javax.swing.JButton();
        btnBaseDatos = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jpnEscritorio = new javax.swing.JPanel();
        jpnDatos = new javax.swing.JPanel();
        txtCargarClientes = new javax.swing.JTextField();
        txtCargarServicios = new javax.swing.JTextField();
        btnClientes = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        jpnCotizar = new javax.swing.JPanel();
        jcbCurso = new javax.swing.JComboBox<>();
        lblServicios = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbServiciosAgregados = new javax.swing.JTable();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecioUSD = new javax.swing.JLabel();
        lblPrecioMX = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        lblTipoCambio = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGenerarCotizacion = new javax.swing.JButton();
        jpnInicio = new javax.swing.JPanel();

        Vaciar.setText("jMenuItem1");
        Vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaciarActionPerformed(evt);
            }
        });
        jpmOpciones.add(Vaciar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jpmOpciones.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnMenu.setBackground(new java.awt.Color(102, 102, 255));
        jpnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCotizar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnCotizar.setText("COTIZAR");
        btnCotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        jpnMenu.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        btnBaseDatos.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnBaseDatos.setText("BASE DE DATOS");
        btnBaseDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaseDatosActionPerformed(evt);
            }
        });
        jpnMenu.add(btnBaseDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 200, 40));

        btnCerrar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnCerrar.setText("X");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jpnMenu.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        btnMinimizar.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnMinimizar.setText("_");
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        jpnMenu.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 0, 40, 40));

        getContentPane().add(jpnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jpnEscritorio.setBackground(new java.awt.Color(255, 255, 255));
        jpnEscritorio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jpnEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnDatos.setBackground(new java.awt.Color(255, 255, 255));
        jpnDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpnDatos.add(txtCargarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 40));
        jpnDatos.add(txtCargarServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 310, 40));

        btnClientes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnClientes.setText("Cliente");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jpnDatos.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, 40));

        btnServicios.setText("Servicios");
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jpnDatos.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 100, 40));

        jpnEscritorio.add(jpnDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 996, 656));

        jpnCotizar.setBackground(new java.awt.Color(255, 255, 255));
        jpnCotizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbCurso.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jcbCurso.setName(""); // NOI18N
        jcbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoActionPerformed(evt);
            }
        });
        jpnCotizar.add(jcbCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 700, 40));

        lblServicios.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblServicios.setText("Curso:");
        jpnCotizar.add(lblServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jpnCotizar.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 160, 90));

        jtbServiciosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Cantidad", "Precio MX", "Precio USD", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbServiciosAgregados.setComponentPopupMenu(jpmOpciones);
        jScrollPane1.setViewportView(jtbServiciosAgregados);
        if (jtbServiciosAgregados.getColumnModel().getColumnCount() > 0) {
            jtbServiciosAgregados.getColumnModel().getColumn(0).setResizable(false);
            jtbServiciosAgregados.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtbServiciosAgregados.getColumnModel().getColumn(1).setResizable(false);
            jtbServiciosAgregados.getColumnModel().getColumn(1).setPreferredWidth(500);
            jtbServiciosAgregados.getColumnModel().getColumn(2).setResizable(false);
            jtbServiciosAgregados.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtbServiciosAgregados.getColumnModel().getColumn(3).setResizable(false);
            jtbServiciosAgregados.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtbServiciosAgregados.getColumnModel().getColumn(4).setResizable(false);
            jtbServiciosAgregados.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtbServiciosAgregados.getColumnModel().getColumn(5).setResizable(false);
            jtbServiciosAgregados.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jpnCotizar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 790, 310));

        lblDescripcion.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblDescripcion.setText("Descripcion:");
        jpnCotizar.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lblPrecioUSD.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblPrecioUSD.setText("Precio USD:");
        jpnCotizar.add(lblPrecioUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 200, 30));

        lblPrecioMX.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblPrecioMX.setText("Precio MX:");
        jpnCotizar.add(lblPrecioMX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 30));
        jpnCotizar.add(jcbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 880, 40));

        lblCliente.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblCliente.setText("Cliente:");
        jpnCotizar.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblTipoCambio.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblTipoCambio.setText("Tipo Cambio:");
        jpnCotizar.add(lblTipoCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 200, 30));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jpnCotizar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 660, 90));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel2.setText("Total:");
        jpnCotizar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, -1, 30));
        jpnCotizar.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 140, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setText("Subtotal:");
        jpnCotizar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("Impuesto:");
        jpnCotizar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, -1));
        jpnCotizar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 150, 30));
        jpnCotizar.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 150, 30));

        lblFecha.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jpnCotizar.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 110, 20));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("N˚Cotizacion:");
        jpnCotizar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        txtCantidad.setText("1");
        jpnCotizar.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 80, 40));

        jLabel5.setText("Cantidad:");
        jpnCotizar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));

        btnGenerarCotizacion.setText("Cotizar");
        btnGenerarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCotizacionActionPerformed(evt);
            }
        });
        jpnCotizar.add(btnGenerarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, -1, -1));

        jpnEscritorio.add(jpnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 996, 656));

        jpnInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpnEscritorio.add(jpnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 996, 656));

        getContentPane().add(jpnEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int producSelec = this.jtbServiciosAgregados.getSelectedRow();
        if (producSelec > 0) {
            this.productos.remove(producSelec - 1);
            this.actualizaTabla();
            JOptionPane.showMessageDialog(null, "Producto eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }

//        JOptionPane.showMessageDialog(null, this.jtbServiciosAgregados.getSelectedRow());

    }//GEN-LAST:event_EliminarActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File fichero = fc.getSelectedFile();
        if (fichero != null) {
            txtCargarServicios.setText(fichero.getAbsolutePath());
            try {
                int totalImportados = ProductoManager.importarCsv(fichero);
                JOptionPane.showMessageDialog(this, "Se importaron/actualizaron: " + totalImportados + " productos correctamente.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        this.jpnCotizar.setVisible(true);
        this.jpnDatos.setVisible(false);
        this.jpnInicio.setVisible(false);
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void btnBaseDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaseDatosActionPerformed
        this.jpnCotizar.setVisible(false);
        this.jpnDatos.setVisible(true);
        this.jpnInicio.setVisible(false);
    }//GEN-LAST:event_btnBaseDatosActionPerformed

    private void jcbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoActionPerformed

        if (this.jcbCurso.getSelectedItem() instanceof Producto) {
            Producto productoSeleccionado = (Producto) this.jcbCurso.getSelectedItem();
            this.txtDescripcion.setText(productoSeleccionado.getDescripcion());
            this.lblPrecioMX.setText(" ");
            this.lblPrecioMX.setText("Precio MX: " + Double.toString(productoSeleccionado.getPrecioUnitario()));
            this.lblPrecioUSD.setText(" ");
            this.lblPrecioUSD.setText("Precio USD: " + Double.toString(productoSeleccionado.getPrecioUnitarioUsd()));
            this.lblTipoCambio.setText(" ");
            try {
                this.lblTipoCambio.setText("Tipo de Cambio: " + Double.toString(Banxico.getTipoCambioUsd()));
            } catch (Exception ex) {
                Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jcbCursoActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File fichero = fc.getSelectedFile();
        if (fichero != null) {
            txtCargarClientes.setText(fichero.getAbsolutePath());
            try {
                int totalImportados = ClienteManager.importarCsv(fichero);
                JOptionPane.showMessageDialog(this, "Se importaron/actualizaron: " + totalImportados + " clientes correctamente.");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (this.jcbCurso.getSelectedItem() instanceof Producto) {
            Producto productoSeleccionado = (Producto) this.jcbCurso.getSelectedItem();
            ProductoCotizacion productoCotizacion = new ProductoCotizacion();
            productoCotizacion.setClave(productoSeleccionado.getClave());
            productoCotizacion.setNombre(productoSeleccionado.getNombre());
            productoCotizacion.setDescripcion(productoSeleccionado.getDescripcion());
            productoCotizacion.setPrecioUnitario(productoSeleccionado.getPrecioUnitario());
            productoCotizacion.setPrecioUnitarioUsd(productoSeleccionado.getPrecioUnitarioUsd());
            productoCotizacion.setAplicaUsd(productoSeleccionado.isAplicaUsd());
            productoCotizacion.setCantidad(Integer.parseInt(this.txtCantidad.getText()));
            try {
                productoCotizacion.setTipoCambio(Banxico.getTipoCambioUsd());
            } catch (Exception ex) {
                Logger.getLogger(Desktop.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (productoSeleccionado.isAplicaUsd()) {
                productoCotizacion.setPrecioUnitario(productoCotizacion.getPrecioUnitarioUsd() * productoCotizacion.getTipoCambio());
            }
            productoCotizacion.setImpuesto((productoCotizacion.getCantidad() * productoCotizacion.getPrecioUnitario()) * productoSeleccionado.getTasaIva());
            productoCotizacion.setSubtotal(productoCotizacion.getCantidad() * productoCotizacion.getPrecioUnitario());
            productoCotizacion.setImporte(productoCotizacion.getImpuesto() + productoCotizacion.getSubtotal());
            this.productos.add(productoCotizacion);
            this.actualizaTabla();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void VaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaciarActionPerformed
        productos.clear();
        this.actualizaTabla();
    }//GEN-LAST:event_VaciarActionPerformed

    private void btnGenerarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCotizacionActionPerformed
        Cotizacion cotizar = new Cotizacion();
        if (this.jcbCliente.getSelectedItem() instanceof Cliente) {
            Cliente c = (Cliente) this.jcbCliente.getSelectedItem();
            cotizar.setCliente(c);
        }
        cotizar.setFecha(LocalDateTime.now());
        if (this.productos != null) {
            this.productos.forEach(lamda -> cotizar.getItems().add(lamda));
        }

    }//GEN-LAST:event_btnGenerarCotizacionActionPerformed

    private void actualizaTabla() {

        ProductoCotizacionTableModel model = new ProductoCotizacionTableModel();
        double total = 0;
        double subtotal = 0;
        double impuesto = 0;
        for (ProductoCotizacion pc : this.productos) {
            total += pc.getImporte();
            subtotal += pc.getSubtotal();
            impuesto += pc.getImpuesto();

        }

        model.actualiza(productos);
        this.jtbServiciosAgregados.setModel(model);
        this.jTextField1.setText(Double.toString(impuesto));
        this.jTextField2.setText(Double.toString(subtotal));
        this.txtTotal.setText(Double.toString(total));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Vaciar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBaseDatos;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnGenerarCotizacion;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<entidades.Cliente> jcbCliente;
    private javax.swing.JComboBox<entidades.Producto> jcbCurso;
    private javax.swing.JPopupMenu jpmOpciones;
    private javax.swing.JPanel jpnCotizar;
    private javax.swing.JPanel jpnDatos;
    private javax.swing.JPanel jpnEscritorio;
    private javax.swing.JPanel jpnInicio;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JTable jtbServiciosAgregados;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblPrecioMX;
    private javax.swing.JLabel lblPrecioUSD;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblTipoCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCargarClientes;
    private javax.swing.JTextField txtCargarServicios;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
