package com.michal.patterns.behavioral.mediator;

public class Aircraft {

    private boolean aircraftInAir = false;

    private String destination = "";

    public Aircraft() {}

    public Aircraft(String destination) {
        this.destination = destination;
    }

    public boolean isAircraftInAir() {
        return aircraftInAir;
    }

    public void liftOff() {
        System.out.println(destination + " lift off!");
    }

    public void landing() {
        System.out.println(destination + " landing!");
    }

    public void toggle() {
        if(aircraftInAir) {
            landing();
            aircraftInAir = false;
        } else {
            liftOff();
            aircraftInAir = true;
        }
    }

}
