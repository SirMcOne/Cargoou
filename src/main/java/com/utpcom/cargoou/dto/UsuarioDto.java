/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dto;

/**
 *
 * @author user
 */
public class UsuarioDto {
    private Integer id_usuario;
    private String codRol;
    private Integer id_persona;
    private String estUsuari;
    private String codUsuari;
    private String claUsuari;

    public UsuarioDto() {
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCodRol() {
        return codRol;
    }

    public void setCodRol(String codRol) {
        this.codRol = codRol;
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
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
