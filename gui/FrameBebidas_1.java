
package gui;

import entidad.Producto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class FrameBebidas_1 extends javax.swing.JFrame {

 
    public FrameBebidas_1() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCompraUnitaria3 = new javax.swing.JButton();
        btnAgregar2 = new javax.swing.JButton();
        btnAgregar3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnCompraUnitaria1 = new javax.swing.JButton();
        btnCompraUnitaria2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        miSpinner2 = new javax.swing.JSpinner();
        miSpinner3 = new javax.swing.JSpinner();
        miSpinner1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bebidas ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 60, 40));

        jLabel3.setText("Precio :  3.00");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        btnCompraUnitaria3.setText("Compra unitaria");
        btnCompraUnitaria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        btnAgregar2.setText("Agregar");
        getContentPane().add(btnAgregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        btnAgregar3.setText("Agregar");
        getContentPane().add(btnAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, -1));

        jLabel2.setText("Precio : 2.50");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 20));

        jLabel4.setText("Precio : 1.50 ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, -1, -1));

        btnCarrito.setText("Ir Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 110, -1));

        btnAgregar1.setText("Agregar");
        getContentPane().add(btnAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        btnCompraUnitaria1.setText("Compra unitaria");
        btnCompraUnitaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        btnCompraUnitaria2.setText("Compra unitaria");
        btnCompraUnitaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraUnitaria2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraUnitaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel8.setText("Coca cola");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel9.setText("Agua cielo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel10.setText("Inca kola");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        miSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(miSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        miSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        getContentPane().add(miSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        miSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        miSpinner1.setMaximumSize(new java.awt.Dimension(100, 100));
        miSpinner1.setMinimumSize(new java.awt.Dimension(0, 0));
        getContentPane().add(miSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cocaCola.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inkaCola.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agua.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        FrameMenuPrincipal_1 dani = new FrameMenuPrincipal_1();
        dani.setVisible(true);
        dani.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnCompraUnitaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria1ActionPerformed
         String nombre="coca cola";
         double precio=3.00;
         int categoria=1;
         int cantidad=(int)miSpinner1.getValue();
         Producto pro=new Producto(nombre, precio, categoria);
         FrameCarrito x=new FrameCarrito();
         x.txtTotal.setText(Double.toString(cantidad*precio));
         DefaultTableModel mdetalle = (DefaultTableModel) x.tblCompraUnitaria.getModel();
         Object fila[]={nombre,precio,cantidad,categoria};
         mdetalle.addRow(fila);
         
         //x.tblCompraUnitaria;
         x.setVisible(true);
         x.setLocationRelativeTo(null);
         this.dispose();
        
    }//GEN-LAST:event_btnCompraUnitaria1ActionPerformed

    private void btnCompraUnitaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria2ActionPerformed
        String nombre="agua cielo";
         double precio=1.50;
         int categoria=1;
         int cantidad=(int)miSpinner2.getValue();
         Producto pro=new Producto(nombre, precio, categoria);
         FrameCarrito x=new FrameCarrito();
         x.txtTotal.setText(Double.toString(cantidad*precio));
         DefaultTableModel mdetalle = (DefaultTableModel) x.tblCompraUnitaria.getModel();
         Object fila[]={nombre,precio,cantidad,categoria};
         mdetalle.addRow(fila);
         
         //x.tblCompraUnitaria;
         x.setVisible(true);
         x.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_btnCompraUnitaria2ActionPerformed

    private void btnCompraUnitaria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraUnitaria3ActionPerformed
        String nombre="inca kola";
         double precio=2.50;
         int categoria=1;
         int cantidad=(int)miSpinner3.getValue();
         Producto pro=new Producto(nombre, precio, categoria);
         FrameCarrito x=new FrameCarrito();
         x.txtTotal.setText(Double.toString(cantidad*precio));
         DefaultTableModel mdetalle = (DefaultTableModel) x.tblCompraUnitaria.getModel();
         Object fila[]={nombre,precio,cantidad,categoria};
         mdetalle.addRow(fila);
         
         //x.tblCompraUnitaria;
         x.setVisible(true);
         x.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_btnCompraUnitaria3ActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarritoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregar3;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnCompraUnitaria1;
    private javax.swing.JButton btnCompraUnitaria2;
    private javax.swing.JButton btnCompraUnitaria3;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner miSpinner1;
    private javax.swing.JSpinner miSpinner2;
    private javax.swing.JSpinner miSpinner3;
    // End of variables declaration//GEN-END:variables
}
