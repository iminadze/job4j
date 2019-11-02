package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double a = ((0.5 * p) / (k + 1));
        return a * k * a;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
