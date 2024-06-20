/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utpcom.cargoou.web.servlet;
import com.utpcom.cargoou.web.validator.UsuarioValidator;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        accion = (accion == null) ? "LOG" : accion;
        String result;
        String target = "usuario.jsp";
        UsuarioValidator validator = new UsuarioValidator(request);
        switch (accion) {
            case "SEL":
                result = validator.usuarioSel();
                break;
            case "INS":
                result = validator.usuarioInsUpd(false);
                target = result == null ? "usuario.jsp" : "usuarioReg.jsp";
                break;
            case "DEL":
                result = validator.usuarioDel();
                target = "usuario.jsp";
                break;
            case "GET":
                result = validator.usuarioGet();
                target = "usuarioRegOk.jsp";
                break;
            case "UPD":
                result = validator.usuarioInsUpd(true);
                target = result == null ? "usuario.jsp" : "usuarioRegOk.jsp";
                break;
            case "LOG":
                result = validator.usuarioLog();
                target = result == null ? "login.jsp" : "inicio.jsp";
                break;
            case "":
                result = "Solicitud requerida";
                break;
            default:
                result = "Solicitud no reconocida";
        }
        if (result != null) {
            request.setAttribute("message", result);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(target);
        dispatcher.forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
