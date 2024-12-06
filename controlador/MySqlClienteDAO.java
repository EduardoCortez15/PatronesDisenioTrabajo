
package controlador;
import java.sql.*;
import entidad.Cliente;
import entidad.Usuario;
import interfaces.ClienteDAO;
import utils.MySqlConexion;

public class MySqlClienteDAO implements ClienteDAO{

    @Override
    public boolean registroCliente_Usuario(Cliente clie, Usuario user) {
        boolean valor=false;
        int num=0;
        Connection cn=null;
        CallableStatement cl=null;
        try {
         cn=MySqlConexion.getConexion().conectar();
         String sql="call sp_registros_usuario_cliente(?,?,?,?,?,?);";
         cl=cn.prepareCall(sql);
         cl.setString(1,user.getUsuario());
         cl.setString(2,user.getContrasenia());
         cl.setString(3,clie.getNombre());
         cl.setString(4,clie.getApellido());
         cl.setString(5,clie.getTelefono());
         cl.setString(6, clie.getDni());
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
