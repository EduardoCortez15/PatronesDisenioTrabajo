
package gui;

public class FrameAbarrotes extends javax.swing.JFrame {

 
    public FrameAbarrotes() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFideo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar1 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        btnCompraUnitaria1 = new javax.swing.JButton();
        btnCompraUnitaria2 = new javax.swing.JButton();
        btnCompraUnitaria3 = new javax.swing.JButton();
        spiner1 = new javax.swing.JSpinner();
        spiner2 = new javax.swing.JSpinner();
        spiner3 = new javax.swing.JSpinner();
        lblLenteja = new javax.swing.JLabel();
        lblAceite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Abarrotes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 72, -1));

        jLabel2.setText("Lentejas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 54, -1));

        jLabel3.setText("Fideos ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 53, -1));

        jLabel4.setText("Aceite");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 37, -1));

        lblFideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fideos.png"))); // NOI18N
        getContentPane().add(lblFideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 110, 120));

        jButton1.setText("Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        jButton2.setText("Ir carrito");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 113, -1));

        jLabel8.setText("Precio :  4.00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel9.setText("Precio :  3.00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jLabel10.setText("Precio : 8.00");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 79, -1));

        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        btnAgregar2.setText("Agregar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        btnAgregar3.setText("Agregar");
        getContentPane().add(btnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        btnCompraUnitaria1.setText("Compra unitaria");
        btnCompraUnitaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        btnCompraUnitaria2.setText("Compra unitaria");
        getContentPane().add(btnCompraUnitaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        btnCompraUnitaria3.setText("Compra unitaria");
        getContentPane().add(btnCompraUnitaria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));
        getContentPane().add(spiner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 45, -1));
        getContentPane().add(spiner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 45, -1));
        getContentPane().add(spiner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 46, -1));

        lblLenteja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lentejas.png"))); // NOI18N
        getContentPane().add(lblLenteja, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        lblAceite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/aceite.png"))); // NOI18N
        getContentPane().add(lblAceite, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnCompraUnitaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria1ActionPerformed
       FrameCarrito x=new FrameCarrito();
       x.setVisible(true);
       x.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnCompraUnitaria1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FrameMenuPrincipal_1 x=new FrameMenuPrincipal_1();
       x.setVisible(true);
       x.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnCompraUnitaria1;
    private javax.swing.JButton btnCompraUnitaria2;
    private javax.swing.JButton btnCompraUnitaria3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAceite;
    private javax.swing.JLabel lblFideo;
    private javax.swing.JLabel lblLenteja;
    private javax.swing.JSpinner spiner1;
    private javax.swing.JSpinner spiner2;
    private javax.swing.JSpinner spiner3;
    // End of variables declaration//GEN-END:variables
}
