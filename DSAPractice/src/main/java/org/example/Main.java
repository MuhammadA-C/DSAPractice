package org.example;

import org.example.Algorithms.SearchingAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6, 10, 20, 24, 25, 30, 40, 45, 60};

        System.out.println(SearchingAlgorithms.binarySearch(numbers, 66));
    }
}