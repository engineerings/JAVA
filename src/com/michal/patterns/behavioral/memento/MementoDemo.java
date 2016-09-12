package com.michal.patterns.behavioral.memento;


public class MementoDemo {

    public static void main(String args[]) {

        //caretaker new
        Caretaker caretaker = new Caretaker();

        Worker worker = new Worker();
        worker.setName("Mike");
        worker.setAddress("Mars");
        worker.setPhone("000-000-001");

        caretaker.save(worker);

        System.out.println(worker);

        worker.setName("Jim");

        caretaker.save(worker);

        System.out.println(worker);

        worker.setName("Alan");

        caretaker.save(worker);

        System.out.println(worker);

        caretaker.revert(worker);

        System.out.println(worker);

        caretaker.revert(worker);

        System.out.println(worker);

        caretaker.revert(worker);

        System.out.println(worker);


    }
}
