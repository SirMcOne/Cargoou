/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utpcom.cargoou.test;

import com.utpcom.cargoou.dao.DaoUsuario;
import com.utpcom.cargoou.dao.impl.DaoUsuarioImpl;
import com.utpcom.cargoou.dto.UsuarioDto;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner;
        DaoUsuario daoUsuario = new DaoUsuarioImpl();
        UsuarioDto usuario;
        Integer opt;
        do {
            scanner = new Scanner(System.in);
            inicio();
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    List<UsuarioDto> list = daoUsuario.usuarioSel();
                    if (list != null) {
                        try {
                            list.forEach((t) -> {
                                System.out.println(t.getIdUsuario().toString() + " "
                                        + t.getCodUsuario() + " "
                                        + t.getUsuario() + " "
                                        + t.getEstado() + " "
                                        + t.getFecCrea().toString());
                                //+ t.getFecha_ingreso().toString());
                            });
                        } catch (Exception e) {
                            System.out.println(daoUsuario.getMensaje());
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Lista vacía");
                    }
                    break;
            }
        }while(opt!=6);       
    }

    private static void inicio() {
        System.out.println("--------Claves de las prueba-----");
        System.out.println("1: Lista de usuarios UsuariosSel");
        System.out.println("2: Obtener usuario UsuariosGet");
        System.out.println("3: Insertar usuario UsuariosUpd");
        System.out.println("4: Actualizar usuario UsuariosIns");
        System.out.println("5: Eliminar usuario UsuariosDel");
        System.out.println("6: Salir");
        System.out.println("-----------------------------------");
        System.out.print("\nIngrese la clave: ");
    }

}
