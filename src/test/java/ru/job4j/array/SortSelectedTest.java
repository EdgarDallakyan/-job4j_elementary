package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith3Numbers() {
        int[] data = new int[] {11, 9, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {9, 10, 11};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith5Numbers() {
        int[] data = new int[] {199, 201, 197, 200, 198};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {197, 198, 199, 200, 201};
        assertThat(result).containsExactly(expected);
    }
}