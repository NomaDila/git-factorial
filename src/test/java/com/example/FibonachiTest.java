package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonachiTest {

    private Fibonachi fibonachi;

    private static final int ONE = 1;
    private static final int NINE = 9;
    private static final int TEN = 10;

    @Before
    public void setUp() throws Exception {
        fibonachi = new Fibonachi();
    }

    @After
    public void tearDown() throws Exception {
        fibonachi = null;
    }

    @Test
    public void testValuesFromRange() {
        int[] actual = fibonachi.selectLoop(ONE, NINE);
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testOutOfRangeValues() {
        int[] actual = fibonachi.selectLoop(TEN, NINE);
        int[] expected = new int[0];
        assertArrayEquals(actual, expected);
    }
}