/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dao.impl;

import com.utpcom.cargoou.dao.DaoUsuario;
import com.utpcom.cargoou.dto.UsuarioDto;
import com.utpcom.cargoou.entidades.Usuario;
import com.utpcom.cargoou.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
                .append("id_usuario, ")
                .append("codRol, ")
                .append("id_persona, ")
                .append("estUsuari, ")
                .append("codUsuari, ")
                .append("claUsuari ")
                .append(" FROM usuario");
        System.out.print(sql);
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                UsuarioDto usuario = new UsuarioDto();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setCodRol(rs.getString(2));
                usuario.setId_persona(rs.getInt(3));
                usuario.setEstUsuari(rs.getString(4));
                usuario.setCodUsuari(rs.getString(5));
                usuario.setClaUsuari(rs.getString(6));
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
                .append("id_usuario, ")
                .append("codRol, ")
                .append("id_persona, ")
                .append("estUsuari, ")
                .append("codUsuari, ")
                .append("claUsuari ")
                .append(" WHERE id_usuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new UsuarioDto();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setCodRol(rs.getString(2));
                usuario.setId_persona(rs.getInt(3));
                usuario.setEstUsuari(rs.getString(4));
                usuario.setCodUsuari(rs.getString(5));
                usuario.setClaUsuari(rs.getString(6));
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
                .append("estUsuari, ")
                .append("codUsuari, ")
                .append("claUsuari ")
                .append(" WHERE codUsuari = ? AND claUsuari = ?");
        System.out.print(sql);
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, cod);
            ps.setString(2, cla);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario = new UsuarioDto();
                usuario.setId_usuario(rs.getInt(1));
                usuario.setCodRol(rs.getString(2));
                usuario.setId_persona(rs.getInt(3));
                usuario.setEstUsuari(rs.getString(4));
                usuario.setCodUsuari(rs.getString(5));
                usuario.setClaUsuari(rs.getString(6));
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
                .append("codRol )")
                .append("id_persona )")
                .append("estUsuari )")
                .append("codUsuari )")
                .append("claUsuari )")
                .append("VALUES (?)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario.getCodUsuari());
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
                .append("codUsuari = ?,")
                .append(" WHERE id_usuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario.getCodUsuari());
            ps.setInt(2, usuario.getId_usuario());
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
        mensaje = null;

        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM usuario")
                .append(" WHERE id_usuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            cn.setAutoCommit(false);
            boolean ok = true;
            for (int id = 0; id < ids.size(); id++) {
                ps.setInt(1, ids.get(id));
                int ctos = ps.executeUpdate();
                if (ctos == 0) {
                    ok = false;
                    mensaje = "ID: " + ids.get(id) + " no existe";
                }
            }
            if (ok) {
                cn.commit();
            } else {
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
