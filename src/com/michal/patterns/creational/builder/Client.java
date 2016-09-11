package com.michal.patterns.creational.builder;


public class Client {

    public static void main(String[] args) {

        Menu.Builder builder = new Menu.Builder();
        builder.appetizer("wine").entree("chess").dessert("cookie").soup("fish soup");

        Menu menu = builder.build();

        System.out.println(menu.getSoup());
        System.out.println(menu.getEntree());
        System.out.println(menu.getDessert());
        System.out.println(menu.getAppetizer());
    }
}
