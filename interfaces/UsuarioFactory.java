
package interfaces;

import entidad.Administrador;
import entidad.Cliente;
import entidad.SuperAdministrador;

public interface UsuarioFactory {
    public Cliente crearCliente(String nombre ,String apellido,String telefono, String dni);
    public Administrador crearAdministrador(String usuario,String contrasenia);
    public SuperAdministrador usarSuperAdministrador(String usuario,String contrasenia);
    
}
