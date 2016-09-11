package com.michal.patterns.behavioral.mediator;


public class MediatorDemo {

    public static void main(String[] args) {

        ControlTowerMediator mediator = new ControlTowerMediator();

        Aircraft aircraftFrance = new Aircraft("Paris");
        Aircraft aircraftUsa = new Aircraft("USA");

        mediator.registerPlane(aircraftFrance);
        mediator.registerPlane(aircraftUsa);

        Command allAircraftUp = new AllAircraftUpCommand(mediator);
        allAircraftUp.execute();

        Command allAircraftDown = new AllAircraftDownCommand(mediator);
        allAircraftDown.execute();

    }

}
