
package Main;

import gui.FrameLogin;
import utils.MySqlConexion;

public class Principal {

    public static void main(String[] args) {
        MySqlConexion mysql=MySqlConexion.getConexion();
        mysql.conectar();
        FrameLogin frmLogin=new FrameLogin();
        frmLogin.setVisible(true);
        frmLogin.setLocationRelativeTo(null);
        
    }
    
}
