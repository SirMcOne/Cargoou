/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Conductor {
    private int id_conductor;
    private String codConduc;
    private int id_persona;
    private int calConductor; //calificacion
    private String numLicConduc;

    public Conductor() {
    }

    public Conductor(int id_conductor, String codConduc, int id_persona, int calConductor, String numLicConduc) {
        this.id_conductor = id_conductor;
        this.codConduc = codConduc;
        this.id_persona = id_persona;
        this.calConductor = calConductor;
        this.numLicConduc = numLicConduc;
    }

    public int getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(int id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getCodConduc() {
        return codConduc;
    }

    public void setCodConduc(String codConduc) {
        this.codConduc = codConduc;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getCalConductor() {
        return calConductor;
    }

    public void setCalConductor(int calConductor) {
        this.calConductor = calConductor;
    }

    public String getNumLicConduc() {
        return numLicConduc;
    }

    public void setNumLicConduc(String numLicConduc) {
        this.numLicConduc = numLicConduc;
    }
    
}
