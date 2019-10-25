package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenForthMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(1, 2, 4,6);
        assertThat(result, is(6));
    }
    @Test
    public void whenThirdMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(1, 2, 6,4);
        assertThat(result, is(6));
    }
    @Test
    public void whenSecondMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(1, 6, 2,4);
        assertThat(result, is(6));
    }
    @Test
    public void whenFirstMax() {
        SqMax check = new SqMax();
        int result = SqMax.max(1, 6, 2,4);
        assertThat(result, is(6));
    }
}
