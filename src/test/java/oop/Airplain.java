package oop;

public class Airplain implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " самолет летает по воздуху.");
    }

    @Override
    public void transported() {
        System.out.println(getClass().getSimpleName()
                + " перевозит грузы и пассажиров по воздуху.");

    }
}
