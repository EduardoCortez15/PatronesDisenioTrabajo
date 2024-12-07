
package interfaces;

import entidad.Administrador;
import entidad.Usuario;

public interface UsuarioDAO {
    public boolean iniciarSesion(Usuario user);
    public boolean iniciarSesionAdministrador(Administrador administrador);
}
