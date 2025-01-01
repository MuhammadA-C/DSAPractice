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

}

