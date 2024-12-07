
package gui;

import entidad.Producto;
import javax.swing.table.DefaultTableModel;

public class FrameElectrodomesticos extends javax.swing.JFrame {

   
    public FrameElectrodomesticos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCompraUnitaria1 = new javax.swing.JButton();
        btnCompraUnitaria2 = new javax.swing.JButton();
        btnCompraUnitaria3 = new javax.swing.JButton();
        spiner1 = new javax.swing.JSpinner();
        spiner2 = new javax.swing.JSpinner();
        spiner3 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Electrodomesticos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 130, -1));

        jLabel2.setText("Licuadora");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setText("Cocina");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel4.setText("Freidora de aire");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jButton1.setText("Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        btnCompraUnitaria1.setText("Compra unitaria");
        btnCompraUnitaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        btnCompraUnitaria2.setText("Compra unitaria");
        btnCompraUnitaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        btnCompraUnitaria3.setText("Compra unitaria");
        btnCompraUnitaria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));
        getContentPane().add(spiner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 40, -1));
        getContentPane().add(spiner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 40, -1));
        getContentPane().add(spiner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 40, -1));

        jLabel8.setText("Precio :  250.00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel9.setText("Precio :  700.00");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        jLabel10.setText("Precio :  160.00");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/licuadora2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cocina.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/freidora.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameMenuPrincipal_1 x=new FrameMenuPrincipal_1();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCompraUnitaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria1ActionPerformed
         String nombre = "Licuadora";
        
       double precio = 250.00;
       int categoria = 3;
       int cantidad = (int)spiner1.getValue();
       
       Producto pro = new Producto(nombre, precio, categoria);
       FrameCarrito x = new FrameCarrito();
       x.txtTotal.setText(Double.toString(cantidad*precio));
       DefaultTableModel detalle = (DefaultTableModel) x.tblCompraUnitaria.getModel();
       Object fila[] ={nombre, precio,cantidad, categoria };
       detalle.addRow(fila);
       
       x.setVisible(true);
       x.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnCompraUnitaria1ActionPerformed

    private void btnCompraUnitaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria2ActionPerformed
         String nombre = "Cocina";
        double precio = 700.00;
        int categoria = 3;
        int cantidad = (int) spiner2.getValue();
        
        Producto pro = new Producto(nombre, precio, categoria);
        FrameCarrito x = new FrameCarrito();
        x.txtTotal.setText(Double.toString(cantidad*precio));
        DefaultTableModel detalle = (DefaultTableModel) x.tblCompraUnitaria.getModel();
        Object fila[] = {nombre, precio, cantidad, categoria};
        detalle.addRow(fila);
        
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCompraUnitaria2ActionPerformed

    private void btnCompraUnitaria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria3ActionPerformed
         String nombre ="Freidora de aire";
        double precio = 160.00;
        int categoria = 3;
        int cantidad = (int) spiner3.getValue();
        
        Producto pro = new Producto(nombre, precio, categoria);
        FrameCarrito x = new FrameCarrito();
        x.txtTotal.setText(Double.toString(cantidad*precio));
        DefaultTableModel detalle = (DefaultTableModel) x.tblCompraUnitaria.getModel();
        Object fila[] ={nombre, precio, cantidad, categoria};
        detalle.addRow(fila);
        
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCompraUnitaria3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompraUnitaria1;
    private javax.swing.JButton btnCompraUnitaria2;
    private javax.swing.JButton btnCompraUnitaria3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
