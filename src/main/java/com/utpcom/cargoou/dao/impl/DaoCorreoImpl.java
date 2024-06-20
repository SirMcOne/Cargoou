/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dao.impl;

import com.utpcom.cargoou.dao.DaoCorreo;
import com.utpcom.cargoou.dto.CorreoDto;
import com.utpcom.cargoou.entidades.Correo;
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
public class DaoCorreoImpl implements DaoCorreo {

    private final Conexion conexion;
    private String mensaje;

    public DaoCorreoImpl() {
        this.conexion = new Conexion();
    }

    @Override
    public List<CorreoDto> correoSel() {
        List<CorreoDto> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_correo, ")
                .append("codCorreo, ")
                .append("titCorreo, ")
                .append("emiCorreo, ")
                .append("desCorreo, ")
                .append("asuCorreo, ")
                .append("menCorreo ")
                .append(" FROM correo");
        System.out.print(sql);
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                CorreoDto correo = new CorreoDto();
                correo.setId_correo(rs.getInt(1));
                correo.setCodCorreo(rs.getString(2));
                correo.setTitCorreo(rs.getString(3));
                correo.setEmiCorreo(rs.getString(4));
                correo.setDesCorreo(rs.getString(5));
                correo.setAsuCorreo(rs.getString(6));
                correo.setMenCorreo(rs.getString(7));
                lista.add(correo);
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override
    public CorreoDto correoGet(Integer id) {
        CorreoDto correo = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_correo, ")
                .append("codCorreo, ")
                .append("titCorreo, ")
                .append("emiCorreo, ")
                .append("desCorreo, ")
                .append("asuCorreo, ")
                .append("menCorreo ")
                .append(" WHERE id_correo = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                correo = new CorreoDto();
                correo.setId_correo(rs.getInt(1));
                correo.setCodCorreo(rs.getString(2));
                correo.setTitCorreo(rs.getString(3));
                correo.setEmiCorreo(rs.getString(4));
                correo.setDesCorreo(rs.getString(5));
                correo.setAsuCorreo(rs.getString(6));
                correo.setMenCorreo(rs.getString(7));
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return correo;
    }

    @Override
    public String correoIns(CorreoDto correo) {
        mensaje = null;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO correo(")
                .append("codCorreo, ")
                .append("titCorreo, ")
                .append("emiCorreo, ")
                .append("desCorreo, ")
                .append("asuCorreo, ")
                .append("menCorreo ")
                .append("VALUES (?)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, correo.getCodCorreo());
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
    public String correoUpd(CorreoDto correo) {
        mensaje = null;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE correo SET ")
                .append("codCorreo = ?,")
                .append(" WHERE id_correo = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, correo.getCodCorreo());
            ps.setInt(2, correo.getId_correo());
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
    public String correoDel(List<Integer> ids) {
        mensaje = null;

        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM correo")
                .append(" WHERE id_correo = ?");
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
