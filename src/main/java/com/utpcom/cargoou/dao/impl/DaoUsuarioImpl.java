/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dao.impl;

import com.utpcom.cargoou.dao.DaoUsuario;
import com.utpcom.cargoou.dto.UsuarioDto;
import com.utpcom.cargoou.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class DaoUsuarioImpl implements DaoUsuario {

    private final Conexion conexion;
    private String mensaje;

    public DaoUsuarioImpl() {
        this.conexion = new Conexion();
    }

    @Override
    public List<UsuarioDto> usuarioSel() {
        List<UsuarioDto> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("Id_usuario, ")
                .append("CodUsuario, ")
                .append("Usuario, ")
                .append("Password, ")
                .append("Nombres, ")
                .append("Apellidos, ")
                .append("Email, ")
                .append("Permisos, ")
                .append("Estado, ")
                .append("Enlinea, ")
                .append("NumIngresos, ")
                .append("FecCrea, ")
                .append("Crea, ")
                .append("HoraCrea")
                .append(" FROM usuario WHERE CodUsuario NOT LIKE 'ADM00000'");
        System.out.print(sql);
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                UsuarioDto usuario = new UsuarioDto();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setCodUsuario(rs.getString(2));
                usuario.setUsuario(rs.getString(3));
                usuario.setPassword(rs.getString(4));
                usuario.setNombres(rs.getString(5));
                usuario.setApellidos(rs.getString(6));
                usuario.setEmail(rs.getString(7));
                usuario.setPermisos(rs.getString(8));
                usuario.setEstado(rs.getInt(9));
                usuario.setEnlinea(rs.getInt(10));
                usuario.setNumIngresos(rs.getInt(11));
                usuario.setFecCrea(LocalDate.parse(rs.getString(12)));
                usuario.setCrea(rs.getString(13));
                usuario.setHoraCrea(LocalTime.parse(rs.getString(14)));
                lista.add(usuario);
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override
    public UsuarioDto usuarioGet(Integer id) {
        UsuarioDto usuario = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("Id_usuario, ")
                .append("CodUsuario, ")
                .append("Usuario, ")
                .append("Password, ")
                .append("Nombres, ")
                .append("Apellidos, ")
                .append("Email, ")
                .append("Permisos, ")
                .append("Estado, ")
                .append("Enlinea, ")
                .append("NumIngresos, ")
                .append("FecCrea, ")
                .append("Crea, ")
                .append("HoraCrea")
                .append(" WHERE Id_usuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new UsuarioDto();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setCodUsuario(rs.getString(2));
                usuario.setUsuario(rs.getString(3));
                usuario.setPassword(rs.getString(4));
                usuario.setNombres(rs.getString(5));
                usuario.setApellidos(rs.getString(6));
                usuario.setEmail(rs.getString(7));
                usuario.setPermisos(rs.getString(8));
                usuario.setEstado(rs.getInt(9));
                usuario.setEnlinea(rs.getInt(10));
                usuario.setNumIngresos(rs.getInt(11));
                usuario.setFecCrea(LocalDate.parse(rs.getString(12)));
                usuario.setCrea(rs.getString(13));
                usuario.setHoraCrea(LocalTime.parse(rs.getString(14)));
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return usuario;
    }

    @Override
    public UsuarioDto usuarioLog(String cod, String cla) {
        UsuarioDto usuario = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_usuario, ")
                .append("Usuario, ")
                .append("Password, ")
                .append("Permisos, ")
                .append("Estado, ")
                .append("Enlinea ")
                .append(" WHERE Usuario = ? AND Password = ?");
        System.out.print(sql);
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, cod);
            ps.setString(2, cla);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new UsuarioDto();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPassword(rs.getString(3));
                usuario.setPermisos(rs.getString(4));
                usuario.setEstado(rs.getInt(5));
                usuario.setEnlinea(rs.getInt(6));
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return usuario;
    }

    @Override
    public String usuarioIns(UsuarioDto usuario) {
        mensaje = null;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO usuario(")
                .append("id_usuario, ")
                .append("CodUsuario, ")
                .append("Usuario, ")
                .append("Password, ")
                .append("Nombres, ")
                .append("Apellidos, ")
                .append("Email, ")
                .append("Permisos, ")
                .append("Estado, ")
                .append("Enlinea, ")
                .append("NumIngresos, ")
                .append("FecCrea, ")
                .append("FecModifica, ")
                .append("FecElimina, ")
                .append("FecUltimoAcc, ")
                .append("Crea, ")
                .append("Modifica, ")
                .append("Elimina, ")
                .append("HoraCrea, ")
                .append("HoraModifica, ")
                .append("HoraElimina, ")
                .append("HoraUltimoAcc ")
                .append("VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, usuario.getId_usuario());
            ps.setString(2, usuario.getCodUsuario());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, usuario.getPassword());
            ps.setString(5, usuario.getNombres());
            ps.setString(6, usuario.getApellidos());
            ps.setString(7, usuario.getEmail());
            ps.setString(8, usuario.getPermisos());
            ps.setInt(9, usuario.getEstado());
            ps.setInt(10, usuario.getEnlinea());
            ps.setInt(11, usuario.getNumIngresos());
            ps.setString(12, usuario.getFecCrea().toString());
            ps.setString(13, usuario.getFecModifica().toString());
            ps.setString(14, usuario.getFecElimina().toString());
            ps.setString(15, usuario.getFecUltimoAcc().toString());
            ps.setString(16, usuario.getCrea());
            ps.setString(17, usuario.getModifica());
            ps.setString(18, usuario.getElimina());
            ps.setString(19, usuario.getHoraCrea().toString());
            ps.setString(20, usuario.getHoraModifica().toString());
            ps.setString(21, usuario.getHoraElimina().toString());
            ps.setString(22, usuario.getHoraUltimoAcc().toString());
            int ctos = ps.executeUpdate();
            ps.close();
            mensaje = (ctos == 0)
                    ? "Cero filas insertadas"
                    : null;
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String usuarioUpd(UsuarioDto usuario) {
        mensaje = null;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE usuario SET ")
                .append("Usuario = ?,")
                .append("Password = ?,")
                .append("Nombres = ?,")
                .append("Apellidos = ?,")
                .append("Email = ?")
                .append(" WHERE id_usuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getPassword());
            ps.setString(3, usuario.getNombres());
            ps.setString(4, usuario.getApellidos());
            ps.setString(5, usuario.getEmail());
            int ctos = ps.executeUpdate();
            mensaje += (ctos == 0)
                    ? "Cero filas actualizadas"
                    : null;
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String usuarioDel(List<Integer> ids) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM usuario")
                .append(" WHERE id_usuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            cn.setAutoCommit(false);
            boolean ok = true;
            for(int id = 0; id<ids.size(); id++){
                ps.setInt(1, ids.get(id));
                int ctos = ps.executeUpdate();
                if(ctos ==0){
                    ok = false;
                    mensaje = "ID: "+ ids.get(id)+ " no existe";
                }
            }
            if(ok){
                cn.commit();
            }else{
                cn.rollback();
            }
            cn.setAutoCommit(true);

        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

}
