
package controlador;
import java.sql.*;
//import com.mysql.cj.MysqlConnection;
import entidad.Producto;
import interfaces.ProductoDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import utils.MySqlConexion;

public class MySqlProductoDAO implements ProductoDAO{

    @Override
    public boolean registroProductoUnitario(Producto producto) {
        boolean valor =false;
        int num=0;
        Connection cn=null;
        CallableStatement cl=null;
        
        try {
            cn=MySqlConexion.getConexion().conectar();
            String sql="call sp_registroProducto(?,?,?);";
            cl=cn.prepareCall(sql);
            cl.setString(1,producto.getNombre());
            cl.setDouble(2, producto.getPrecio());
            cl.setInt(3, producto.getId_categoria());
            num=cl.executeUpdate();
            if(num!=0){
                valor=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                if(cl!=null)cl.close();
                if(cn!=null)cn.close();
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        
       return valor;
    }
    
}
