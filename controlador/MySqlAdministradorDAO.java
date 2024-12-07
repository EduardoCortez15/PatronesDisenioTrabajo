package controlador;

import entidad.Administrador;
import gui.FrameRegistroAdministrador;
import interfaces.AdministradorDAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import utils.MySqlConexion;

public class MySqlAdministradorDAO implements AdministradorDAO {

    @Override
    public boolean registrarAdministrador(Administrador administrador) {
        boolean valor = false;
        int num = 0;
        Connection cn = null;
        CallableStatement cl = null;

        try {
            FrameRegistroAdministrador x = new FrameRegistroAdministrador();
            cn = MySqlConexion.getConexion().conectar();
            String sql = "call sp_registroAdministrador(?,?,?,?)";
            cl = cn.prepareCall(sql);
            cl.setString(1, administrador.getNombre());
            cl.setString(2, administrador.getApellido());
            cl.setString(3, administrador.getUsuario());
            cl.setString(4, administrador.getContrasenia());
            num = cl.executeUpdate();
            if (num != 0) {
                valor = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cl != null) {
                    cl.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e2) {
                e2.printStackTrace();
            }
        }

        return valor;
    }

    @Override
    public boolean iniciarSesionAdministrador(Administrador administrador) {

        return false;
    }

}
