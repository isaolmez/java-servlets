package com.isa.headfirst.servlet.chapter6.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyHttpSessionAttributeListener.class);

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        LOG.info("Attribute is added. Name: " + event.getName() + " value: " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        LOG.info("Attribute is removed. Name: " + event.getName() + " value: " + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        LOG.info("Attribute is replaced. Name: " + event.getName() + " value: " + event.getValue());
    }
}
