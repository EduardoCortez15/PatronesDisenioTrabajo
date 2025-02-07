
package factory;

import entidad.Administrador;
import entidad.Cliente;
import entidad.SuperAdministrador;
import interfaces.UsuarioFactory;


public class ClienteFactory implements UsuarioFactory{

    @Override
    public Cliente crearCliente(String nombre, String apellido, String telefono, String dni) {
        return new Cliente(nombre, apellido, telefono, dni);
    }

    @Override
    public Administrador crearAdministrador(String usuario, String contrasenia) {
        return null;
    }

    @Override
    public SuperAdministrador usarSuperAdministrador(String usuario, String contrasenia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
