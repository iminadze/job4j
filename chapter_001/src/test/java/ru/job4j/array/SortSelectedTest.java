package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {5, 4, 2, 1, 3};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortMas() {
        int[] input = new int[] {20, 7, 1, 9, 11, 15, 22};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[] {1, 7, 9, 11, 15, 20, 22};
        assertThat(result, is(expect));
    }
}
