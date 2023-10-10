/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Viaje {
    private int id_viaje;
    private int id_bus;
    private int id_ruta;
    private int id_horario;
    private int id_conductor;
    private int preViaje;
    private String estViaje;

    public int getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(int id_viaje) {
        this.id_viaje = id_viaje;
    }

    public int getId_bus() {
        return id_bus;
    }

    public void setId_bus(int id_bus) {
        this.id_bus = id_bus;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public int getPreViaje() {
        return preViaje;
    }

    public void setPreViaje(int preViaje) {
        this.preViaje = preViaje;
    }

    public String getEstViaje() {
        return estViaje;
    }

    public void setEstViaje(String estViaje) {
        this.estViaje = estViaje;
    }

    public Viaje(int id_viaje, int id_bus, int id_ruta, int id_horario, int id_conductor, int preViaje, String estViaje) {
        this.id_viaje = id_viaje;
        this.id_bus = id_bus;
        this.id_ruta = id_ruta;
        this.id_horario = id_horario;
        this.id_conductor = id_conductor;
        this.preViaje = preViaje;
        this.estViaje = estViaje;
    }

    public Viaje() {
    }
}

