/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.inserciones;

import vista.consultas.*;
import controlador.crud.Insertar;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Vista de inserción de clientes
 *
 * @author admin
 */
public class InsertarCliente extends javax.swing.JFrame {

    //Declaración de constantes
    static final int LIMITE_NOMBRE = 25;
    static final int LIMITE_APELLIDOS = 60;
    static final int LIMITE_DNI = 9;
    static final int LIMITE_TELEFONO = 9;
    static final int LIMITE_DIRECCION = 50;
    static final int LIMITE_CODPOSTAL = 11;

    //Declaración de variables
    private Dimension dim;
    String nombreUsuario;
    String rol;
    DefaultListModel dlm;
    Insertar inserciones;
    ButtonGroup bg;

    /**
     * Creates new form VerClientes
     */
    public InsertarCliente(String nombreUsuario, String rol) {
        initComponents();
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
        inserciones = new Insertar();

        ajustarDimensionesVentana();
        establecerImagenPorDefecto();
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
        jPanel9 = new javax.swing.JPanel();
        jLabelBienvenido = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCodPostal = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonCargarImagen = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEdicion = new javax.swing.JMenu();
        jMenuItemAceptar = new javax.swing.JMenuItem();
        jMenuItemCancelar = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(103, 125, 152));

        jLabelBienvenido.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(240, 240, 240));
        jLabelBienvenido.setText("Insertar cliente");

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_return_80px.png"))); // NOI18N
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabelBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(212, 212, 212))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabelBienvenido))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("DNI:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Teléfono:");

        jTextFieldApellidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTelefono)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellidos))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Datos de dirección:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Datos personales:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Código postal:");

        jTextFieldCodPostal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Ciudad:");

        jTextFieldCiudad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextFieldCodPostal)
                    .addComponent(jTextFieldDireccion))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel12.setText("Imagen:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonCargarImagen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCargarImagen.setText("Cargar imagen");
        jButtonCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jButtonCargarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCargarImagen))
        );

        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_checked_64px.png"))); // NOI18N
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_cancel_64px.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(320, 320, 320))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAceptar)
                            .addComponent(jButtonCancelar))
                        .addGap(0, 127, Short.MAX_VALUE))))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuEdicion.setText("Edición");
        jMenuEdicion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemAceptar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemAceptar.setText("Aceptar");
        jMenuItemAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAceptarActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemAceptar);

        jMenuItemCancelar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemCancelar.setText("Cancelar");
        jMenuItemCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCancelarActionPerformed(evt);
            }
        });
        jMenuEdicion.add(jMenuItemCancelar);

        jMenuBar1.add(jMenuEdicion);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción del botón de "Volver"
     *
     * @param evt Pulsar el botón "Volver" Cancela el relleno de formulario y
     * retorna al usuario a la ventana de consulta
     */
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        //Diólogo de confirmación
        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de que deseas volver?", "Cancelar", JOptionPane.YES_NO_OPTION);
        //Si decide borrar
        if (opcion == 0) {
            VerClientes verClientes = new VerClientes(nombreUsuario,rol);
            verClientes.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_VolverActionPerformed

    /**
     * Acción del botón aceptar
     *
     * @param evt Pulsar el botón de aceptar Inserta un nuevo cliente según los
     * datos insertados
     */
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        aceptar();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void aceptar(){
        //Comprobar si todos los datos se han introducido correctamente
        if (nombreValido() && apellidosValido() && dniValido() && telefonoValido() && direccionValida() && codPostalValido()) {
            if (leerTelefono() > 0 && leerCodPostal() > 0) {
                //Inserción de datos
                inserciones.guardarCliente(jTextFieldNombre.getText(), jTextFieldDni.getText(), Integer.parseInt(jTextFieldTelefono.getText()), jTextFieldDireccion.getText(), jTextFieldCiudad.getText(), Integer.parseInt(jTextFieldCodPostal.getText()), convertirImagen());
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la inserción", "Error de introducción de datos", ERROR_MESSAGE);
        }
    }
    /**
     * Limpiar campos
     */
    private void limpiarCampos() {
        jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldDni.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldCodPostal.setText("");
        jTextFieldCiudad.setText("");
        establecerImagenPorDefecto();
    }

    /**
     * Acción del botón de "Cargar imagen"
     *
     * @param evt Pulsar el botón "Cargar imagen" Abre el explorador de archivos
     * y coloca una imagen en una etiqueta
     */
    private void jButtonCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarImagenActionPerformed
        //Selector de archivos
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Buscar imagen");

        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = new File(fc.getSelectedFile().toString());

            //Poner imagen seleccionada en el jLabel
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabelImagen, fc.getSelectedFile().toString());
        }
    }//GEN-LAST:event_jButtonCargarImagenActionPerformed

    /**
     * Convierte la imagen establecida en el jLabel en un array de bytes
     *
     * @return array de bytes de la imagen
     */
    private byte[] convertirImagen() {
        try {
            //Obtener imagen del JLabel
            ImageIcon icon = (ImageIcon) jLabelImagen.getIcon();
            BufferedImage image = new BufferedImage(icon.getIconWidth(),
                    icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);

            //Creación de la representación gráfica de la imagen
            Graphics2D g2 = image.createGraphics();
            g2.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
            g2.dispose();

            //Archivo para su guardado de modo auxiliar
            File f = new File("image.png");
            ImageIO.write(image, "png", f);

            //A partir de la imagen guardada localmente, se convierte a un array de bytes
            byte[] imagenEnBytes = Files.readAllBytes(f.toPath());
            return imagenEnBytes;
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
        return null;
    }

    /**
     * Acción del botón cancelar
     *
     * @param evt Pulsar el botón "Cancelar" Limpia los campos
     */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void cancelar(){
        //Mensaje de confirmación
        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de que deseas cancelar el relleno del formulario? Los campos escritos serán vaciados", "Cancelar", JOptionPane.YES_NO_OPTION);
        //Si decide borrar
        if (opcion == 0) {
            limpiarCampos();
        }
    }
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

    private void jMenuItemAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAceptarActionPerformed
        aceptar();
    }//GEN-LAST:event_jMenuItemAceptarActionPerformed

    private void jMenuItemCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_jMenuItemCancelarActionPerformed

    /**
     * Validación del campo nombre
     *
     * @return valor booleano. true si es válido Comprueba el límite de la
     * longitud de caracteres permitida por la base de datos
     */
    private boolean nombreValido() {
        if (jTextFieldNombre.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "El campo \"Nombre\" no puede estar vacío", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        if (jTextFieldNombre.getText().length() > LIMITE_NOMBRE) {
            JOptionPane.showMessageDialog(null, "El campo \"Nombre\" no puede exceder de " + LIMITE_NOMBRE + " caracteres ", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Validación del campo apellidos
     *
     * @return valor booleano. true si es válido Comprueba el límite de la
     * longitud de caracteres permitida por la base de datos
     */
    private boolean apellidosValido() {
        if (jTextFieldApellidos.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "El campo \"Apellidos\" no puede estar vacío", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        if (jTextFieldApellidos.getText().length() > LIMITE_APELLIDOS) {
            JOptionPane.showMessageDialog(null, "El campo \"Apellidos\" no puede exceder de " + LIMITE_APELLIDOS + " caracteres ", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Validación del campo DNI
     *
     * @return valor booleano. true si es válido Comprueba el límite de la
     * longitud de caracteres permitida por la base de datos
     */
    private boolean dniValido() {
        if (jTextFieldDni.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "El campo \"DNI\" no puede estar vacío", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        if (jTextFieldDni.getText().length() > LIMITE_DNI) {
            JOptionPane.showMessageDialog(null, "El campo \"DNI\" no puede exceder de " + LIMITE_DNI + " caracteres ", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Validación del campo Teléfono
     *
     * @return valor booleano. true si es válido Comprueba el límite de la
     * longitud de caracteres permitida por la base de datos
     */
    private boolean telefonoValido() {
        if (jTextFieldTelefono.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "El campo \"Teléfono\" no puede estar vacío", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        if (jTextFieldTelefono.getText().length() > LIMITE_TELEFONO) {
            JOptionPane.showMessageDialog(null, "El campo \"Teléfono\" no puede exceder de " + LIMITE_TELEFONO + " caracteres ", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Validación del campo Dirección
     *
     * @return valor booleano. true si es válido Comprueba el límite de la
     * longitud de caracteres permitida por la base de datos
     */
    private boolean direccionValida() {
        if (jTextFieldDireccion.getText().length() > LIMITE_DIRECCION) {
            JOptionPane.showMessageDialog(null, "El campo \"Dirección\" no puede exceder de " + LIMITE_DIRECCION + " caracteres ", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Validación del campo Código postal
     *
     * @return valor booleano. true si es válido Comprueba el límite de la
     * longitud de caracteres permitida por la base de datos
     */
    private boolean codPostalValido() {
        if (jTextFieldCodPostal.getText().length() > LIMITE_CODPOSTAL) {
            JOptionPane.showMessageDialog(null, "El campo \"Código postal\" no puede exceder de " + LIMITE_CODPOSTAL + " caracteres ", "Error de introducción de datos", ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Método de lectura para el código postal.
     *
     * @return valor Integer El código postal, al ser un campo entero en la base
     * de datos, requiere una conversión explícita.
     */
    private Integer leerCodPostal() {
        String codPostalCadena = jTextFieldCodPostal.getText();
        try {
            Integer codPostal = Integer.parseInt(codPostalCadena);
            return codPostal;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "El campo \"Código postal\" debe de ser un número entero", "Error de introducción de datos", ERROR_MESSAGE);
        }
        return -1;
    }

    /**
     * Método de lectura para el Teléfono.
     *
     * @return valor Integer El teléfono, al ser un campo entero en la base de
     * datos, requiere una conversión explícita.
     */
    private Integer leerTelefono() {
        String telefonoCad = jTextFieldTelefono.getText();
        try {
            Integer telefono = Integer.parseInt(telefonoCad);
            return telefono;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "El campo \"Teléfono\" debe de ser un número entero", "Error de introducción de datos", ERROR_MESSAGE);
        }
        return -1;
    }

    /**
     * Poner una imagen por defecto
     */
    private void establecerImagenPorDefecto() {
        //Creación de archivo a partir de ruta relativa
        String nombreArchivo = "Imagen_no_disponible.svg.png";
        File archivo = new File(nombreArchivo);

        //Poner imagen seleccionada en el jLabel
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabelImagen, nombreArchivo);
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
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            String nombreUsuario;
            String rol;

            public void run() {
                new InsertarCliente(nombreUsuario,rol).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonCargarImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdicion;
    private javax.swing.JMenuItem jMenuItemAceptar;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCodPostal;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
