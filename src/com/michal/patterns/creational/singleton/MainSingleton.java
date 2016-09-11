package com.michal.patterns.creational.singleton;

public class MainSingleton {

    public static void main(String[] args) {

        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println(mySingleton);
        System.out.println(mySingleton2);

        System.out.println(mySingleton == mySingleton2);
    }
}
