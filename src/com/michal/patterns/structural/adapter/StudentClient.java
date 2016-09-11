package com.michal.patterns.structural.adapter;


import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList() {

        List<Student> students = new ArrayList<>();

        StudentFromDb studentFromDb = new StudentFromDb("1", "michal", "tracy", "michal@test.com");

        students.add(studentFromDb);

        StudentLdap studentLdap = new StudentLdap("jim", "joe", "joe44", "joe44@joe.com");

        students.add(new StudentAdapterLdap(studentLdap));

        StudentCSV studentCSV = new StudentCSV("777,john,ramses,john77@test.com");

        students.add(new StudentAdapterCSV(studentCSV));

        return students;
    }
}
