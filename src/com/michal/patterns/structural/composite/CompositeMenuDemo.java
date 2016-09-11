package com.michal.patterns.structural.composite;

public class CompositeMenuDemo {

    public static void main(String[] args) {

        Menu mainMenu = new Menu("Main", "/main");

        MenuItem securityMenuItem = new MenuItem("Security", "/security");

        mainMenu.add(securityMenuItem);

        Menu subMenu = new Menu("Submenu", "/subMenu");

        MenuItem subMenuItem = new MenuItem("SubMenuItem", "/subMenuItem");

        subMenu.add(subMenuItem);

        mainMenu.add(subMenu);

        MenuItem personalSubMenuItem = new MenuItem("Personal SubMenuItem", "/personalSubMenuItem");

        mainMenu.add(personalSubMenuItem);

        System.out.println(mainMenu.toString());

    }
}
