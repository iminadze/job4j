package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        System.out.println(tracker.findById( 2 ));
    }
}
