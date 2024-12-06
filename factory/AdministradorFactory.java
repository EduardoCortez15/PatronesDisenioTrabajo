/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import entidad.Administrador;
import entidad.Cliente;
import interfaces.UsuarioFactory;

/**
 *
 * @author corte
 */
public class AdministradorFactory implements UsuarioFactory{

    @Override
    public Cliente crearCliente(String nombre, String apellido, String telefono, String dni) {
        return null;
    }

    @Override
    public Administrador crearAdministrador(String nombre, String apellido) {
        return new Administrador( nombre, apellido);
    }
    
}
