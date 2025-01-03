package org.example.Algorithms;

import org.junit.Test;

import static org.example.Algorithms.SearchingAlgorithms.binarySearch;
import static org.example.Algorithms.SearchingAlgorithms.linearSearch;
import static org.junit.Assert.assertEquals;

public class SearchingAlgorithmsTest {
    final int[] NUMBERS_UNSORTED = {10, 21, 40, 30, 50, 60, 80, 100, 4};
    final int[] NUMBERS_SORTED = {2, 4, 6, 8, 10, 15, 20, 24, 30, 35, 40, 50, 100};


    @Test
    public void GIVEN_invalid_search_value_for_linearSearch_THEN_return_negative_one() {
        assertEquals(-1, linearSearch(NUMBERS_UNSORTED, 2));
    }

    @Test
    public void GIVEN_valid_search_value_for_linearSearch_THEN_return_index() {
        assertEquals(2, linearSearch(NUMBERS_UNSORTED, 40));
    }

    @Test
    public void GIVEN_invalid_search_value_for_binarySearch_THEN_return_negative_one() {
        assertEquals(-1, binarySearch(NUMBERS_SORTED, 22));
    }

    @Test
    public void GIVEN_valid_search_value_for_binarySearch_THEN_return_index() {
        assertEquals(8, binarySearch(NUMBERS_SORTED, 30));
    }
}
