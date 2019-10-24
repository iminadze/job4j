package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int max2 = (first>second)? first:second;
        return (max2>third)? max2:third;
    }
}
