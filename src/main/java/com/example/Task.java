package com.example;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        TypeAlgorithm algorithm = new TypeAlgorithm();

        System.out.println(Arrays.toString(algorithm.executeAlgorithm(1, 3, 9)));
        System.out.println(Arrays.toString(algorithm.executeAlgorithm(2, 2, 10)));
    }
}
