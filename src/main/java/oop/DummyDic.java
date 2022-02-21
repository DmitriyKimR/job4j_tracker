package oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic variant = new DummyDic();
        String result = variant.engToRus("wallet");
        System.out.println(result);
    }
}