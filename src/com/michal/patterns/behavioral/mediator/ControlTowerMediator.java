package com.michal.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTowerMediator {

    private List<Aircraft> aircraftList = new ArrayList<>();

    public void registerPlane(Aircraft plane) {
        this.aircraftList.add(plane);
    }

    public void unloadPlanes() {
        for(Aircraft plane : aircraftList) {
            if(plane.isAircraftInAir()) {
                plane.toggle();
            }
        }
    }

    public void takeOff() {
        for(Aircraft plane : aircraftList) {
            if(!plane.isAircraftInAir()) {
                plane.toggle();
            }
        }
    }

}
