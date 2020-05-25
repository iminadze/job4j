package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ilya Inadze");
        student.setGroup("MO-06-4");
        student.setDateOfEnter(new Date());

        System.out.println(student.getName() + " is the student of " + student.getGroup() + " entered " + student.getDateOfEnter());
    }
}