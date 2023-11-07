/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dto;

/**
 *
 * @author user
 */
public class BusDto {
    private int id_bus;
    private String placa;
    private String color;
    private String estBus;
    private String numAsi;

    public BusDto() {
    }

    public BusDto(int id_bus, String placa, String color, String estBus, String numAsi) {
        this.id_bus = id_bus;
        this.placa = placa;
        this.color = color;
        this.estBus = estBus;
        this.numAsi = numAsi;
    }

    public int getId_bus() {
        return id_bus;
    }

    public void setId_bus(int id_bus) {
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

    public String getNumAsi() {
        return numAsi;
    }

    public void setNumAsi(String numAsi) {
        this.numAsi = numAsi;
    }
    
    
}
