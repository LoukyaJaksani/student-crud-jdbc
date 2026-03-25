package com.loukys.student.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(url, user, pass);

    }

}
