package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person each : person) {
            if (each.getName().contains(key) || each.getPhone().contains(key)
                    || each.getSurname().contains(key) || each.getAddress().contains(key)) {
                result.add(each);
            }
        }
        return result;
    }
}
