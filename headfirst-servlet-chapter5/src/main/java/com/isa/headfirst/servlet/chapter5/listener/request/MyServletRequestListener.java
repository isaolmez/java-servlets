package com.isa.headfirst.servlet.chapter5.listener.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyServletRequestListener.class);

    @Override
    public void requestInitialized(ServletRequestEvent event) {
        LOG.info("Request is initialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent event) {
        LOG.info("Request is destroyed");
    }
}
