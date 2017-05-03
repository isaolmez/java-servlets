package com.isa.headfirst.servlet.chapter1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Chapter1Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Date today = new Date();
        writer.println("<html> " +
                "<body>" +
                "<h1 align=center>HF\'s Chapter1 Servlet</h1>" +
                "<br>" + today + "</body>" + "</html>");
    }
}
