package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void whenItemAscByNameSort() {
        Item first = new Item("Table");
        Item second = new Item("Chair");
        Item third = new Item("Sofa");
        Item fourth = new Item("Closet");
        List<Item> items = new ArrayList<>(List.of(first,
                second,third, fourth));
        items.sort(new ItemAscByName());
        List<Item> expected = new ArrayList<>(List.of(second, fourth, third, first));
        assertEquals(expected, items);
    }

    @Test
    public void whenItemDescByNameSort() {
        Item first = new Item("Table");
        Item second = new Item("Chair");
        Item third = new Item("Sofa");
        Item fourth = new Item("Closet");
        List<Item> items = new ArrayList<>(List.of(first,
                second,third, fourth));
        items.sort(new ItemDescByName());
        List<Item> expected = new ArrayList<>(List.of(first, third, fourth, second));
        assertEquals(expected, items);
    }
}