/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utpcom.cargoou.web.validator;

import com.utpcom.cargoou.dao.DaoBus;
import com.utpcom.cargoou.dao.impl.DaoBusImpl;
import com.utpcom.cargoou.dto.BusDto;
import com.utpcom.cargoou.util.DeString;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author user
 */
@WebServlet(name = "BusValidator", urlPatterns = {"/Validator"})
public class BusValidator {

    private final HttpServletRequest request;
    private final DaoBus daoBus;
    
    public BusValidator(HttpServletRequest request) {
        this.request = request;
        this.daoBus = new DaoBusImpl();
    }
    
    public String busSel() {
        String result = null;
        List<BusDto> list = daoBus.busSel();
        if (list != null) {
            request.setAttribute("list", list);
        } else {
            result = daoBus.getMensaje();
        }
        return result;
    }

    public String busGet() {
        String result = null;
        Integer id_bus = DeString.aInteger(request.getParameter("id_bus"));
        BusDto bus = daoBus.busGet(id_bus);
        if (bus != null) {
            request.setAttribute("bus", bus);
        } else {
            result = daoBus.getMensaje();
        }
        return result;
    }
    public String busInsUpd(boolean upd) {
        StringBuilder result = new StringBuilder("<ul>");
        Integer id_bus = DeString.aInteger(request.getParameter("id_bus"));
        String placa = request.getParameter("placa");
        String color = request.getParameter("color");
        String estBus = request.getParameter("estBus");
        //LocalDate fecha_ingreso = LocalDate.parse(request.getParameter("fecha_ingreso"));
        //String correo = request.getParameter("correo");
        Integer numAsi = DeString.aInteger(request.getParameter("numAsi"));
        if (upd && id_bus == null) {
            result.append("<li>Id requerido</li>");
        }
        if (placa == null || placa.trim().length() == 0) {
            result.append("<li>Nombre requerido</li>");
        } else if (placa.trim().length() < 3 || placa.trim().length() > 50) {
            result.append("<li>La dimensión del nombre debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        if (color == null || color.trim().length() == 0) {
            result.append("<li>Apellido paterno requerido</li>");
        } else if (color.trim().length() < 3 || color.trim().length() > 50) {
            result.append("<li>La dimensión del apellido paterno debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        if (estBus == null || estBus.trim().length() == 0) {
            result.append("<li>Apellido materno requerido</li>");
        } else if (estBus.trim().length() < 3 || estBus.trim().length() > 50) {
            result.append("<li>La dimensión del apellido materno debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        /*if (fecha_ingreso == null) {
            result.append("<li>Fecha requerida</li>");
        }
        if (deuda < 0d) {
            result.append("<li>La deuda no puede ser negativa</li>");
        }*/
        BusDto bus = new BusDto();
        bus.setId_bus(id_bus);
        bus.setPlaca(placa);
        bus.setEstBus(estBus);
        bus.setNumAsi(numAsi);
        if (result.length() == 4) {
            String msg = upd
                    ? daoBus.busUpd(bus)
                    : daoBus.busIns(bus);
            if (msg != null) {
                result.append("<li>").append(msg).append("</li>");
            }
        }
        if (result.length() > 4) {
            request.setAttribute("bus", bus);
        }
        return result.length() == 4 ? null : result.append("</ul>").toString();
    }
    public String busDel() {
        List<Integer> ids = DeString.ids(request.getParameter("ids"));
        String result = (ids != null)
                ? daoBus.busDel(ids)
                : "IDs incorrectos";
        return result;
    }
}
