package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to23then1dot41() {
        double expected = 1.41;
        Point first = new Point(1, 2);
        Point second = new Point(2, 3);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to01then2dot82() {
        double expected = 2.82;
        Point first = new Point(2, 3);
        Point second = new Point(0, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when72to34then4dot47() {
        double expected = 4.47;
        Point first = new Point(7, 2);
        Point second = new Point(3, 4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to00to20Then1() {
        double expected = 1;
        Point c = new Point(0, 3, 0);
        Point d = new Point(0, 2, 0);
        double dist = c.distance(d);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when07to23to14Then6dot7() {
        double expected = 6.7;
        Point c = new Point(0, 7, 2);
        Point d = new Point(3, 1, 4);
        double dist = c.distance(d);
        Assert.assertEquals(expected, dist, 0.01);
    }
}

