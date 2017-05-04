package com.isa.headfirst.servlet.chapter6.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookieTest extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(CookieTest.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie nameCookie = new Cookie("name", "isa");
        nameCookie.setMaxAge(10);
        response.addCookie(nameCookie);
        PrintWriter out = response.getWriter();
        for (Cookie cookie : request.getCookies()) {
            out.write("Cookie name: " + cookie.getName() + " value: " + cookie.getValue());
        }
    }
}
