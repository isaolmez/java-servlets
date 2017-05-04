package com.isa.headfirst.servlet.chapter5.scope.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ServletRequestModifyingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * Modify request attributes, no need to synchronize
         */
        req.setAttribute("requestAttribute1", "value1");
        req.getAttribute("requestAttribute1");
    }
}
