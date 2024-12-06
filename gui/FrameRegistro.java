package gui;

import controlador.MySqlClienteDAO;
import controlador.MySqlUsuarioDAO;
import entidad.Cliente;
import entidad.Usuario;
import javax.swing.JOptionPane;

public class FrameRegistro extends javax.swing.JFrame {

    MySqlClienteDAO clientDao = new MySqlClienteDAO();
    MySqlUsuarioDAO userDao = new MySqlUsuarioDAO();
    
    private String pasarNombre;
    private String pasarApellido;

    public String getPasarNombre() {
        return pasarNombre;
    }

    public void setPasarNombre(String pasarNombre) {
        this.pasarNombre = pasarNombre;
    }

    public String getPasarApellido() {
        return pasarApellido;
    }

    public void setPasarApellido(String pasarApellido) {
        this.pasarApellido = pasarApellido;
    }
    
    


    public FrameRegistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnGenerarUsuario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro  ");

        jLabel2.setText("Ingrese nombre: ");

        jLabel3.setText("Ingrese apellido: ");

        jLabel4.setText("Constraseña: ");

        btnGenerarUsuario.setText("Generar Usuario");
        btnGenerarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuario");

        jButton2.setText("Atras");

        jButton3.setText("Limpiar");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefono:");

        jLabel7.setText("DNI:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(btnRegistrar)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(btnGenerarUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnGenerarUsuario))
                .addGap(18, 18, 18)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btnRegistrar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //variables
        String nombre, apellido, contrasenia, usuario, dni, telefono;

        //capturar variables usuario
        usuario = lblUsuario.getText();
        contrasenia = txtContrasenia.getText().strip();

        //capturar variables cliente
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        dni = txtDni.getText();
        telefono = txtTelefono.getText();
         setPasarNombre(nombre);
         setPasarApellido(apellido);
        //creacion de los objetos
        Cliente clie = new Cliente(nombre, apellido, telefono, dni);
        Usuario user = new Usuario(usuario, contrasenia);
        //mandar al MySqlClienteDAO
        
        if (clientDao.registroCliente_Usuario(clie, user) == true) {
            mensaje("Se registro correctamente");
            FrameLogin x=new FrameLogin();
            x.setVisible(true);
            x.setLocationRelativeTo(null);
            this.dispose();
        } else {
            mensaje("error en el registro");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGenerarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarUsuarioActionPerformed
        String nombre, apellido, usuario;
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        usuario = nombre.substring(0, 1) + apellido;
        lblUsuario.setText(usuario);
    }//GEN-LAST:event_btnGenerarUsuarioActionPerformed

    void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarUsuario;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
