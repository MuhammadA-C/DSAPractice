package org.example;

import org.example.Algorithms.SearchingAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {21, 10, 3, 6, 8, 40, 1, 12};

        System.out.println(SearchingAlgorithms.linearSearch(numbers, 6));
    }
}