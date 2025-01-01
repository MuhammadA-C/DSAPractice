package org.example;

import org.example.Algorithms.SearchingAlgorithms;
import org.example.Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 5, 1, 14, 12, 60, 80, 100, 30, 45, 50};

        SortingAlgorithms.selectionSort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}