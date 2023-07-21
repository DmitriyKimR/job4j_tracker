package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>(List.of(
                new Order("3sfe", "Dress")));
        HashMap<String, Order> map = OrderConvert.process(orders);
        Order expected = new Order("3sfe", "Dress");
        assertEquals(expected, map.get("3sfe"));

    }

    @Test
    public void whenDuplicateOrders() {
        List<Order> orders = new ArrayList<>(List.of(
                new Order("3sfe", "Dress"),
                new Order("3sfe", "Shoes"),
                new Order("3sfe", "Phone")
        ));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(1, map.size());
    }
}