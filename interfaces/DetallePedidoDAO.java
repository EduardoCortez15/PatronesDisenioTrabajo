
package interfaces;

import entidad.DetallePedido;
import entidad.Producto;

public interface DetallePedidoDAO {
    public boolean registroDetallePedido(DetallePedido pedido , Producto producto );
}
