package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Item( "Заявка  1"));
        tracker.add(new Item( "Заявка  2"));
        System.out.println(tracker.findById( 2 ));
    }
}