package com.isa.headfirst.servlet.chapter5.scope.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextModifyingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * Modify servlet context and synchronize on ServletContext
         */
        ServletContext servletContext = getServletContext();
        synchronized (servletContext){
            servletContext.setAttribute("contextAttribute1", "value1");
            servletContext.getAttribute("contextAttribute1");
        }
    }
}
