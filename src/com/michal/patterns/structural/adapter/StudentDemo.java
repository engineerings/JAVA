package com.michal.patterns.structural.adapter;


import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {

        StudentClient client = new StudentClient();

        List<Student> students = client.getStudentList();

        System.out.println(students);

    }
}
