/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import entidad.Producto1;
import interfaces.FabricaMuebles;

/**
 *
 * @author ASUS
 */
public class FabricaLondon implements FabricaMuebles{

    @Override
    public Producto1 crearSilla() {
        return new SillaLondon(111, "Silla", 50);
    }

    @Override
    public Producto1 crearSofa() {
        return new SofaLondon(111, "Sofa", 150);
    }

    @Override
    public Producto1 crearMesa() {
        return new MesaLondon(111, "Mesa", 100);
    }
    
}
