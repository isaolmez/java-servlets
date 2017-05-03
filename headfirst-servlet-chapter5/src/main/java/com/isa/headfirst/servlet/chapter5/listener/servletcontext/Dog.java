package com.isa.headfirst.servlet.chapter5.listener.servletcontext;

import java.io.Serializable;

public class Dog implements Serializable {
    private final String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
