package com.michal.patterns.structural.decorator;


public class CheeseDecorator extends SandwichDecorator {


    public CheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String addCheese() {
        return " + cheese";
    }

    public String make() {
        return sandwich.make() + this.addCheese();
    }
}
