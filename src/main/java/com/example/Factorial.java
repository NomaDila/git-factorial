package com.example;

public class Factorial {

    public int[] selectLoop(int loopType, int number) {
        switch (loopType) {
            case 1:
                return loopWhile(number);
            case 2:
                return loopDoWhile(number);
            case 3:
                return loopFor(number);
            default:
                return new int[0];
        }
    }

    public int[] loopWhile(int number) {
        int[] array = new int[1];
        array[0] = 1;
        int count = 1;

        while (count <= number) {
            array[0] *= count;
            count++;
        }

        return array;
    }

    public int[] loopDoWhile(int number) {
        int[] array = new int[1];
        array[0] = 1;
        int count = 1;

        do {
            array[0] *= count;
            count++;
        } while (count <= number);

        return array;
    }

    public int[] loopFor(int number) {
        int[] array = new int[1];
        array[0] = 1;

        for (int i = 1; i <= number; i++) {
            array[0] *= i;
        }

        return array;
    }
}
