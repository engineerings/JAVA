package com.michal.patterns.creational.builder;


public class Menu {

    public static class Builder {

        private String soup;
        private String appetizer;
        private String entree;
        private String dessert;

        public Builder soup(String soup) {
            this.soup = soup;
            return this;
        }

        public Builder appetizer(String appetizer) {
            this.appetizer = appetizer;
            return this;
        }

        public Builder entree(String entree) {
            this.entree = entree;
            return this;
        }

        public Builder dessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder() {}

        public Menu build() {
            return new Menu(this);
        }

    }


    private final String soup;
    private final String appetizer;
    private final String entree;
    private final String dessert;

    public Menu(Builder builder) {
        this.soup = builder.soup;
        this.appetizer = builder.appetizer;
        this.entree = builder.entree;
        this.dessert = builder.dessert;
    }

    public String getSoup() {
        return soup;
    }

    public String getAppetizer() {
        return appetizer;
    }

    public String getEntree() {
        return entree;
    }

    public String getDessert() {
        return dessert;
    }
}
