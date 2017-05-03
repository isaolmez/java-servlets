package com.isa.headfirst.servlet.chapter3.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class BeerExpert {
    private static final Logger LOG = LoggerFactory.getLogger(BeerExpert.class);

    public List<String> getBrands(String color) {
        LOG.info("Entered getBrands() with: {}", color);

        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return (brands);
    }
}