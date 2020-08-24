package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class StudentTest {

    @Test
    public void eqName() {
        Student first = new Student();
        first.setGroup("audio");
        Student second = new Student();
        second.setGroup("audio");
        assertThat(first, is(second));
    }
}
