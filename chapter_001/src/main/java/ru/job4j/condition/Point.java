package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public static void main(String[] args) {
        double firstdist = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + firstdist);
        double seconddist = distance(0, 0, 10, 0);
        System.out.println("result (0, 0) to (10, 0) " + seconddist);
        double thirddist = distance(2, 3, -5, -8);
        System.out.println("result (2, 3) to (-5, -8) " + thirddist);
    }
}
