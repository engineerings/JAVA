package com.michal.patterns.structural.bridge;


import java.util.List;

public class PrintArranger implements Arranger{


    @Override
    public String arrange(String header, List<Component> components) {

        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for(Component component : components) {
            builder.append(component.getLabel());
            builder.append(" :  ");
            builder.append(component.getValue());
            builder.append("\n");
        }

        return builder.toString();
    }
}
