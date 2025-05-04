/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dto;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author user
 */
public class UsuarioDto {
    private Integer Id_usuario;
    private String CodUsuario;
    private String Usuario;
    private String Password;
    private String Nombres;
    private String Apellidos;
    private String Email;
    private String Permisos;
    private Integer Estado;
    private Integer Enlinea;
    private Integer NumIngresos;
    private LocalDate FecCrea;
    private LocalDate FecModifica;
    private LocalDate FecElimina;
    private LocalDate FecUltimoAcc;
    private String Crea;
    private String Modifica;
    private String Elimina;
    private LocalTime HoraCrea;
    private LocalTime HoraModifica;
    private LocalTime HoraElimina;
    private LocalTime HoraUltimoAcc;

    public UsuarioDto() {
    }

    public Integer getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(Integer Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(String CodUsuario) {
        this.CodUsuario = CodUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPermisos() {
        return Permisos;
    }

    public void setPermisos(String Permisos) {
        this.Permisos = Permisos;
    }

    public Integer getEstado() {
        return Estado;
    }

    public void setEstado(Integer Estado) {
        this.Estado = Estado;
    }

    public Integer getEnlinea() {
        return Enlinea;
    }

    public void setEnlinea(Integer Enlinea) {
        this.Enlinea = Enlinea;
    }

    public Integer getNumIngresos() {
        return NumIngresos;
    }

    public void setNumIngresos(Integer NumIngresos) {
        this.NumIngresos = NumIngresos;
    }

    public LocalDate getFecCrea() {
        return FecCrea;
    }

    public void setFecCrea(LocalDate FecCrea) {
        this.FecCrea = FecCrea;
    }

    public LocalDate getFecModifica() {
        return FecModifica;
    }

    public void setFecModifica(LocalDate FecModifica) {
        this.FecModifica = FecModifica;
    }

    public LocalDate getFecElimina() {
        return FecElimina;
    }

    public void setFecElimina(LocalDate FecElimina) {
        this.FecElimina = FecElimina;
    }

    public LocalDate getFecUltimoAcc() {
        return FecUltimoAcc;
    }

    public void setFecUltimoAcc(LocalDate FecUltimoAcc) {
        this.FecUltimoAcc = FecUltimoAcc;
    }

    public String getCrea() {
        return Crea;
    }

    public void setCrea(String Crea) {
        this.Crea = Crea;
    }

    public String getModifica() {
        return Modifica;
    }

    public void setModifica(String Modifica) {
        this.Modifica = Modifica;
    }

    public String getElimina() {
        return Elimina;
    }

    public void setElimina(String Elimina) {
        this.Elimina = Elimina;
    }

    public LocalTime getHoraCrea() {
        return HoraCrea;
    }

    public void setHoraCrea(LocalTime HoraCrea) {
        this.HoraCrea = HoraCrea;
    }

    public LocalTime getHoraModifica() {
        return HoraModifica;
    }

    public void setHoraModifica(LocalTime HoraModifica) {
        this.HoraModifica = HoraModifica;
    }

    public LocalTime getHoraElimina() {
        return HoraElimina;
    }

    public void setHoraElimina(LocalTime HoraElimina) {
        this.HoraElimina = HoraElimina;
    }

    public LocalTime getHoraUltimoAcc() {
        return HoraUltimoAcc;
    }

    public void setHoraUltimoAcc(LocalTime HoraUltimoAcc) {
        this.HoraUltimoAcc = HoraUltimoAcc;
    }

}