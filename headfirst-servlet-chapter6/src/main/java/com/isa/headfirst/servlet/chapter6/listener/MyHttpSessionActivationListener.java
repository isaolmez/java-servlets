package com.isa.headfirst.servlet.chapter6.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class MyHttpSessionActivationListener implements HttpSessionActivationListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyHttpSessionActivationListener.class);

    @Override
    public void sessionWillPassivate(HttpSessionEvent event) {
        LOG.info("Session is migrating");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent event) {
        LOG.info("Session is migrated");
    }
}
