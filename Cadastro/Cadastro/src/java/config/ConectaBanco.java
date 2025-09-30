package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {
    public static Connection conectar() throws ClassNotFoundException {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Driver MySQL
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/analise_de_credito", "root", ""
            );
        } catch (SQLException ex) {
            System.out.println("Erro - SQL: " + ex);
        }
        return conn;
    }
}
