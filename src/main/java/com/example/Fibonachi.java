package com.example;

public class Fibonachi {

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
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        int index = 2;

        while (index < number) {
            array[index] = array[index - 1] + array[index - 2];
            index++;
        }

        return array;
    }

    public int[] loopDoWhile(int number) {
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;
        int index = 2;

        do {
            array[index] = array[index - 1] + array[index - 2];
            index++;
        } while (index < number);

        return array;
    }

    public int[] loopFor(int number) {
        int[] array = new int[number];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < number; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }
}
