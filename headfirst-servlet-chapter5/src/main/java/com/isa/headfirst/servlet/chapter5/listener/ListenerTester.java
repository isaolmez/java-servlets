package com.isa.headfirst.servlet.chapter5.listener;

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
        Dog dog = (Dog) getServletContext().getAttribute("dog");
        PrintWriter writer = response.getWriter();
        writer.printf("Dog: %s <br />", dog);
    }
}
