package com.isa.headfirst.servlet.chapter5.initparams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class DispatchInitParamsTester extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(DispatchInitParamsTester.class);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("Serving Get request");
        response.setContentType("text/html");

        final Map<String, String> servletInitParams = getServletInitParameters();
        request.setAttribute("servletInitParameters", servletInitParams);

        final Map<String, String> contextInitParams = getContextInitParameters();
        request.setAttribute("contextInitParameters", contextInitParams);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("dispatched.jsp");
        requestDispatcher.forward(request, response);
    }

    private Map<String, String> getServletInitParameters() {
        Enumeration<String> servletInitParameterEnumerator = getServletConfig().getInitParameterNames();
        Map<String, String> servletInitParameters = new HashMap<>();
        while (servletInitParameterEnumerator.hasMoreElements()) {
            String key = servletInitParameterEnumerator.nextElement();
            servletInitParameters.put(key, getServletConfig().getInitParameter(key));
        }

        return servletInitParameters;
    }

    private Map<String, String> getContextInitParameters() {
        Enumeration<String> contextInitParameterEnumerator = getServletContext().getInitParameterNames();
        Map<String, String> contextInitParams = new HashMap<>();
        while (contextInitParameterEnumerator.hasMoreElements()) {
            String key = contextInitParameterEnumerator.nextElement();
            contextInitParams.put(key, getServletContext().getInitParameter(key));
        }

        return contextInitParams;
    }
}
