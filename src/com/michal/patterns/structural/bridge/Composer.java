package com.michal.patterns.structural.bridge;


import java.util.List;

public abstract class Composer {

    public String compose(Arranger arranger) {

        return arranger.arrange(getHeader(), getComponents());
    }
    protected abstract String getHeader();

    protected abstract List<Component> getComponents();

}
