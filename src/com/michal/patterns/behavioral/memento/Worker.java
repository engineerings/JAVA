package com.michal.patterns.behavioral.memento;


public class Worker {

    private String name;

    private String phone;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public WorkerMemento save() {
        return new WorkerMemento(name, phone);
    }

    public void revert(WorkerMemento workerMemento) {
        this.name = workerMemento.getName();
        this.phone = workerMemento.getPhone();
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }
}
