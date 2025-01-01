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

    /**
     * Selection Sort:
     *
     *
     * Big O: O(N^2)
     * Note: Although Selection Sort and Bubble Sort are both O(N^2) Selection Sort is faster
     *
     * @param numbers array of integers
     */
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int lowestIndexValue = i; // Holds reference to the index for lowest element value

            for (int j = i + 1; j < numbers.length; j++) {
                // Swaps the index if a new lowest element is found
                if (numbers[lowestIndexValue] > numbers[j]) {
                    lowestIndexValue = j;
                }
            }

            // Swaps the position for the lowest index element found and the current loop iteration element
            if (lowestIndexValue != i) {
                int temp = numbers[i];
                numbers[i] = numbers[lowestIndexValue];
                numbers[lowestIndexValue] = temp;
            }
        }
    }
}
