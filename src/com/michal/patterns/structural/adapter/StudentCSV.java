package com.michal.patterns.structural.adapter;

import java.util.StringTokenizer;

public class StudentCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public StudentCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if(tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if(tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            email = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
