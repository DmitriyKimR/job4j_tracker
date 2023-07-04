package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collection;

public class UsageArrayList {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Petr");
        collection.add("ivan");
        collection.add("Stepan");
        for (Object value : collection) {
            System.out.println(value);
        }
    }
}
