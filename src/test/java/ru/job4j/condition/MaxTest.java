package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To5Then8() {
        int left = 8;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To6Then6() {
        int left = 3;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMa11To11Then11() {
        int left = 11;
        int right = 11;
        int result = Max.max(left, right);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}