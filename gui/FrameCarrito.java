
package gui;

import controlador.MySqlProductoDAO;
import controlador.MysqlDetallePedidoDAO;
import entidad.DetallePedido;
import entidad.Producto;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrameCarrito extends javax.swing.JFrame {

    MySqlProductoDAO productoDAO=new MySqlProductoDAO();
    MysqlDetallePedidoDAO mysqlDetallePedidoDAO=new MysqlDetallePedidoDAO();
    
    public FrameCarrito() {
        initComponents();
        txtFecha.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        //.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompraUnitaria = new javax.swing.JTable();
        btnMenuPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Compra unitaria");

        tblCompraUnitaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Cantidad", "ID Categoria"
            }
        ));
        jScrollPane1.setViewportView(tblCompraUnitaria);

        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        jLabel4.setText("fecha");

        jLabel5.setText("Total:");

        btnComprar.setText("Comprar y guardar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtTotal))
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(68, 68, 68)
                        .addComponent(btnComprar)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal)
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(jButton1))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        FrameMenuPrincipal_1 x=new FrameMenuPrincipal_1();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameBebidas x=new FrameBebidas();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        String nombre="";
        double precio=0;
        int cantidad=0;
        int categoria=0;
        for(int i=0;i<tblCompraUnitaria.getRowCount();i++){
             nombre=tblCompraUnitaria.getValueAt(i,0).toString();
             precio=Double.parseDouble(tblCompraUnitaria.getValueAt(i, 1).toString());
             cantidad=Integer.parseInt(tblCompraUnitaria.getValueAt(i,2).toString());
             categoria=Integer.parseInt(tblCompraUnitaria.getValueAt(i, 3).toString());
        }
        double precioTotal=Double.parseDouble(txtTotal.getText().toString());
        String fecha=txtFecha.getText();
        
        Producto p=new Producto(nombre,precio,categoria);
        DetallePedido dp=new DetallePedido(fecha, cantidad, precioTotal);
        
        if(productoDAO.registroProductoUnitario(p)==true){
            if(mysqlDetallePedidoDAO.registroDetallePedido(dp,p)==true){
            mensaje("Se realizo la compra correctamente!!");
            FrameMenuPrincipal_1 x=new FrameMenuPrincipal_1();
            x.setVisible(true);
            x.setLocationRelativeTo(null);
            this.dispose();    
            }
            
        }else{
            mensaje("Error en el registro");
        }
        
    }//GEN-LAST:event_btnComprarActionPerformed

    public void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblCompraUnitaria;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
