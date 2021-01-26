package com.dbimplementation.wisconsin.dao;

import java.sql.*;

public class DbAdapter {

    String jdbUrl = "jdbc:postgresql://localhost:5432/postgres";
    String username = "postgres";
    String password = "Goutham@15";

    public Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;
    public void connect () {
        try {
        	System.out.println("trying to connect");
            connection = DriverManager.getConnection(jdbUrl, username, password);
            System.out.println("Database connection established");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 

    public Connection getConn() {
        return connection;
    }

    public void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    } // disconnect
}
