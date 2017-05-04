package com.isa.headfirst.servlet.chapter5.listener.servletcontextattribute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyServletContextAttributeListener.class);

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        LOG.info("Context attribute is added. Name: {},  value: {}", event.getName(), event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        LOG.info("Context attribute is removed. Name: {},  value: {}", event.getName(), event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        LOG.info("Context attribute is replaced. Name: {},  old value: {}", event.getName(), event.getValue());
    }
}
