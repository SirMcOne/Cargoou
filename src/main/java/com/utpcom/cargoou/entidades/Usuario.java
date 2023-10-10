/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Usuario {
    private int id_usuario;
    private String codRol;
    private int id_persona;
    private String estUsuari;
    private String codUsuari;
    private String claUsuari;

    public Usuario(int id_usuario, String codRol, int id_persona, String estUsuari, String codUsuari, String claUsuari) {
        this.id_usuario = id_usuario;
        this.codRol = codRol;
        this.id_persona = id_persona;
        this.estUsuari = estUsuari;
        this.codUsuari = codUsuari;
        this.claUsuari = claUsuari;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCodRol() {
        return codRol;
    }

    public void setCodRol(String codRol) {
        this.codRol = codRol;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getEstUsuari() {
        return estUsuari;
    }

    public void setEstUsuari(String estUsuari) {
        this.estUsuari = estUsuari;
    }

    public String getCodUsuari() {
        return codUsuari;
    }

    public void setCodUsuari(String codUsuari) {
        this.codUsuari = codUsuari;
    }

    public String getClaUsuari() {
        return claUsuari;
    }

    public void setClaUsuari(String claUsuari) {
        this.claUsuari = claUsuari;
    }
    
}
