package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = map::put;
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");
        BiPredicate<Integer, String> biPred = (i, s) -> {
            if (i % 2 == 0 || s.length() == 4) {
                System.out.println("key: " + i + " value: " + s);
            }
            return true;
        };
        for (Integer i : map.keySet()) {
            biPred.test(i, map.get(i));
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        Consumer<String> con = System.out::println;
        Function<String, String> func = String::toUpperCase;
        for (String string : sup.get()) {
            func.apply(string);
        }
    }
}
