package org.example.Algorithms;

public class SearchingAlgorithms {


    /**
     * Linear Search:
     * Big O: O(N)
     *
     * @param numbers array of integers
     * @param searchValue element to search for
     * @return the index of the element if it exists, otherwise -1
     */
    public static int linearSearch(int[] numbers, int searchValue) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                return i;
            }
        }
        return -1; // -1 is returned if the search value doesn't exist in the array
    }

    /**
     * Binary Search:
     * Note: Requires a sorted array in ascending order
     *
     * Big O: O(log N)
     *
     * @param numbers array of integers
     * @param searchValue element to search for
     * @return the index of the element if it exists, otherwise -1
     */
    public static int binarySearch(int[] numbers, int searchValue) {
        int lowerBound = 0;
        int upperBound = numbers.length - 1;

        while (lowerBound <= upperBound) {
            // Keeps dividing the array in half with each search
            int middle = (upperBound + lowerBound) / 2;
            int middleValue = numbers[middle];

            if (middleValue == searchValue) {
                return middle;
            }
            // Removes the right false (upper half) of the array since the search value is lower and has to be on the left half
            else if (middleValue > searchValue) {
                upperBound = middle - 1;
            }
            // Removes the left half (lower half) of the array since the search value is higher and has to be on the right half
            else {
                lowerBound = middle + 1;
            }
        }
        return -1; // -1 is returned if the search value doesn't exist in the array
    }

}

