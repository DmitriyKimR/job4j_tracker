package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueTestTest {

    @Test
    public void isEquals() {
        UniqueTest uniqueTest = new UniqueTest();
        String origin = "My cat eats a mouse";
        String text = "My cat eats a mouse";
        assertTrue(uniqueTest.isEquals(origin, text));
    }

    @Test
    public void isNotEqual() {
        UniqueTest uniqueTest = new UniqueTest();
        String origin = "My cat eats a mouse";
        String text = "A mouse is eaten by a cat";
        assertFalse(uniqueTest.isEquals(origin, text));
    }
}