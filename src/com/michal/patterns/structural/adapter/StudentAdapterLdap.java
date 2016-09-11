package com.michal.patterns.structural.adapter;


public class StudentAdapterLdap implements Student {

    private StudentLdap instance;

    public StudentAdapterLdap(StudentLdap instance) {

        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    public String toString() {
        return "ID: " + instance.getCn();
    }
}
