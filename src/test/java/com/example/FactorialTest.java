package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial factorial;

    private static final int ONE = 1;
    private static final int SIX = 6;
    private static final int FIVE = 5;


    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial = null;
    }

    @Test
    public void testValuesFromRange() {
        int[] actual = factorial.selectLoop(ONE, SIX);
        int[] expected = {720};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testOutOfRangeValues() {
        int[] actual = factorial.selectLoop(FIVE, SIX);
        int[] expected = new int[0];
        assertArrayEquals(actual, expected);
    }
}