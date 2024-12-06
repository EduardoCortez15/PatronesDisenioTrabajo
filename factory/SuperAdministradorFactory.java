package factory;

import entidad.Administrador;
import entidad.Cliente;
import entidad.SuperAdministrador;
import interfaces.UsuarioFactory;

public class SuperAdministradorFactory implements UsuarioFactory {

    @Override
    public Cliente crearCliente(String nombre, String apellido, String telefono, String dni) {
        return null;
    }

    @Override
    public Administrador crearAdministrador(String usuario, String contrasenia) {
        return null;
    }

    @Override
    public SuperAdministrador usarSuperAdministrador(String usuario, String contrasenia) {
        return new SuperAdministrador(usuario, contrasenia);
    }

}
