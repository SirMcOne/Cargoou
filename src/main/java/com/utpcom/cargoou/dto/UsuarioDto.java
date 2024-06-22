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
    private int IdUsuario;
    private String codUsuario;
    private String Usuario;
    private String Password;
    private String Nombres;
    private String Apellidos;
    private String Email;
    private String Permisos;
    private int Estados;
    private int Enlinea;
    private int NumIngresos;
    private String FecCrea;
    private String FecModifica;
    private String FecElimina;
    private String FecUltimoAcc;
    private String Crea;
    private String Modifica;
    private String Elimina;
    private String HoraCrea;
    private String HoraModifica;
    private String HoraElimina;
    private String HoraUltimoAcc;

    public UsuarioDto() {
    }
    
    public UsuarioDto(int IdUsuario, String codUsuario, String Usuario, String Password, String Nombres, String Apellidos, String Email, String Permisos, int Estados, int Enlinea, int NumIngresos, String FecCrea, String FecModifica, String FecElimina, String FecUltimoAcc, String Crea, String Modifica, String Elimina, String HoraCrea, String HoraModifica, String HoraElimina, String HoraUltimoAcc) {
        this.IdUsuario = IdUsuario;
        this.codUsuario = codUsuario;
        this.Usuario = Usuario;
        this.Password = Password;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Email = Email;
        this.Permisos = Permisos;
        this.Estados = Estados;
        this.Enlinea = Enlinea;
        this.NumIngresos = NumIngresos;
        this.FecCrea = FecCrea;
        this.FecModifica = FecModifica;
        this.FecElimina = FecElimina;
        this.FecUltimoAcc = FecUltimoAcc;
        this.Crea = Crea;
        this.Modifica = Modifica;
        this.Elimina = Elimina;
        this.HoraCrea = HoraCrea;
        this.HoraModifica = HoraModifica;
        this.HoraElimina = HoraElimina;
        this.HoraUltimoAcc = HoraUltimoAcc;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
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

    public int getEstados() {
        return Estados;
    }

    public void setEstados(int Estados) {
        this.Estados = Estados;
    }

    public int getEnlinea() {
        return Enlinea;
    }

    public void setEnlinea(int Enlinea) {
        this.Enlinea = Enlinea;
    }

    public int getNumIngresos() {
        return NumIngresos;
    }

    public void setNumIngresos(int NumIngresos) {
        this.NumIngresos = NumIngresos;
    }

    public String getFecCrea() {
        return FecCrea;
    }

    public void setFecCrea(String FecCrea) {
        this.FecCrea = FecCrea;
    }

    public String getFecModifica() {
        return FecModifica;
    }

    public void setFecModifica(String FecModifica) {
        this.FecModifica = FecModifica;
    }

    public String getFecElimina() {
        return FecElimina;
    }

    public void setFecElimina(String FecElimina) {
        this.FecElimina = FecElimina;
    }

    public String getFecUltimoAcc() {
        return FecUltimoAcc;
    }

    public void setFecUltimoAcc(String FecUltimoAcc) {
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

    public String getHoraCrea() {
        return HoraCrea;
    }

    public void setHoraCrea(String HoraCrea) {
        this.HoraCrea = HoraCrea;
    }

    public String getHoraModifica() {
        return HoraModifica;
    }

    public void setHoraModifica(String HoraModifica) {
        this.HoraModifica = HoraModifica;
    }

    public String getHoraElimina() {
        return HoraElimina;
    }

    public void setHoraElimina(String HoraElimina) {
        this.HoraElimina = HoraElimina;
    }

    public String getHoraUltimoAcc() {
        return HoraUltimoAcc;
    }

    public void setHoraUltimoAcc(String HoraUltimoAcc) {
        this.HoraUltimoAcc = HoraUltimoAcc;
    }
    
}
