/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utpcom.cargoou.dao.impl;

import com.utpcom.cargoou.dao.DaoBus;
import com.utpcom.cargoou.dto.BusDto;
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
public class DaoBusImpl implements DaoBus {

    private final Conexion conexion;
    private String mensaje;

    public DaoBusImpl() {
        this.conexion = new Conexion();
    }

    @Override
    public List<BusDto> busSel() {
        List<BusDto> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_bus, ")
                .append("placa, ")
                .append("color, ")
                .append("estBus, ")
                .append("numAsi ")
                .append(" FROM bus");
        System.out.print(sql);
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                BusDto bus = new BusDto();
                bus.setId_bus(rs.getInt(1));
                bus.setPlaca(rs.getString(2));
                bus.setColor(rs.getString(3));
                bus.setEstBus(rs.getString(4));
                bus.setNumAsi(rs.getInt(5));
                lista.add(bus);
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return lista;
    }

    @Override
    public BusDto busGet(Integer id) {
        BusDto bus = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_bus,")
                .append("placa")
                .append("color")
                .append("estBus")
                .append("sumAsi")
                .append(" WHERE id_bus = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bus = new BusDto();
                bus.setId_bus(id);
                bus.setPlaca(rs.getString(2));
                bus.setColor(rs.getString(3));
                bus.setEstBus(rs.getString(4));
                bus.setNumAsi(rs.getInt(5));
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return bus;
    }

    @Override
    public String busIns(BusDto bus) {
        mensaje = null;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO bus(")
                .append("placa )")
                .append("color )")
                .append("estBus )")
                .append("numAsi )")
                .append("VALUES (?)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, bus.getPlaca());
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
    public String busUpd(BusDto bus) {
        mensaje = null;
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE bus SET ")
                .append("placa = ?,")
                .append(" WHERE id_bus = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, bus.getPlaca());
            ps.setInt(2, bus.getId_bus());
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
    public String busDel(List<Integer> ids) {
        mensaje = null;

        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM bus")
                .append(" WHERE id_bus = ?");
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
