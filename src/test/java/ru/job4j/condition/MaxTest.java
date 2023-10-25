package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax9To2To5Then9() {
        int first = 9;
        int second = 2;
        int third = 5;
        int rsl = new Max().max(first, second, third);
        int expected = 9;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenMax1To2To5To7Then7() {
        int first = 1;
        int second = 2;
        int third = 5;
        int four = 7;
        int rsl = new Max().max(first, second, third, four);
        int expected = 7;
        Assert.assertEquals(expected, rsl);
    }
}