/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Conexion {
    private final String URL="jdbc:mysql://localhost:3306/utpcom_cargoou";
    private final String DRIVER="com.mysql.cj.jdbc.Driver";
    private final String USER="utpcom_cargoou";
    private final String PASS="Beto123.";
    
    public Connection getConexion() throws SQLException{
        Connection c =null;
        try {
            Class.forName(DRIVER).newInstance();
            c = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            throw new SQLException(e.getMessage());
        }
        return c;
    }
}