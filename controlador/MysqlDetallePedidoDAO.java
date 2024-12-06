
package controlador;
import java.sql.*;
import entidad.DetallePedido;
import entidad.Producto;
import gui.FrameLogin;
import gui.FrameMenuPrincipal;
import interfaces.DetallePedidoDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import utils.MySqlConexion;

public class MysqlDetallePedidoDAO implements DetallePedidoDAO{

    @Override
    public boolean registroDetallePedido(DetallePedido pedido , Producto producto) {
        boolean valor =false;
        int num=0;
        Connection cn=null;
        CallableStatement cl=null;
        
        try {
            FrameLogin x=new FrameLogin();
            cn=MySqlConexion.getConexion().conectar();
            String sql="call sp_registroDetallePedido(?,?,?,?);";
            cl=cn.prepareCall(sql);
            cl.setString(1, pedido.getFecha());
            cl.setInt(2, pedido.getCantidad());
            cl.setDouble(3,pedido.getMontoTotal());
            if(FrameLogin.apellido!=null){
                String apellido=x.apellido;
                cl.setString(4,apellido.toLowerCase().trim());
                System.out.println("existe lbl apellido : "+apellido );
            }
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
