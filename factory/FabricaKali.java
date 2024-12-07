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
public class FabricaKali implements FabricaMuebles{

    @Override
    public Producto1 crearSilla() {
        return new SillaKali(111, "Silla", 50);
    }

    @Override
    public Producto1 crearSofa() {
        return new SofaKali(111, "Sofa", 150);
    }

    @Override
    public Producto1 crearMesa() {
        return new MesaKali(111, "Mesa", 100);
    }
    
}
