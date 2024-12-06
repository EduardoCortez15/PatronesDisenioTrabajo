
package entidad;

public class DetallePedido {
    private int idDetallePedido;
    private String fecha;
    private int idProducto;
    private int idCliente;
    private int cantidad;
    private double montoTotal;

    public DetallePedido() {
    }

    public DetallePedido( String fecha,  int cantidad, double montoTotal) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
    
    
}
