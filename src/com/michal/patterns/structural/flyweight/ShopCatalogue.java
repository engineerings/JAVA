package com.michal.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShopCatalogue {

    private Map<String, Product> productCatalogue = new HashMap<>();

    // factory method
    public Product getProduct(String productName) {
        if(!productCatalogue.containsKey(productName)) {
            productCatalogue.put(productName, new Product(productName));
        }
        return productCatalogue.get(productName);
    }

    public int productsCount() {
        return productCatalogue.size();
    }
}
