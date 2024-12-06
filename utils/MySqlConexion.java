package utils;

import java.sql.*;

public class MySqlConexion {

    //aplicando patron Singleton
    private static MySqlConexion conexion;
    public String driver;
    public String url;
    public String login;
    public String clave;

    //constructor
    private MySqlConexion() {
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/db_tienda?serverTimezone=UTC";
        this.login = "root";
        this.clave = "";
    }

    public static MySqlConexion getConexion() {
        if (conexion == null) {
            conexion = new MySqlConexion();
        }
        return conexion;

    }

    public Connection conectar() {
        Connection cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, login, clave);
            System.out.println("Conexion correcta");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return cn;
    }

}
