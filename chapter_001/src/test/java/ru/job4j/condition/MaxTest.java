package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenThreeValues() {
        int result = Max.max(4, 9, 6);
        assertThat(result, is(9));
    }
    @Test
    public void whenThreeValues1() {
        int result = Max.max(4, 1, 10);
        assertThat(result, is(10));
    }
    @Test
    public void whenFourValues() {
        int result = Max.max(3, 7, 6, 11);
        assertThat(result, is(11));
    }
    @Test
    public void whenFourValues1() {
        int result = Max.max(3, 7, 11, 1);
        assertThat(result, is(11));
    }
}
