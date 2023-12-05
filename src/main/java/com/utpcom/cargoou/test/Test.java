/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utpcom.cargoou.test;

import com.utpcom.cargoou.dao.DaoBus;
import com.utpcom.cargoou.dao.impl.DaoBusImpl;
import com.utpcom.cargoou.dto.BusDto;
import com.utpcom.cargoou.util.Conexion;
import java.sql.Connection;
import java.util.List;

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
        DaoBus daoBus = new DaoBusImpl();
        List<BusDto> list = daoBus.busSel();
        if (list != null) {
            try {
                list.forEach((t) -> {
                    System.out.println(t.getId_bus().toString() + " "
                            + t.getPlaca()+ " "
                            + t.getColor() + " "
                            + t.getEstBus() + " "
                            + t.getNumAsi().toString());
                            //+ t.getFecha_ingreso().toString());
                });
            } catch (Exception e) {
                System.out.println(daoBus.getMensaje());
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Lista vacía");
        }
    }

}
