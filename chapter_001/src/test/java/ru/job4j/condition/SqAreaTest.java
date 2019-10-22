package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void sqArea() {
        int inP = 6;
        int inK = 2;
        int expected = 2;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void sqArea1() {
        int inP = 10;
        int inK = 2;
        double expected = 5.55;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}
