package oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()
                + " автобус двигается по скоростным трассам.");
    }

    @Override
    public void transported() {
        System.out.println(getClass().getSimpleName()
                + " автобус перевозит пассажиров и грузы по скоростным трассам");

    }
}
