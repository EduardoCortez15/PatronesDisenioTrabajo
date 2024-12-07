/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import entidad.Producto1;

/**
 *
 * @author ASUS
 */
public class MesaLondon extends Producto1{
    
    public MesaLondon(int id,String nombre,double precio) {
        super(new Producto1.ProductoBuilder(id, nombre, "Muebles",precio)
        .setColor("marron"));
    }
    
}
