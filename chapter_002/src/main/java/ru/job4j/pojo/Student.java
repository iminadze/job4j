package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private Date dateOfEnter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                group.equals(student.group) &&
                dateOfEnter.equals(student.dateOfEnter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, dateOfEnter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateOfEnter() {
        return dateOfEnter;
    }

    public void setDateOfEnter(Date dateOfEnter) {
        this.dateOfEnter = dateOfEnter;
    }
}
