package ru.job4j.exceptions;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNNegativeNumber() {
        int rsl = new Fact().calc(-6);
        assertThat(rsl, is(0));
    }
}