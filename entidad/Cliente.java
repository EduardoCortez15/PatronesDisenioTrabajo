
package entidad;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String apellido;
    private String telefono;
    private String Dni;

    public Cliente() {
    }

    public Cliente( String nombre, String apellido, String telefono, String Dni) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.Dni = Dni;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }
    
}
