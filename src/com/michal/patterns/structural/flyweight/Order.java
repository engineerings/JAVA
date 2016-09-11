package com.michal.patterns.structural.flyweight;


public class Order {

    private final int orderNumber;
    private final Product product;

    public Order(int orderNumber, Product product) {
        this.orderNumber = orderNumber;
        this.product = product;
    }

    public void processOrder() {
        System.out.println(
                "Processing order number: " + orderNumber
                + " for product: " + product
        );
    }
}
