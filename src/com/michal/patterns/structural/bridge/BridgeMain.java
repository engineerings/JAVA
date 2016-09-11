package com.michal.patterns.structural.bridge;



public class BridgeMain {

    public static void main(String[] args) {

        Dish dish = new Dish();
        dish.setName("Big Star");
        dish.setType("Fish");
        dish.setPrice("$15.55");

        Arranger printArranger = new PrintArranger();
        Composer dishComposer  = new DishComposeer(dish);

        String printedMenu = dishComposer.compose(printArranger);

        System.out.println(printedMenu);
    }
}
