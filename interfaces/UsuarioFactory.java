
package interfaces;

import entidad.Administrador;
import entidad.Cliente;

public interface UsuarioFactory {
    public Cliente crearCliente(String nombre ,String apellido,String telefono, String dni);
    public Administrador crearAdministrador(String usuario,String contrasenia);
    
}
