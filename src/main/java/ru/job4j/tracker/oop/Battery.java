package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(30);
        System.out.println("Battery first : " + first.load + " Battery second : " + second.load);
        first.exchange(second);
        System.out.println("Battery first : " + first.load + " Battery second : " + second.load);
    }
}
