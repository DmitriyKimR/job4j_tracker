package ru.job4j.tracker.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " поезд передвигается по рельсам.");
    }

    @Override
    public void transported() {
        System.out.println(getClass().getSimpleName()
                + " поезд перевозит грузы и пассажиров по рельсам.");

    }
}
