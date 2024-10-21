package com.example.lab2codes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211962_12_Test {
    @Test
    public void testMultiply_ValidInputs() {
        Solution solution = new Solution();
        assertEquals("6", solution.multiply("2", "3"));
        assertEquals("56088", solution.multiply("123", "456"));
    }

    @Test
    public void testMultiply_ZeroInput() {
        Solution solution = new Solution();
        assertEquals("0", solution.multiply("0", "5"));
        assertEquals("0", solution.multiply("5", "0"));
        assertEquals("0", solution.multiply("0", "0"));
    }

    @Test
    public void testMultiply_LargeNumbers() {
        Solution solution = new Solution();
        assertEquals("1000000", solution.multiply("1000", "1000"));
    }
}
