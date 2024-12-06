
package entidad;

public class Producto {
    private int id_producto;
    private String nombre;
    private double precio;
    private int id_categoria;

    public Producto() {
    }

    public Producto( String nombre, double precio, int id_categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.id_categoria=id_categoria;
    }
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
}
