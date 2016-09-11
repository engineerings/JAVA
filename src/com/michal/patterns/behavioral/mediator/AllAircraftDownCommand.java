package com.michal.patterns.behavioral.mediator;


public class AllAircraftDownCommand implements Command{

    private ControlTowerMediator mediator;

    public AllAircraftDownCommand(ControlTowerMediator mediator) {
        this.mediator = mediator;
    }


    @Override
    public void execute() {
        mediator.unloadPlanes();
    }
}
