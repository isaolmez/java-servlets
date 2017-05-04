package com.isa.headfirst.servlet.chapter6.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class MyHttpSessionAttribute implements HttpSessionBindingListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyHttpSessionAttribute.class);

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        LOG.info("I am being bound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        LOG.info("I am being unbound");
    }
}
