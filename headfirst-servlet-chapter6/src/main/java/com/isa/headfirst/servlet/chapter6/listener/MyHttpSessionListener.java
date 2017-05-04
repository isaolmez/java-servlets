package com.isa.headfirst.servlet.chapter6.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyHttpSessionListener.class);

    private static int sessionCount = 0;

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        sessionCount++;
        LOG.info("Session is created. New count: " + sessionCount);
    }

    /**
     * This is called lazily, when a new request has come
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        sessionCount--;
        LOG.info("Session is destroyed. New count: " + sessionCount);
    }
}
