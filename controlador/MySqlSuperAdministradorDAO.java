
package controlador;

import java.sql.*;
import entidad.SuperAdministrador;
import interfaces.SuperAdministradorDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.MySqlConexion;

public class MySqlSuperAdministradorDAO implements SuperAdministradorDAO{

    @Override
    public boolean iniciarSesion(SuperAdministrador superAdministrador) {
        boolean valor=false ;
        int num=0;
        Connection cn=null;
        CallableStatement cl=null;
        ResultSet rs=null;
        
        try {
            //paso 1 conexion
            cn=MySqlConexion.getConexion().conectar();
            
            //paso 2 string sql 
            String sql="call sp_inicioSesionSuperAdministrador(?,?);";
            cl=cn.prepareCall(sql);
            cl.setString(1,superAdministrador.getUsuario());
            cl.setString(2,superAdministrador.getContrasenia());
            num=cl.executeUpdate();
            rs=cl.executeQuery();

            if(rs.next()==true){
                valor=true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();;
        }finally{
            try {
                if(rs!=null)rs.close();
                if(cl!=null)cl.close();
                if(cn!=null)cn.close();
                
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }
        return valor;
    }   
}
