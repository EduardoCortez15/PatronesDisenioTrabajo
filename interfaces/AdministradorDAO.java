
package interfaces;

import entidad.Administrador;

public interface AdministradorDAO {
    
    public boolean registrarAdministrador(Administrador administrador);
    public boolean iniciarSesionAdministrador(Administrador administrador);
}
