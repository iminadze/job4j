package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenForthMax() {
        int result = SqMax.max(1, 10, 20,40);
        assertThat(result, is(40));
    }
    @Test
    public void whenThirdMax() {
        int result = SqMax.max(10, 2, 40,6);
        assertThat(result, is(40));
    }
    @Test
    public void whenSecondMax() {
        int result = SqMax.max(1, 6, 2,4);
        assertThat(result, is(6));
    }
    @Test
    public void whenFirstMax() {
        int result = SqMax.max(1, 6, 2,4);
        assertThat(result, is(6));
    }
}
