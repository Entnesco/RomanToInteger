package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testIII() {
        var solution = new Solution();
        assertEquals(3,solution.romanToInt("III"));
    }

    @Test
    void testII() {
        var solution = new Solution();
        assertEquals(2,solution.romanToInt("II"));
    }

    @Test
    void testIV() {
        var solution = new Solution();
        assertEquals(4,solution.romanToInt("IV"));
    }

    @Test
    void testVIII() {
        var solution = new Solution();
        assertEquals(8,solution.romanToInt("VIII"));
    }

    @Test
    void testLVIII() {
        var solution = new Solution();
        assertEquals(58,solution.romanToInt("LVIII"));
    }

    @Test
    void testLMCMXCIV() {
        var solution = new Solution();
        assertEquals(1994,solution.romanToInt("MCMXCIV"));
    }



}