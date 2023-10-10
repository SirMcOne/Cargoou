/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Pasajero {
    private int id_pasajero;
    private String codPasaje;
    private int id_persona;
    private String codTarjet;
    private int numViajes;

    public Pasajero() {
    }

    public Pasajero(int id_pasajero, String codPasaje, int id_persona, String codTarjet, int numViajes) {
        this.id_pasajero = id_pasajero;
        this.codPasaje = codPasaje;
        this.id_persona = id_persona;
        this.codTarjet = codTarjet;
        this.numViajes = numViajes;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getCodPasaje() {
        return codPasaje;
    }

    public void setCodPasaje(String codPasaje) {
        this.codPasaje = codPasaje;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getCodTarjet() {
        return codTarjet;
    }

    public void setCodTarjet(String codTarjet) {
        this.codTarjet = codTarjet;
    }

    public int getNumViajes() {
        return numViajes;
    }

    public void setNumViajes(int numViajes) {
        this.numViajes = numViajes;
    }
    
}
