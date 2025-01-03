package org.example.Algorithms;

import org.junit.Test;

import static org.example.Algorithms.SortingAlgorithms.bubbleSort;
import static org.example.Algorithms.SortingAlgorithms.selectionSort;
import static org.junit.Assert.assertArrayEquals;

public class SortingAlgorithmsTest {
    final int[] EXPECTED_SORTED_ARRAY = {2, 10, 15, 21, 30, 40, 50, 62, 100};

    @Test
    public void GIVEN_unsorted_array_THEN_sort_using_bubbleSort() {
        // GIVEN
        final int[] ARRAY_TO_SORT = {21, 10, 15, 40, 30, 2, 50, 100, 62};

        // THEN
        bubbleSort(ARRAY_TO_SORT);

        assertArrayEquals(EXPECTED_SORTED_ARRAY, ARRAY_TO_SORT);
    }

    @Test
    public void GIVEN_unsorted_array_THEN_sort_using_selectionSort() {
        // GIVE
        final int[] ARRAY_TO_SORT = {21, 10, 15, 40, 30, 2, 50, 100, 62};

        // THEN
        selectionSort(ARRAY_TO_SORT);

        assertArrayEquals(EXPECTED_SORTED_ARRAY, ARRAY_TO_SORT);
    }
}
