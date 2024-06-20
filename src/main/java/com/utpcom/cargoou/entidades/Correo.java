/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.entidades;

/**
 *
 * @author user
 */
public class Correo {
    private int id_correo;
    private String codCorreo;
    private String titCorreo;
    private String emiCorreo; 
    private String desCorreo;
    private String asuCorreo;

    public Correo() {
    }
    private String menCorreo;

    public Correo(int id_correo, String codCorreo, String titCorreo, String emiCorreo, String desCorreo, String asuCorreo, String menCorreo) {
        this.id_correo = id_correo;
        this.codCorreo = codCorreo;
        this.titCorreo = titCorreo;
        this.emiCorreo = emiCorreo;
        this.desCorreo = desCorreo;
        this.asuCorreo = asuCorreo;
        this.menCorreo = menCorreo;
    }

    public int getId_correo() {
        return id_correo;
    }

    public void setId_correo(int id_correo) {
        this.id_correo = id_correo;
    }

    public String getCodCorreo() {
        return codCorreo;
    }

    public void setCodCorreo(String codCorreo) {
        this.codCorreo = codCorreo;
    }

    public String getTitCorreo() {
        return titCorreo;
    }

    public void setTitCorreo(String titCorreo) {
        this.titCorreo = titCorreo;
    }

    public String getEmiCorreo() {
        return emiCorreo;
    }

    public void setEmiCorreo(String emiCorreo) {
        this.emiCorreo = emiCorreo;
    }

    public String getDesCorreo() {
        return desCorreo;
    }

    public void setDesCorreo(String desCorreo) {
        this.desCorreo = desCorreo;
    }

    public String getAsuCorreo() {
        return asuCorreo;
    }

    public void setAsuCorreo(String asuCorreo) {
        this.asuCorreo = asuCorreo;
    }

    public String getMenCorreo() {
        return menCorreo;
    }

    public void setMenCorreo(String menCorreo) {
        this.menCorreo = menCorreo;
    }
    
}
