package com.pinwheel.web;

import com.pinwheel.bean.SessionBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CreateTicketServlet")
public class CreateTicketServlet extends javax.servlet.http.HttpServlet {
    @EJB
    private SessionBean sessionBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        request.getSession().setAttribute("records", new ArrayList<String>());
        dispatcher = request.getRequestDispatcher("createticket.jsp");
        dispatcher.forward(request, response);
    }
}
