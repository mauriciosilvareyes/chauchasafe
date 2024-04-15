package com.chauchasafe.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://chauchasafedb.cv44au8syfwp.sa-east-1.rds.amazonaws.com:3306/chauchaSafeDB";
        String username = "admin";
        String password = "QhfpDJ7kSQIcogOVy4jb";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}