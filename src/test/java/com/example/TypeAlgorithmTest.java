package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeAlgorithmTest {

    private TypeAlgorithm typeAlgorithm;

    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int SIX = 6;
    private static final int FIVE = 5;

    @Before
    public void setUp() throws Exception {
        typeAlgorithm = new TypeAlgorithm();
    }

    @After
    public void tearDown() throws Exception {
        typeAlgorithm = null;
    }

    @Test
    public void testValuesFromRange() {
        int[] actual = typeAlgorithm.executeAlgorithm(ONE, TWO, SIX);
        int[] expected = {0, 1, 1, 2, 3, 5};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testOutOfRangeValues() {
        int[] actual = typeAlgorithm.executeAlgorithm(FIVE, TWO, SIX);
        int[] expected = new int[0];
        assertArrayEquals(actual, expected);
    }
}