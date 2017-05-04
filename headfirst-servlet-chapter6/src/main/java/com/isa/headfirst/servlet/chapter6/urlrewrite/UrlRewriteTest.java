package com.isa.headfirst.servlet.chapter6.urlrewrite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class UrlRewriteTest extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(UrlRewriteTest.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // Create/Get session
        request.getSession();
        out.println("<a href='" + response.encodeURL("TestSession1.do") + "'>click me</a>");
        out.println("<p> Rewrited Url: " + response.encodeURL("TestSession1.do"));
    }
}
