package com.michal.patterns.behavioral.mediator;


public class AllAircraftUpCommand implements Command{

    private ControlTowerMediator mediator;

    public AllAircraftUpCommand(ControlTowerMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.takeOff();
    }



}
