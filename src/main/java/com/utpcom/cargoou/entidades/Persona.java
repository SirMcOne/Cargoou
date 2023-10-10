/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Persona {
    private int id_persona;
    private String nomPerson;
    private String apePerson;
    private String estPerson;
    private String corPerson;
    private int edaPerson;

    public Persona() {
    }

    public Persona(int id_persona, String nomPerson, String apePerson, String estPerson, String corPerson, int edaPerson) {
        this.id_persona = id_persona;
        this.nomPerson = nomPerson;
        this.apePerson = apePerson;
        this.estPerson = estPerson;
        this.corPerson = corPerson;
        this.edaPerson = edaPerson;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNomPerson() {
        return nomPerson;
    }

    public void setNomPerson(String nomPerson) {
        this.nomPerson = nomPerson;
    }

    public String getApePerson() {
        return apePerson;
    }

    public void setApePerson(String apePerson) {
        this.apePerson = apePerson;
    }

    public String getEstPerson() {
        return estPerson;
    }

    public void setEstPerson(String estPerson) {
        this.estPerson = estPerson;
    }

    public String getCorPerson() {
        return corPerson;
    }

    public void setCorPerson(String corPerson) {
        this.corPerson = corPerson;
    }

    public int getEdaPerson() {
        return edaPerson;
    }

    public void setEdaPerson(int edaPerson) {
        this.edaPerson = edaPerson;
    }
    
}
