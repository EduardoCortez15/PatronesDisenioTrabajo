/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;


import entidad.Producto1;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class Abarrotes extends javax.swing.JPanel {
    //private CarritoLista infoCarrito = new CarritoLista();
    //private CarritoLista carrito;
    //private DefaultListModel<Producto> carritoModel;
     
    public Abarrotes() {
        initComponents();
        MostrarImagenes();
        //carritoModel = new DefaultListModel<>();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        licuadora = new javax.swing.JLabel();
        refri = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        aire = new javax.swing.JLabel();
        txtLicuadora = new javax.swing.JTextField();
        ventilador = new javax.swing.JLabel();
        microondas = new javax.swing.JLabel();
        aspiradora = new javax.swing.JLabel();
        txtAire = new javax.swing.JTextField();
        txtRefri = new javax.swing.JTextField();
        txtMicroondas = new javax.swing.JTextField();
        txtAspiradora = new javax.swing.JTextField();
        txtVentilador = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("Principal"); // NOI18N

        licuadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licuadora.setText("licua");

        refri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refri.setText("refri");

        jPanel1.setBackground(new java.awt.Color(21, 145, 155));

        jButton1.setText("London");

        jButton2.setText("Kali");

        jLabel3.setText("Juego de Muebles");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aire.setText("aire");

        ventilador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventilador.setText("ventila");

        microondas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        microondas.setText("Microo");

        aspiradora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aspiradora.setText("Aspirad");

        btnAgregar.setBackground(new java.awt.Color(9, 209, 199));
        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(12, 100, 120));
        btnLimpiar.setText("limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCarrito.setBackground(new java.awt.Color(21, 145, 155));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnCarrito)
                        .addGap(37, 37, 37)
                        .addComponent(btnAgregar)
                        .addGap(41, 41, 41)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ventilador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(txtLicuadora, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(txtVentilador, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtRefri, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(licuadora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(refri, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aspiradora, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aire, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAspiradora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(txtAire, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licuadora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refri, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aire, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicuadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRefri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventilador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aspiradora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVentilador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAspiradora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCarrito))
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void MostrarImagenes() {
        // Agregar un listener al panel para ajustar las imágenes cuando cambie el tamaño
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                
                setImageLabel(licuadora, "src/Imagenes1/tallarin.jpg");
                setImageLabel(refri, "src/Imagenes1/atun.jpg");
                setImageLabel(aire, "src/Imagenes1/tallarin2.jpg");
                setImageLabel(ventilador, "src/Imagenes1/cereal.jpg");
                setImageLabel(microondas, "src/Imagenes1/nesquik.jpg");
                setImageLabel(aspiradora, "src/Imagenes1/nutella.jpg");
            }
        });
    }
    private void setImageLabel(JLabel labelName, String root){
        SwingUtilities.invokeLater(() -> {
            ImageIcon imagen = new ImageIcon(root);
                if (labelName.getWidth() <= 0 || labelName.getHeight() <= 0) {
                    System.err.println("Error: Dimensiones del JLabel son inválidas (ancho o alto igual a 0).");
                    return;
                }
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            this.repaint();
        });
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Producto1 p1 = new Producto1.ProductoBuilder(1, "Refrigeradora", "Electro", 1200).build();
        Producto1 p2 = new Producto1.ProductoBuilder(1, "Licuadora", "Electro", 350).build();
        Producto1 p3 = new Producto1.ProductoBuilder(1, "Aire Acondicionado", "Electro", 1500).build();
        Producto1 p4 = new Producto1.ProductoBuilder(1, "Aspiradora", "Electro", 800).build();
        Producto1 p5 = new Producto1.ProductoBuilder(1, "Microondas", "Electro", 500).build();
        Producto1 p6 = new Producto1.ProductoBuilder(1, "Ventiladora", "Electro", 300).build();
        
        String aux1 = txtAspiradora.getText();
        String aux2 = txtAire.getText();
        String aux3 = txtVentilador.getText();
        String aux4 = txtLicuadora.getText();
        String aux5 = txtMicroondas.getText();
        String aux6 = txtRefri.getText();
        
        if(aux1.isBlank()){aux1="0";txtAspiradora.setText("0");}
        if(aux2.isBlank()){aux2="0";txtAire.setText("0");}
        if(aux3.isBlank()){aux3="0";txtVentilador.setText("0");}
        if(aux4.isBlank()){aux4="0";txtLicuadora.setText("0");}
        if(aux5.isBlank()){aux5="0";txtMicroondas.setText("0");}
        if(aux6.isBlank()){aux6="0";txtRefri.setText("0");}
        
        if(aux1.matches("[0-9]+") && aux2.matches("[0-9]+")&& aux3.matches("[0-9]+")&& aux4.matches("[0-9]+")&& aux5.matches("[0-9]+")&& aux6.matches("[0-9]+")){
            int cantA = Integer.parseInt(txtAspiradora.getText());
            int cantB = Integer.parseInt(txtAire.getText());
            int cantC = Integer.parseInt(txtVentilador.getText());
            int cantD = Integer.parseInt(txtLicuadora.getText());
            int cantE = Integer.parseInt(txtMicroondas.getText());
            int cantF = Integer.parseInt(txtRefri.getText());
            
            for (int i = 0; i < cantB; i++) {App.lista.add(p3);}
            for (int i = 0; i < cantA; i++) {App.lista.add(p4);}
            for (int i = 0; i < cantD; i++) {App.lista.add(p2);}
            for (int i = 0; i < cantE; i++) {App.lista.add(p5);}
            for (int i = 0; i < cantF; i++) {App.lista.add(p1);}
            for (int i = 0; i < cantC; i++) {App.lista.add(p6);}
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un numero correcto");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        
        JFrame principal = (JFrame) SwingUtilities.getWindowAncestor(this);  // Obtener el JFrame contenedor
        principal.dispose();
        var aplicativo = new Carrito();
        aplicativo.setVisible(true);
        aplicativo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCarritoActionPerformed
    void limpiar(){
        txtAspiradora.setText("");
        txtVentilador.setText("");
        txtMicroondas.setText("");
        txtLicuadora.setText("");
        txtRefri.setText("");
        txtAire.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aire;
    private javax.swing.JLabel aspiradora;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel licuadora;
    private javax.swing.JLabel microondas;
    private javax.swing.JLabel refri;
    private javax.swing.JTextField txtAire;
    private javax.swing.JTextField txtAspiradora;
    private javax.swing.JTextField txtLicuadora;
    private javax.swing.JTextField txtMicroondas;
    private javax.swing.JTextField txtRefri;
    private javax.swing.JTextField txtVentilador;
    private javax.swing.JLabel ventilador;
    // End of variables declaration//GEN-END:variables
}
