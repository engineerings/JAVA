package com.michal.patterns.structural.decorator;


public class MainDecorator {

    public static void main(String args []) {

        Sandwich sandwich = new DressingDecorator(new CheeseDecorator(new StandardSanwich()));

        System.out.println(sandwich.make());
    }
}
