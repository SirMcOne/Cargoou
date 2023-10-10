/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Horario {
    private int id_horario;
    private String horSalida;
    private String estHorari;

    public Horario() {
    }

    public Horario(int id_horario, String horSalida, String estHorari) {
        this.id_horario = id_horario;
        this.horSalida = horSalida;
        this.estHorari = estHorari;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public String getHorSalida() {
        return horSalida;
    }

    public void setHorSalida(String horSalida) {
        this.horSalida = horSalida;
    }

    public String getEstHorari() {
        return estHorari;
    }

    public void setEstHorari(String estHorari) {
        this.estHorari = estHorari;
    }
    
}
