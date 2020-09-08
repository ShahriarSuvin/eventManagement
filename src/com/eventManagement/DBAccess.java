package com.eventManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess{

    public static Connection getConnection() throws ClassNotFoundException, SQLException{
    
        Connection conn = null;
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/event_management";
        String user = "root";
        String pass = "";
        conn = DriverManager.getConnection(url, user , pass);
        return conn;
    }
}
