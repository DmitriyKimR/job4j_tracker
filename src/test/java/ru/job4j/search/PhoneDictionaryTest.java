package ru.job4j.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    void add() {
    }

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Sergey", "Ivanov", "687543", "Moscow")

        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindNothing() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
    ArrayList<Person> person = phones.find("Oleg");
    Assertions.assertTrue(person.isEmpty());
    }

    @Test
    public void whenFindBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")

        );
        phones.add(
                new Person("Sergey", "Ivanov", "687543", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Arsentev");
        assertThat(persons.get(0).getName()).isEqualTo("Petr");
    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")

        );
        phones.add(
                new Person("Sergey", "Ivanov", "687543", "Moscow")
        );
        ArrayList<Person> persons = phones.find("Moscow");
        assertThat(persons.get(0).getName()).isEqualTo("Sergey");
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")

        );
        phones.add(
                new Person("Sergey", "Ivanov", "687543", "Moscow")
        );
        ArrayList<Person> persons = phones.find("534872");
        assertThat(persons.get(0).getName()).isEqualTo("Petr");
    }
}