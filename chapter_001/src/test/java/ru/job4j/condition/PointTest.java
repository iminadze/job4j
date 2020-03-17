package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void pointDistance() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double out = first.distance(second);
        Assert.assertEquals(2, out, 0.01);
    }
    public void pointDistance1() {
        Point first = new Point(0, 0);
        Point second = new Point(10, 0);
        double out = first.distance(second);
        Assert.assertEquals(10, out, 0.01);
    }
    @Test
    public void pointDistance2() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 2);
        double out = first.distance3d(second);
        Assert.assertEquals(2, out, 0.01);
    }
    @Test
    public void pointDistance3() {
        Point first = new Point(5, 5, 5);
        Point second = new Point(4, 4, 4);
        double out = first.distance3d(second);
        Assert.assertEquals(1.73, out, 0.01);
    }
}
