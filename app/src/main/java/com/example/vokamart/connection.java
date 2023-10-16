package com.example.vokamart;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {


        public static Connection connect() {
            Connection connection = null;
            String url = "jdbc:mysql://your_db_server:3306/vokamart";
            String username = "";
            String password = "";

            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return connection;
        }
    }

