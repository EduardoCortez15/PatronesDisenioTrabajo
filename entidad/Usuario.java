
package entidad;

public class Usuario {
    private int id_usuario;
    private String usuario;
    private String contrasenia;
    private int id_cliente;

    public Usuario() {
    }

    public Usuario( String usuario, String contrasenia) {
        
        this.usuario = usuario;
        this.contrasenia = contrasenia;
      
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
