/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Bus {
    private Integer id_bus;
    private String placa;
    private String color;
    private String estBus;
    private Integer numAsi; //numero de asientos

    public Bus() {
    }

    public Bus(Integer id_bus, String placa, String color, String estBus, Integer numAsi) {
        this.id_bus = id_bus;
        this.placa = placa;
        this.color = color;
        this.estBus = estBus;
        this.numAsi = numAsi;
    }

    public Integer getId_bus() {
        return id_bus;
    }

    public void setId_bus(Integer id_bus) {
        this.id_bus = id_bus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstBus() {
        return estBus;
    }

    public void setEstBus(String estBus) {
        this.estBus = estBus;
    }

    public Integer getNumAsi() {
        return numAsi;
    }

    public void setNumAsi(Integer numAsi) {
        this.numAsi = numAsi;
    }
    
}
