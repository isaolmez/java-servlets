package com.isa.headfirst.servlet.chapter5.initparams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class InitParamsTester extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(InitParamsTester.class);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("Serving Get request");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writeServletInitParameters(writer);
        writeContextInitParameters(writer);
    }

    private void writeServletInitParameters(PrintWriter writer) {
        writer.println("-------------- Servlet Init Parameters <br />");
        Enumeration initParameterNames = getServletConfig().getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            writer.println("Servlet Param Name = " + initParameterNames.nextElement() + "<br />");
        }

        writer.println("Main email is " + getServletConfig().getInitParameter("mainEmail"));
        writer.println("<br />");
        writer.println("Admin email is " + getServletConfig().getInitParameter("adminEmail"));
        writer.println("<br />");
    }

    private void writeContextInitParameters(PrintWriter writer) {
        writer.println("-------------- Context Init Parameters <br/>");
        Enumeration contextInitParamEnumerator = getServletContext().getInitParameterNames();
        while (contextInitParamEnumerator.hasMoreElements()) {
            writer.println("Context Param Name = " + contextInitParamEnumerator.nextElement() + "<br />");
        }

        writer.println("Database name is " + getServletContext().getInitParameter("databaseName"));
        writer.println("<br />");
        writer.println("Database user is " + getServletContext().getInitParameter("databaseUser"));
        writer.println("<br />");
    }
}
