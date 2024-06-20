/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utpcom.cargoou.web.servlet;

import com.utpcom.cargoou.web.validator.BusValidator;
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
@WebServlet(name = "BusServlet", urlPatterns = {"/bus"})
public class BusServlet extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        accion = (accion == null) ? "SEL" : accion;
        String result;
        String target = "bus.jsp";
        BusValidator validator = new BusValidator(request);
        switch (accion) {
            case "SEL":
                result = validator.busSel();
                break;
            case "INS":
                result = validator.busInsUpd(false);
                target = result == null ? "bus.jsp" : "busReg.jsp";
                break;
            case "DEL":
                result = validator.busDel();
                target = "bus.jsp";
                break;
            case "GET":
                result = validator.busGet();
                target = "busRegOk.jsp";
                break;
            case "UPD":
                result = validator.busInsUpd(true);
                target = result == null ? "bus.jsp" : "busRegOk.jsp";
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
