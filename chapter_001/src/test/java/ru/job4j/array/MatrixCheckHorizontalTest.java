package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckHorizontalTest {

    @Test
    public void whenHasMonoHorizont() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheckHorizontal.monoHorizont(input, 1);
        assertThat(result, is(true));
    }
}
