package com.example;

public class TypeAlgorithm {

    public int[] executeAlgorithm(int algorithmId, int loopType, int number) {
        switch (algorithmId) {
            case 1:
                return new Fibonachi().selectLoop(loopType, number);
            case 2:
                return new Factorial().selectLoop(loopType, number);
            default:
                return new int[0];
        }
    }
}
