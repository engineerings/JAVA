package com.michal.patterns.behavioral.memento;


import java.util.Stack;

public class Caretaker {

    private Stack<WorkerMemento> workerHistory = new Stack<>();

    public void save(Worker worker) {
        workerHistory.push(worker.save());
    }

    public void revert(Worker worker) {
        worker.revert(workerHistory.pop());
    }



}
