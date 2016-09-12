package com.michal.patterns.behavioral.memento;


public class WorkerMemento {

    private String name;

    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public WorkerMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
