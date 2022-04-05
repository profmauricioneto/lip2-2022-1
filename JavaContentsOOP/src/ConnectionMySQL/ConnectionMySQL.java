/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionMySQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author maumneto
 */
public class ConnectionMySQL {

    private static ConnectionMySQL instance;
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/exampleuserdb?useSSL=true";
    private final String username = "root";
    private final String password = "mauricio123";

    private ConnectionMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Failed. Error: " + e.getMessage());
        }
    }

    public static synchronized ConnectionMySQL getInstance() {
        if (instance == null) {
            instance = new ConnectionMySQL();
            System.out.println("Connection Success");
        }
        return instance;
    }

}
