package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Oleg Arsentev");
        map.put("lavrov@yandex.ru", "Sergey Lavrov");
        map.put("ivanov@yandex.ru", "Petr Ivanov");
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
