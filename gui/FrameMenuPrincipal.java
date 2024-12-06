
package gui;


public class FrameMenuPrincipal extends javax.swing.JFrame {

   
    public FrameMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblMostrarNombreApellido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Salir");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 99, -1));
        jPanel1.add(lblMostrarNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 270, 20));

        jLabel6.setText("-Abarrotes-");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel7.setText("-Bebidas-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel8.setText("-Licores-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        jLabel9.setText("-Electrodomesticos-");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\bebidas.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\abarrotes.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\electrodomesticos.png")); // NOI18N
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\licores.png")); // NOI18N
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 191, -1, 120));

        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\home1.png")); // NOI18N
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\menu2.png")); // NOI18N
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\combobox2.png")); // NOI18N
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\login2.png")); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\OneDrive\\Escritorio\\imagenes\\carrocompra6.png")); // NOI18N
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       FrameLogin x=new FrameLogin();
       x.setVisible(true);
       x.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrameBebidas d = new FrameBebidas();
        d.setVisible(true);
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblMostrarNombreApellido;
    // End of variables declaration//GEN-END:variables
}
