package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import java.util.List;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class AppleStoreTest {

    @Test
    void getLastHappyCustomer() {
        Queue<Customer> customers = new LinkedList<>(List.of(
                new Customer("Petr", 1000), new Customer("Stas", 1500),
                new Customer("Andrey", 850), new Customer("Alexei", 900),
                new Customer("Iryna", 1250), new Customer("Elena", 750),
                new Customer("Rail", 950)
        ));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastHappyCustomer();
        assertEquals(customer, ("Alexei"));
    }

    @Test
    void getFirstUpsetCustomer() {
        Queue<Customer> customers = new LinkedList<>(List.of(
                new Customer("Petr", 1000), new Customer("Stas", 1500),
                new Customer("Andrey", 850), new Customer("Alexei", 900),
                new Customer("Iryna", 1250), new Customer("Elena", 750),
                new Customer("Rail", 950)
        ));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        assertEquals(customer, ("Iryna"));
    }
}