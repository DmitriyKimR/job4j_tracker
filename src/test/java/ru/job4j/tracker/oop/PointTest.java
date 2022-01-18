package ru.job4j.tracker.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceFrom00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double distance = a.distance(b);
        double expected = 2;
        Assert.assertEquals(distance, expected, 0.001);
    }

    @Test
    public void distanceFrom20To02Then2() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        double expected = 2.828d;
        Assert.assertEquals(distance, expected, 0.001);
    }

    @Test
    public void distance3dFrom200To000Then2() {
        Point c = new Point(2, 0, 0);
        Point d = new Point(0, 0, 0);
        double distance = c.distance3d(d);
        double expected = 2;
        Assert.assertEquals(distance, expected, 0.001);
    }

    @Test
    public void distance3dFrom020To000Then2() {
        Point c = new Point(0, 2, 0);
        Point d = new Point(0, 0, 0);
        double distance = c.distance3d(d);
        double expected = 2;
        Assert.assertEquals(distance, expected, 0.001);
    }

    @Test
    public void distance3dFrom000To004Then4() {
        Point c = new Point(0, 0, 0);
        Point d = new Point(0, 0, 4);
        double distance = c.distance3d(d);
        double expected = 4;
        Assert.assertEquals(distance, expected, 0.001);
    }
}