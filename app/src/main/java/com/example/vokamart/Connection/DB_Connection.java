package com.example.vokamart.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
        private static final String DB_URL = "jdbc:mysql://localhost:3306/vokamart";
        private static final String USER = "";
        private static final String PASSWORD = "";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        }
    }




