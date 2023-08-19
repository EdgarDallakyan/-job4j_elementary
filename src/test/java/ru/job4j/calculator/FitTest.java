package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenMan187Then100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void whenWoman167Then65() {
        short in = 167;
        double expected = 65.55;
        double out = Fit.womanWeight(in);
       Assert.assertEquals(expected, out, 0.01);
    }
}