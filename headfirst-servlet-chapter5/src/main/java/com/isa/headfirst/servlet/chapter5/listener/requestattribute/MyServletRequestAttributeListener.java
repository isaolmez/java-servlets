package com.isa.headfirst.servlet.chapter5.listener.requestattribute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener{
    private static final Logger LOG = LoggerFactory.getLogger(MyServletRequestAttributeListener.class);

    @Override
    public void attributeAdded(ServletRequestAttributeEvent event) {
        LOG.info("Request attribute is added. Name: {}, value: {}", event.getName(), event.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent event) {
        LOG.info("Request attribute is removed. Name: {}, value: {}", event.getName(), event.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent event) {
        LOG.info("Request attribute is replaced. Name: {}, value: {}", event.getName(), event.getValue());
    }
}
