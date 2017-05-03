package com.isa.headfirst.servlet.chapter5.listener.servletcontext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        final String breed = event.getServletContext().getInitParameter("breed");
        Dog dog = new Dog(breed);
        event.getServletContext().setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        event.getServletContext().removeAttribute("dog");
    }
}
