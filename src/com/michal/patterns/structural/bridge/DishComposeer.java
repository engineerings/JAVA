package com.michal.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class DishComposeer extends Composer {

    private Dish dish;

    public DishComposeer(Dish dish) {
        this.dish = dish;
    }

    @Override
    protected String getHeader() {
        return dish.getName();
    }

    @Override
    protected List<Component> getComponents() {
        List<Component> components = new ArrayList<>();
        components.add(new Component("Type", dish.getType()));
        components.add(new Component("Price",dish.getPrice()));

        return components;
    }
}
