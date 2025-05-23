/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utpcom.cargoou.web.validator;

import com.utpcom.cargoou.dao.DaoUsuario;
import com.utpcom.cargoou.dao.impl.DaoUsuarioImpl;
import com.utpcom.cargoou.dto.UsuarioDto;
import com.utpcom.cargoou.util.DeString;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 * @author user
 */
@WebServlet(name = "UsuarioValidator", urlPatterns = {"/Validator"})
public class UsuarioValidator {

    private final HttpServletRequest request;
    private final DaoUsuario daoUsuario;

    public UsuarioValidator(HttpServletRequest request) {
        this.request = request;
        this.daoUsuario = new DaoUsuarioImpl();
    }

    public String usuarioSel() {
        String result = null;
        List<UsuarioDto> list = daoUsuario.usuarioSel();
        if (list != null) {
            request.setAttribute("list", list);
        } else {
            result = daoUsuario.getMensaje();
        }
        return result;
    }

    public String usuarioGet() {
        String result = null;
        Integer id = DeString.aInteger(request.getParameter("idusuario"));
        UsuarioDto usuario = daoUsuario.usuarioGet(id);
        if (usuario != null) {
            request.setAttribute("usuario", usuario);
        } else {
            result = daoUsuario.getMensaje();
        }
        return result;
    }

    public String usuarioInsUpd(boolean upd) {
        StringBuilder result = new StringBuilder("<ul>");
        Integer idusuario = DeString.aInteger(request.getParameter("idusuario"));
        String codigo = request.getParameter("codigo");
        String nick = request.getParameter("nick");
        String password = request.getParameter("password");
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String email = request.getParameter("email");
        String permisos = request.getParameter("permiso");
        String registro = request.getParameter("registro");
        
        if (upd && idusuario == null) {
            result.append("<li>Id requerido</li>");
        }
        if (codigo == null) {
            result.append("<li>Fecha requerida</li>");
        }
        if (nick == null) {
            result.append("<li>Fecha requerida</li>");
        }
        if (password == null) {
            result.append("<li>Fecha requerida</li>");
        }
        if (nombres == null || nombres.trim().length() == 0) {
            result.append("<li>Nombre requerido</li>");
        } else if (nombres.trim().length() < 3 || nombres.trim().length() > 50) {
            result.append("<li>La dimensión del nombre debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        if (apellidos == null || apellidos.trim().length() == 0) {
            result.append("<li>Apellido paterno requerido</li>");
        } else if (apellidos.trim().length() < 3 || apellidos.trim().length() > 50) {
            result.append("<li>La dimensión del apellido paterno debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }

        if (permisos == null) {
            result.append("<li>Fecha requerida</li>");
        }
        UsuarioDto usuario = new UsuarioDto();
        usuario.setId_usuario(idusuario);
        usuario.setCodUsuario(codigo);
        usuario.setUsuario(nick);
        usuario.setPassword(password);
        usuario.setNombres(nombres);
        usuario.setApellidos(apellidos);
        usuario.setEmail(email);
        usuario.setPermisos(permisos);
        usuario.setCrea(registro);
        if (result.length() == 4) {
            String msg = upd
                    ? daoUsuario.usuarioUpd(usuario)
                    : daoUsuario.usuarioIns(usuario);
            if (msg != null) {
                result.append("<li>").append(msg).append("</li>");
            }
        }
        if (result.length() > 4) {
            request.setAttribute("usuario", usuario);
        }
        return result.length() == 4 ? null : result.append("</ul>").toString();
    }

    public String usuarioDel() {
        List<Integer> ids = DeString.ids(request.getParameter("ids"));
        String result = (ids != null)
                ? daoUsuario.usuarioDel(ids)
                : "IDs incorrectos";
        return result;
    }

    public String usuarioLog() {
        String result = null;
        String codUsuari = request.getParameter("nick");
        String claUsuari = request.getParameter("password");
        UsuarioDto usuario = daoUsuario.usuarioLog(codUsuari, claUsuari);
        if (usuario != null) {
            request.setAttribute("usuario", usuario);
        } else {
            result = daoUsuario.getMensaje();
        }
        return result;
        /*
        StringBuilder result = new StringBuilder("<ul>");
        Integer id_usuario = DeString.aInteger(request.getParameter("id_usuario"));

        String estUsuari = request.getParameter("estUsuari");
        String codUsuari = request.getParameter("codUsuari");
        String claUsuari = request.getParameter("claUsuari");
        if (upd && id_usuario == null) {
            result.append("<li>Id requerido</li>");
        }
        if (codUsuari == null || claUsuari.trim().length() == 0) {
            result.append("<li>Nombre requerido</li>");
        } else if (codUsuari.trim().length() < 3 || claUsuari.trim().length() > 50) {
            result.append("<li>La dimensión del nombre debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        if (codRol == null || codRol.trim().length() == 0) {
            result.append("<li>Apellido paterno requerido</li>");
        } else if (codRol.trim().length() < 3 || codRol.trim().length() > 50) {
            result.append("<li>La dimensión del apellido paterno debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }
        if (estUsuari == null || estUsuari.trim().length() == 0) {
            result.append("<li>Apellido materno requerido</li>");
        } else if (estUsuari.trim().length() < 3 || estUsuari.trim().length() > 50) {
            result.append("<li>La dimensión del apellido materno debe estar entre")
                    .append("3 a 50 caracteres</li>");
        }

        UsuarioDto usuario = new UsuarioDto();
        usuario.setId_usuario(id_usuario);
        usuario.setCodRol(codRol);
        usuario.setId_persona(id_persona);
        usuario.setEstUsuari(estUsuari);
        usuario.setEstUsuari(codUsuari);
        usuario.setClaUsuari(claUsuari);
        if (result.length() == 6) {
            String msg = upd
                    ? daoUsuario.usuarioUpd(usuario)
                    : daoUsuario.usuarioIns(usuario);
            if (msg != null) {
                result.append("<li>").append(msg).append("</li>");
            }
        }
        if (result.length() > 4) {
            request.setAttribute("usuario", usuario);
        }
        return result.length() == 4 ? null : result.append("</ul>").toString();*/
    }

}
