
package controlador;
import entidad.Administrador;
import java.sql.*;
import entidad.Usuario;
import interfaces.UsuarioDAO;
import utils.MySqlConexion;

public class MySqlUsuarioDAO implements UsuarioDAO{

    @Override
    public boolean iniciarSesion(Usuario user) {
        boolean valor=false ;
        Connection cn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        
        try {
            //paso 1 conexion
            MySqlConexion mysql=MySqlConexion.getConexion();
            cn=mysql.conectar();
            
            //paso 2 string sql 
            String sql="select usuario,contrasenia from usuario where usuario=? and contrasenia=?;";
            
            //paso 3 crear pstm
            pstm=cn.prepareStatement(sql);
            
            //paso 4 parametros
            pstm.setString(1,user.getUsuario());
            pstm.setString(2, user.getContrasenia());
            
            //paso 5 ejecutar
            rs=pstm.executeQuery();
            
            //paso 6 ver si hay fila existente
            if(rs.next()==true){
                valor=true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();;
        }finally{
            try {
                if(rs!=null)rs.close();
                if(pstm!=null)pstm.close();
                if(cn!=null)cn.close();
                
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        
        
        return valor;
    }

    @Override
    public boolean iniciarSesionAdministrador(Administrador administrador) {
         boolean valor=false ;
        Connection cn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        
        try {
            //paso 1 conexion
            MySqlConexion mysql=MySqlConexion.getConexion();
            cn=mysql.conectar();
            
            //paso 2 string sql 
            String sql="select usuario,contrasenia from administrador where usuario=? and contrasenia=?;";
            
            //paso 3 crear pstm
            pstm=cn.prepareStatement(sql);
            
            //paso 4 parametros
            pstm.setString(1,administrador.getUsuario());
            pstm.setString(2, administrador.getContrasenia());
            
            //paso 5 ejecutar
            rs=pstm.executeQuery();
            
            //paso 6 ver si hay fila existente
            if(rs.next()==true){
                valor=true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();;
        }finally{
            try {
                if(rs!=null)rs.close();
                if(pstm!=null)pstm.close();
                if(cn!=null)cn.close();
                
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        
        
        return valor;
    }

    
}
