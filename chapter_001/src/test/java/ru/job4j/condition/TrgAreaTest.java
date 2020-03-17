package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {
    @Test
    public void areaTriangle() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        TrgArea trgArea = new TrgArea(first, second, third);
        double result = trgArea.area();
        Assert.assertEquals(2, result, 0.01);
    }
    @Test
    public void areaTriangle1() {
        Point first = new Point(0, 0);
        Point second = new Point(5, 0);
        Point third = new Point(-5, 0);
        TrgArea trgArea = new TrgArea(first, second, third);
        double result = trgArea.area();
        Assert.assertEquals(-1, result, 0.01);
    }
    @Test
    public void areaTriangle2() {
        Point first = new Point(0, 0);
        Point second = new Point(-5, -5);
        Point third = new Point(9, 9);
        TrgArea trgArea = new TrgArea(first, second, third);
        double result = trgArea.area();
        Assert.assertEquals(-1, result, 0.01);
    }
}
