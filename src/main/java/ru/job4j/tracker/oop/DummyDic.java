package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic variant = new DummyDic();
        String word = variant.engToRus("wallet");
        System.out.println("Неизвестное слово. " + word);
    }
}