/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import vista.consultas.VerClientes;
import vista.consultas.VerCompras;
import vista.consultas.VerEmpleados;
import vista.consultas.VerProductos;
import vista.consultas.VerProveedores;
import vista.consultas.VerVentas;

/**
 *
 * @author admin
 */
public class Menu extends javax.swing.JFrame {

    static String hora, minutos, segundos;
    static Thread hilo;

    String nombreUsuario;
    String rol;

    private Dimension dim;

    /**
     * Creates new form Menu
     */
    public Menu(String nombreUsuario, String rol) {
        initComponents();
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;

        hacerTransparente();
        configurarFechaHora();
        mostrarMensajeBienvenida();

        ajustarDimensionesVentana();
        visibilizarSegunRol();
    }

    private void visibilizarSegunRol() {
        jButtonClientes.setVisible(false);
        jButtonProductos.setVisible(false);
        jButtonProveedores.setVisible(false);
        jButtonVentas.setVisible(false);
        jButtonCompras.setVisible(false);
        jButtonEmpleados.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jMenuItemVentas.setVisible(false);
        jMenuItemCompras.setVisible(false);
        jMenuItemProductos.setVisible(false);
        jMenuItemClientes.setVisible(false);
        jMenuItemProveedores.setVisible(false);
        jMenuItemEmpleados.setVisible(false);

        if (rol.equals("Empleado")) {
            jButtonCompras.setVisible(true);
            jButtonVentas.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jMenuItemVentas.setVisible(true);
            jMenuItemCompras.setVisible(true);
        }
        if (rol.equals("Encargado")) {
            jButtonCompras.setVisible(true);
            jButtonVentas.setVisible(true);
            jButtonProductos.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jMenuItemVentas.setVisible(true);
            jMenuItemCompras.setVisible(true);
            jMenuItemProductos.setVisible(true);
        }
        if (rol.equals("Directivo")) {
            jButtonClientes.setVisible(true);
            jButtonProductos.setVisible(true);
            jButtonProveedores.setVisible(true);
            jButtonVentas.setVisible(true);
            jButtonCompras.setVisible(true);
            jButtonEmpleados.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            jLabel14.setVisible(true);
            jMenuItemVentas.setVisible(true);
            jMenuItemCompras.setVisible(true);
            jMenuItemProductos.setVisible(true);
            jMenuItemClientes.setVisible(true);
            jMenuItemProveedores.setVisible(true);
            jMenuItemEmpleados.setVisible(true);
        }
    }

    /**
     * Configurar fecha y hora.
     */
    private void configurarFechaHora() {
        //Fecha
        jLabelFecha.setText(fecha());
        //Hora
        Hora hora = new Hora(jLabelHora);
        //Ejecución del hilo de hora
        hora.start();
    }

    /**
     * Mostrar mensaje de bienvenida a partir del nombre de usuario introducido.
     */
    private void mostrarMensajeBienvenida() {
        String mensajeBienvenida = "¡Bienvenido, " + nombreUsuario + "!";
        jLabelBienvenido.setText(mensajeBienvenida);
    }

    /**
     * Configurar fecha
     *
     * @return Fecha actual A partir de la fecha del sistema, se muestra con un
     * formato determinado.
     */
    public static String fecha() {
        //Instanciación de la fecha
        Date fecha = new Date();
        //Formato de la fecha
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        return simpleDateFormat.format(fecha);
    }

    private void verMenu(){
        Menu menu = new Menu(nombreUsuario, rol);
        menu.setVisible(true);
        this.setVisible(false);
    }
    
    private void verEmpleados(){
        VerEmpleados verEmpleados = new VerEmpleados(nombreUsuario, rol);
        verEmpleados.setVisible(true);
        this.setVisible(false);
    }
    
    private void verCompras(){
        VerCompras verCompras = new VerCompras(nombreUsuario, rol);
        verCompras.setVisible(true);
        this.setVisible(false);
    }
    
    private void verVentas(){
        VerVentas verVentas = new VerVentas(nombreUsuario, rol);
        verVentas.setVisible(true);
        this.setVisible(false);
    }
    
    private void verProveedores(){
        VerProveedores verProveedores = new VerProveedores(nombreUsuario, rol);
        verProveedores.setVisible(true);
        this.setVisible(false);
    }
    
    private void verClientes(){
        VerClientes verClientes = new VerClientes(nombreUsuario, rol);
        verClientes.setVisible(true);
        this.setVisible(false);
    }
    
    private void verProductos(){
        VerProductos verProductos = new VerProductos(nombreUsuario, rol);
        verProductos.setVisible(true);
        this.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEmpleados = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButtonProveedores = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButtonCompras = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButtonVentas = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButtonProductos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVer = new javax.swing.JMenu();
        jMenuItemMenuPrincipal = new javax.swing.JMenuItem();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenuItemProveedores = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemCompras = new javax.swing.JMenuItem();
        jMenuItemVentas = new javax.swing.JMenuItem();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(53, 70, 92));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(103, 125, 152));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_home_30px.png"))); // NOI18N

        jButtonMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(240, 240, 240));
        jButtonMenu.setText("Menú principal");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButtonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 437, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 437, -1));

        jPanel6.setBackground(new java.awt.Color(53, 70, 92));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_permanent_job_32px.png"))); // NOI18N

        jButtonEmpleados.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonEmpleados.setForeground(new java.awt.Color(240, 240, 240));
        jButtonEmpleados.setText("Empleados");
        jButtonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, -1, -1));

        jPanel7.setBackground(new java.awt.Color(53, 70, 92));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_supplier_24px.png"))); // NOI18N

        jButtonProveedores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonProveedores.setForeground(new java.awt.Color(240, 240, 240));
        jButtonProveedores.setText("Proveedores");
        jButtonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 437, -1));

        jPanel14.setBackground(new java.awt.Color(53, 70, 92));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_customer_insight_30px.png"))); // NOI18N

        jButtonClientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(240, 240, 240));
        jButtonClientes.setText("Clientes");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 437, -1));

        jPanel15.setBackground(new java.awt.Color(53, 70, 92));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_buy_30px.png"))); // NOI18N

        jButtonCompras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonCompras.setForeground(new java.awt.Color(240, 240, 240));
        jButtonCompras.setText("Compras");
        jButtonCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 437, -1));

        jPanel16.setBackground(new java.awt.Color(53, 70, 92));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_price_26px.png"))); // NOI18N

        jButtonVentas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonVentas.setForeground(new java.awt.Color(240, 240, 240));
        jButtonVentas.setText("Ventas");
        jButtonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 437, -1));

        jPanel17.setBackground(new java.awt.Color(53, 70, 92));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_box_32px.png"))); // NOI18N

        jButtonProductos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonProductos.setForeground(new java.awt.Color(240, 240, 240));
        jButtonProductos.setText("Productos");
        jButtonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 437, -1));

        jPanel3.setBackground(new java.awt.Color(103, 125, 152));

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(240, 240, 240));
        jLabelBienvenido.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabelBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabelBienvenido)
                .addGap(56, 56, 56))
        );

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelFecha.setText("jLabel1");

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 0, 100)); // NOI18N
        jLabelHora.setText("jLabel2");

        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cerrar sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelFecha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelHora)
                                .addGap(196, 196, 196))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLogout)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHora)
                .addGap(77, 77, 77))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuVer.setText("Ver");
        jMenuVer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemMenuPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemMenuPrincipal.setText("Menú principal");
        jMenuItemMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMenuPrincipalActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemMenuPrincipal);

        jMenuItemEmpleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemEmpleados.setText("Empleados");
        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemEmpleados);

        jMenuItemProveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProveedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemProveedores.setText("Proveedores");
        jMenuItemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProveedoresActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemProveedores);

        jMenuItemClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemClientes);

        jMenuItemCompras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCompras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemCompras.setText("Compras");
        jMenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComprasActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemCompras);

        jMenuItemVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemVentas.setText("Ventas");
        jMenuItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVentasActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemVentas);

        jMenuItemProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenuVer.add(jMenuItemProductos);

        jMenuBar1.add(jMenuVer);

        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAyuda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemAyuda.setText("Obtener ayuda");
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAyuda);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción del botón del cierre de sesión
     *
     * @param evt Pulsar el botón cerrar sesión
     */
    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    /**
     * Cargar pantalla de menú principal
     *
     * @param evt Pulsar el botón "Menú principal"
     */
    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        verMenu();
    }//GEN-LAST:event_jButtonMenuActionPerformed

    /**
     * Abrir la gestión de empleados
     *
     * @param evt Pulsar el botón "Empleados"
     */
    private void jButtonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadosActionPerformed
        verEmpleados();
    }//GEN-LAST:event_jButtonEmpleadosActionPerformed

    private void jButtonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProveedoresActionPerformed
        verProveedores();
    }//GEN-LAST:event_jButtonProveedoresActionPerformed

    /**
     * Abrir la gestión de clientes
     *
     * @param evt Pulsar el botón "Clientes"
     */
    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        verClientes();
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprasActionPerformed
        verCompras();
    }//GEN-LAST:event_jButtonComprasActionPerformed

    private void jButtonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentasActionPerformed
        verVentas();
    }//GEN-LAST:event_jButtonVentasActionPerformed

    /**
     * Ver Menú principal
     * @param evt Pulsar botón de ver menú principal desde el menú
     */
    private void jButtonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductosActionPerformed
        verProductos();
    }//GEN-LAST:event_jButtonProductosActionPerformed

    private void jMenuItemMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMenuPrincipalActionPerformed
        verMenu();
    }//GEN-LAST:event_jMenuItemMenuPrincipalActionPerformed

    /**
     * Ver empleados desde menú
     * @param evt Pulsar botón de ver empleados desde el menú
     */
    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpleadosActionPerformed
        verEmpleados();
    }//GEN-LAST:event_jMenuItemEmpleadosActionPerformed

    /**
     * Ver proveedores desde menú
     * @param evt Pulsar botón de ver proveedores desde el menú
     */
    private void jMenuItemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProveedoresActionPerformed
        verProveedores();
    }//GEN-LAST:event_jMenuItemProveedoresActionPerformed

    /**
     * Ver clientes desde menú
     * @param evt Pulsar botón de ver clientes desde el menú
     */
    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        verClientes();
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    /**
     * Ver compras desde menú
     * @param evt Pulsar botón de ver compras desde el menú
     */
    private void jMenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComprasActionPerformed
        verCompras();
    }//GEN-LAST:event_jMenuItemComprasActionPerformed

    /**
     * Ver ventas desde menú
     * @param evt Pulsar botón de ver ventas desde el menú
     */
    private void jMenuItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVentasActionPerformed
        verVentas();
    }//GEN-LAST:event_jMenuItemVentasActionPerformed

    /**
     * Ver productos desde menú
     * @param evt Pulsar botón de ver productos desde el menú
     */
    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        verProductos();
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    /**
     * Ver ayudas desde menú
     * @param evt Pulsar botón de ver ayudas desde el menú
     */
    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed
        try {
            File f = new File("./ayudas/ayuda.pdf");
            if(f.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(f);
                }
                else{
                    System.err.println("No soportado");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al abrir la ayuda");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    /**
     * Modificar la opacidad y el relleno de los botones.
     *
     * Hacer todos los botones del menú transparentes e incoloros
     */
    public void hacerTransparente() {
        jButtonMenu.setOpaque(false);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.setBorderPainted(false);

        jButtonEmpleados.setOpaque(false);
        jButtonEmpleados.setContentAreaFilled(false);
        jButtonEmpleados.setBorderPainted(false);

        jButtonProveedores.setOpaque(false);
        jButtonProveedores.setContentAreaFilled(false);
        jButtonProveedores.setBorderPainted(false);

        jButtonClientes.setOpaque(false);
        jButtonClientes.setContentAreaFilled(false);
        jButtonClientes.setBorderPainted(false);

        jButtonCompras.setOpaque(false);
        jButtonCompras.setContentAreaFilled(false);
        jButtonCompras.setBorderPainted(false);

        jButtonVentas.setOpaque(false);
        jButtonVentas.setContentAreaFilled(false);
        jButtonVentas.setBorderPainted(false);

        jButtonProductos.setOpaque(false);
        jButtonProductos.setContentAreaFilled(false);
        jButtonProductos.setBorderPainted(false);
    }

    /**
     * Adaptar la ventana a partir de las dimensiones de la pantalla en la que
     * se ejecuta el programa.
     */
    private void ajustarDimensionesVentana() {
        dim = super.getToolkit().getScreenSize();
        super.setSize(dim);
        super.setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            String nombreUsuario;
            String rol;

            public void run() {
                new Menu(nombreUsuario, rol).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonCompras;
    private javax.swing.JButton jButtonEmpleados;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonProductos;
    private javax.swing.JButton jButtonProveedores;
    private javax.swing.JButton jButtonVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemCompras;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemMenuPrincipal;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemProveedores;
    private javax.swing.JMenuItem jMenuItemVentas;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
