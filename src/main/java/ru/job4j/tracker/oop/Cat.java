package ru.job4j.tracker.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food. ");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food. ");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }
}