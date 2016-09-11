package com.michal.patterns.structural.adapter;



public class StudentAdapterCSV implements Student {

    private StudentCSV instance;

    public StudentAdapterCSV(StudentCSV instance) {
        this.instance = instance;
    }


    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }
}
