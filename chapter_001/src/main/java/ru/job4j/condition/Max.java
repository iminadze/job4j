package ru.job4j.condition;
public class Max {
    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }
    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return (temp > third) ? temp : third;
    }
    public static int max(int first, int second, int third, int fourth) {
        int temp1 = max(first, second);
        int temp2 = max(third, fourth);
        return (temp1 > temp2) ? temp1 : temp2;
    }
}
