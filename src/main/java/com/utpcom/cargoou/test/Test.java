/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utpcom.cargoou.test;

import com.utpcom.cargoou.util.Conexion;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test de conexión
        Conexion con = new Conexion();
        try(Connection c = con.getConexion()) {
            System.out.println("OK FINO");
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
