package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {
    @Test
    public void manWeight() {
        int in = 180;
        int expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void womanWeight() {
        int in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
