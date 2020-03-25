package ru.job4j.oop;

public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Predator");
    }
    public Predator(String name) {
        super("Animal");
        System.out.println(name);
    }
}
