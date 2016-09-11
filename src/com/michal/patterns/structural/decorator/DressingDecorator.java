package com.michal.patterns.structural.decorator;


public class DressingDecorator extends CheeseDecorator{

    public DressingDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String addDressing() {
        return " + sos";
    }

    public String make() {
        return sandwich.make() + addDressing();
    }
}
