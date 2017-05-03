package com.isa.headfirst.servlet.chapter5.listener;

import com.isa.headfirst.servlet.chapter5.listener.servletcontext.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListenerTester extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(ListenerTester.class);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("Serving Get request");

        response.setContentType("text/html");

        // Get the servlet context attribute populated from ServletContextListener
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        PrintWriter writer = response.getWriter();
        writer.printf("Dog: %s <br />", dog);

        // Change servlet context attribute and trigger ServletContextAttributeListener
        getServletContext().setAttribute("contextAttribute1", "value1");
        getServletContext().setAttribute("contextAttribute1", "value2");
        getServletContext().removeAttribute("contextAttribute1");

        // Change request attribute and trigger ServletRequestAttributeListener
        request.setAttribute("requestAttribute1", "value1");
        request.setAttribute("requestAttribute1", "value2");
        request.removeAttribute("requestAttribute1");
    }
}
