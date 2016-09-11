package com.michal.patterns.structural.decorator;


public class StandardSanwich implements Sandwich {

    @Override
    public String make() {
        return "Bread";
    }
}
