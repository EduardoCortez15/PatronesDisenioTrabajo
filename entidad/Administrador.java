
package entidad;

public class Administrador {
    
    private int id_administrador;
    private String nombre;
    private String apellido;

    public Administrador() {
    }

    public Administrador( String nombre, String apellido) {
        
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
