package com.michal.patterns.structural.flyweight;


public class Client {

    public static void main(String[] args) {

        ShopInventory inventory = new ShopInventory();
        inventory.takeOrder(1, "MacBook Pro");
        inventory.takeOrder(2, "MacBook Pro");
        inventory.takeOrder(3, "MacBook Pro");
        inventory.takeOrder(4, "Sony PC");
        inventory.takeOrder(5, "Philips PC");

        inventory.processOrder();

        System.out.println(inventory.report());
    }



}
