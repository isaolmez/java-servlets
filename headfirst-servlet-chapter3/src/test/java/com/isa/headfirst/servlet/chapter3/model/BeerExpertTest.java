package com.isa.headfirst.servlet.chapter3.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class BeerExpertTest {

    private BeerExpert beerExpert;

    @Before
    public void setUp() {
        this.beerExpert = new BeerExpert();
    }

    @Test
    public void shouldReturnBrands_WhenColorIsAmber() {
        final String color = "amber";
        List<String> brands = beerExpert.getBrands(color);

        assertNotNull(brands);
        assertEquals(2, brands.size());
        assertTrue(brands.contains("Jack Amber"));
        assertTrue(brands.contains("Red Moose"));
    }

    @Test
    public void shouldReturnBrands_WhenColorIsNotAmber() {
        final String color = "brown";
        List<String> brands = beerExpert.getBrands(color);

        assertNotNull(brands);
        assertEquals(2, brands.size());
        assertTrue(brands.contains("Jail Pale Ale"));
        assertTrue(brands.contains("Gout Stout"));
    }
}
