/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utpcom.cargoou.web.validator;

import com.utpcom.cargoou.dao.DaoCorreo;
import com.utpcom.cargoou.dao.impl.DaoCorreoImpl;
import com.utpcom.cargoou.dto.CorreoDto;
import com.utpcom.cargoou.util.DeString;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
 *
 * @author user
 */
@WebServlet(name = "CorreoValidator", urlPatterns = {"/Validator"})
public class CorreoValidator {

    private final HttpServletRequest request;
    private final DaoCorreo daoCorreo;
    
    public CorreoValidator(HttpServletRequest request) {
        this.request = request;
        this.daoCorreo = new DaoCorreoImpl();
    }
    
    public String correoSel() {
        String result = null;
        List<CorreoDto> list = daoCorreo.correoSel();
        if (list != null) {
            request.setAttribute("list", list);
        } else {
            result = daoCorreo.getMensaje();
        }
        return result;
    }

    public String correoGet() {
        String result = null;
        Integer id_correo = DeString.aInteger(request.getParameter("id_correo"));
        CorreoDto correo = daoCorreo.correoGet(id_correo);
        if (correo != null) {
            request.setAttribute("correo", correo);
        } else {
            result = daoCorreo.getMensaje();
        }
        return result;
    }
    public String correoInsUpd(boolean upd) {
        StringBuilder result = new StringBuilder("<ul>");
        Integer id_correo = DeString.aInteger(request.getParameter("id_correo"));
        String placa = request.getParameter("placa");
        String color = request.getParameter("color");
        String estCorreo = request.getParameter("estCorreo");
        //LocalDate fecha_ingreso = LocalDate.parse(request.getParameter("fecha_ingreso"));
        //String correo = request.getParameter("correo");
        Integer numAsi = DeString.aInteger(request.getParameter("numAsi"));
        if (upd && id_correo == null) {
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
        if (estCorreo == null || estCorreo.trim().length() == 0) {
            result.append("<li>Apellido materno requerido</li>");
        } else if (estCorreo.trim().length() < 3 || estCorreo.trim().length() > 50) {
            result.append("<li>La dimensión del apellido materno debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        /*if (fecha_ingreso == null) {
            result.append("<li>Fecha requerida</li>");
        }
        if (deuda < 0d) {
            result.append("<li>La deuda no puede ser negativa</li>");
        }*/
        CorreoDto correo = new CorreoDto();

        if (result.length() == 4) {
            String msg = upd
                    ? daoCorreo.correoUpd(correo)
                    : daoCorreo.correoIns(correo);
            if (msg != null) {
                result.append("<li>").append(msg).append("</li>");
            }
        }
        if (result.length() > 4) {
            request.setAttribute("correo", correo);
        }
        return result.length() == 4 ? null : result.append("</ul>").toString();
    }
    public String correoDel() {
        List<Integer> ids = DeString.ids(request.getParameter("ids"));
        String result = (ids != null)
                ? daoCorreo.correoDel(ids)
                : "IDs incorrectos";
        return result;
    }
}
