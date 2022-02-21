package oop;

public class PublicTransport {
    public static void main(String[] args) {
        Vehicle turbojet = new Airplain();
        Vehicle turboprop = new Airplain();
        Vehicle ramjet = new Airplain();
        Vehicle minibus = new Bus();
        Vehicle singleDecker = new Bus();
        Vehicle doubleDecker = new Bus();
        Vehicle tram = new Train();
        Vehicle metro = new Train();
        Vehicle longDistance = new Train();

        Vehicle[] vehicles = new Vehicle[]{turbojet, turboprop, ramjet, minibus, singleDecker,
                doubleDecker, tram, metro, longDistance};
        for (Vehicle i : vehicles) {
            i.move();
            i.transported();
        }
    }
}
