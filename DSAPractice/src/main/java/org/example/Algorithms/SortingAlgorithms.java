package org.example.Algorithms;

public class SortingAlgorithms {

    /**
     * Bubble Sort:
     *
     * Big O: O(N^2)
     *
     * @param numbers array of integers
     */
    public static void bubbleSort(int[] numbers) {
        int unsortedUntilIndex = numbers.length - 1; // Tracks the length of the array to continue to sort (in ascending order)
        boolean sorted = false;

        // Continually loops until the array is sorted in ascending order
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < unsortedUntilIndex; i++) {
                // Shifts the element to the right so the array is in ascending order
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;

                    sorted = false;
                }
            }
            unsortedUntilIndex--; // DDecreases the size of the array because the elements are sorted in the correct position
        }

    }
}
