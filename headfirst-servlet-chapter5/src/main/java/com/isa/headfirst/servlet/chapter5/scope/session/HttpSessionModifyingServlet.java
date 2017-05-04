package com.isa.headfirst.servlet.chapter5.scope.session;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class HttpSessionModifyingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * Modify the Http session and synchronize on session
         */
        HttpSession session = req.getSession();
        synchronized (session){
            session.setAttribute("sessionAttribute1", "value1");
            session.getAttribute("sessionAttribute1");
        }
    }
}
