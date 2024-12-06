
package gui;

public class FrameLicores extends javax.swing.JFrame {

   
    public FrameLicores() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        btnCompraUnitaria1 = new javax.swing.JButton();
        btnCompraUnitaria2 = new javax.swing.JButton();
        btnCompraUnitaria3 = new javax.swing.JButton();
        spiner3 = new javax.swing.JSpinner();
        spiner2 = new javax.swing.JSpinner();
        spiner1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Licores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 79, -1));

        jLabel2.setText("Black Label ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel3.setText("Blue Label ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel4.setText("Red Label ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jButton1.setText("Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jButton2.setText("Ir carrito");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        btnAgregar1.setText("Agregar");
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        btnAgregar2.setText("Agregar");
        getContentPane().add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        btnAgregar3.setText("Agregar");
        getContentPane().add(btnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        btnCompraUnitaria1.setText("Compra unitaria");
        getContentPane().add(btnCompraUnitaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        btnCompraUnitaria2.setText("Compra unitaria");
        getContentPane().add(btnCompraUnitaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        btnCompraUnitaria3.setText("Compra unitaria");
        getContentPane().add(btnCompraUnitaria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));
        getContentPane().add(spiner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 40, -1));
        getContentPane().add(spiner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 40, -1));
        getContentPane().add(spiner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 40, -1));

        jLabel9.setText("Precio :  1,500.00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel10.setText("Precio :  50.00");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel11.setText("Precio :  100.00");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/blackLabel.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/blueLabel.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/redLabel.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameMenuPrincipal_1 x=new FrameMenuPrincipal_1();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spiner1;
    private javax.swing.JSpinner spiner2;
    private javax.swing.JSpinner spiner3;
    // End of variables declaration//GEN-END:variables
}
