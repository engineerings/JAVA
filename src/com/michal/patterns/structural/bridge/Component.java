package com.michal.patterns.structural.bridge;

public class Component {

    private String label;
    private String value;

    public Component(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
