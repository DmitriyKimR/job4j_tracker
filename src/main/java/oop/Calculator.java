package oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println(result);
        result = minus(5);
        System.out.println(result);
        result = calculator.divide(6);
        System.out.println(result);
        result = calculator.sumAllOperation(6);
        System.out.println(result);
    }
}
