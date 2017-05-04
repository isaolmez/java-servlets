package com.isa.headfirst.servlet.chapter6.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionApiTest extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(SessionApiTest.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("Serving GET request");
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        session.setAttribute("sessionAttribute1", "value1");
        session.setAttribute("sessionAttribute1", "value1");
        session.removeAttribute("sessionAttribute1");
        session.setMaxInactiveInterval(10);
        RequestDispatcher view = request.getRequestDispatcher("dispatched.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("Serving POST request");
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("TestSessionApi.do");
    }
}
