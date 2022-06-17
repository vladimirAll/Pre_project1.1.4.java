package jm.task.core.jdbc.util;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Util {
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost/sandbox";
            String username = "root";
            String password = "password";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  null;
    }
}
