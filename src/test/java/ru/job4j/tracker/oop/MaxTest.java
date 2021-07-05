package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenOne12Two9Max12() {
        int one = 12;
        int two = 9;
        int result = Max.max(one, two);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne8Two16Max16() {
        int one = 8;
        int two = 16;
        int result = Max.max(one, two);
        int expected = 16;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne3Two8Three5Max8() {
        int one = 3;
        int two = 8;
        int three = 5;
        int result = Max.max(one, two, three);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne10Two8Three5Max10() {
        int one = 10;
        int two = 8;
        int three = 5;
        int result = Max.max(one, two, three);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne3Two8Three16Max16() {
        int one = 3;
        int two = 8;
        int three = 16;
        int result = Max.max(one, two, three);
        int expected = 16;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne3Two8Three16Four26Max26() {
        int one = 3;
        int two = 8;
        int three = 16;
        int four = 26;
        int result = Max.max(one, two, three, four);
        int expected = 26;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne23Two8Three16Four6Max23() {
        int one = 23;
        int two = 8;
        int three = 16;
        int four = 6;
        int result = Max.max(one, two, three, four);
        int expected = 23;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne23Two48Three16Four6Max48() {
        int one = 23;
        int two = 48;
        int three = 16;
        int four = 6;
        int result = Max.max(one, two, three, four);
        int expected = 48;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenOne23Two48Three54Four6Max54() {
        int one = 23;
        int two = 48;
        int three = 54;
        int four = 6;
        int result = Max.max(one, two, three, four);
        int expected = 54;
        Assert.assertEquals(result, expected);
    }
}