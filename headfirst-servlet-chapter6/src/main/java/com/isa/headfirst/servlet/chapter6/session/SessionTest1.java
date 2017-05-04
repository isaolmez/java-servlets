package com.isa.headfirst.servlet.chapter6.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionTest1 extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(SessionTest1.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if (session.isNew()) {
            out.write("Hello!");
        } else {
            out.write("Welcome Back!");
        }
    }
}
