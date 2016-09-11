package com.michal.patterns.structural.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ShopInventory {

    private final ShopCatalogue catalogue = new ShopCatalogue();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    public void takeOrder(int orderNumber, String productName) {
        Product product = catalogue.getProduct(productName);
        Order order = new Order(orderNumber, product);
        orders.add(order);
    }

    public void processOrder() {

        for(Order order: orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    public String report() {

        return "Total products processed: "
                + catalogue.productsCount();
    }
}
