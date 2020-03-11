package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String var = "Неизвестное слово " + eng;
        return var;
    }
    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String say = word.engToRus("egg");
        System.out.println(say);
    }
}
