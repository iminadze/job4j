package ru.job4j.calculator;
/**
 * Класс для вычисления арифметических операций + - * /.
 * @author iminadze
 * @since 30.10.19
 * @version 1
 */
public class Calculator {
    /**
     *  Сложение.
     *@param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     *  Вычитание.
     *@param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public static void subtract(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }
    /**
     * Умножение.
     *@param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    /**
     *  Деление.
     *@param first первый аргумент.
     * @param second второй аргумент.
     * @return результат.
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        subtract(6, 3);
        multiply(4, 2);
        div(10, 5);
    }
}
