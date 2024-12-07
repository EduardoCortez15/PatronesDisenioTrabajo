
package gui;

import controlador.MySqlAdministradorDAO;
import entidad.Administrador;
import factory.AdministradorFactory;
import interfaces.UsuarioFactory;
import javax.swing.JOptionPane;

public class FrameRegistroAdministrador extends javax.swing.JFrame {

    MySqlAdministradorDAO administradorDAO=new MySqlAdministradorDAO();
    
    private String userFrame;
    private String contraFrame;

    public String getUserFrame() {
        return userFrame;
    }

    public void setUserFrame(String userFrame) {
        this.userFrame = userFrame;
    }

    public String getContraFrame() {
        return contraFrame;
    }

    public void setContraFrame(String contraFrame) {
        this.contraFrame = contraFrame;
    }
    
    
    public FrameRegistroAdministrador() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnGenerarUsuario = new javax.swing.JButton();
        lblMostrarUsuario = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Registro Administrador");

        jLabel2.setText("Nombre : ");

        jLabel3.setText("Apellido :");

        btnGenerarUsuario.setText("Generar usuario");
        btnGenerarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarUsuarioActionPerformed(evt);
            }
        });

        lblMostrarUsuario.setText("jLabel4");

        jLabel4.setText("contraseña :");

        btnIniciar.setText("Iniciar ");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnAtras.setText("atras");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMostrarUsuario)
                    .addComponent(btnGenerarUsuario)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtContrasenia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnGenerarUsuario)
                .addGap(26, 26, 26)
                .addComponent(lblMostrarUsuario)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnAtras))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        String nombre,apellido,usuario,contrasenia;
        nombre=txtNombre.getText();
        apellido=txtApellido.getText();
        usuario=lblMostrarUsuario.getText();
        contrasenia=txtContrasenia.getText().strip();
        userFrame=usuario;
        contraFrame=contrasenia;
        UsuarioFactory factory=new AdministradorFactory();
        Administrador administrador=factory.crearAdministrador(usuario, contrasenia);
        administrador.setNombre(nombre);
        administrador.setApellido(apellido);
        if(administradorDAO.registrarAdministrador(administrador)==true){
            mensaje("Se registro correctamente");
            FrameLogin x=new FrameLogin();
            x.setVisible(true);
            x.setLocationRelativeTo(null);
        }else{
            mensaje("Error en el registro");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnGenerarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarUsuarioActionPerformed
      String nombre,apellido,usuario;
      nombre=txtNombre.getText();
      apellido=txtApellido.getText();
      usuario = nombre.substring(0, 1) + apellido;
      lblMostrarUsuario.setText(usuario);
      
    }//GEN-LAST:event_btnGenerarUsuarioActionPerformed

     public void mensaje(String mensaje){
         JOptionPane.showMessageDialog(null, mensaje);
     }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGenerarUsuario;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMostrarUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
