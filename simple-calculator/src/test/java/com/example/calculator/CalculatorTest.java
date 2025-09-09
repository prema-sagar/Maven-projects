package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    private static final double DELTA = 0.001;

    @Test
    public void testAdd() {
        assertEquals(4.0, calculator.add(2, 2), DELTA);
        assertEquals(0.0, calculator.add(2, -2), DELTA);
        assertEquals(-4.0, calculator.add(-2, -2), DELTA);
    }

    @Test
    public void testSubtract() {
        assertEquals(0.0, calculator.subtract(2, 2), DELTA);
        assertEquals(4.0, calculator.subtract(2, -2), DELTA);
        assertEquals(-4.0, calculator.subtract(-2, 2), DELTA);
    }

    @Test
    public void testMultiply() {
        assertEquals(4.0, calculator.multiply(2, 2), DELTA);
        assertEquals(-4.0, calculator.multiply(2, -2), DELTA);
        assertEquals(4.0, calculator.multiply(-2, -2), DELTA);
    }

    @Test
    public void testDivide() {
        assertEquals(1.0, calculator.divide(2, 2), DELTA);
        assertEquals(-1.0, calculator.divide(2, -2), DELTA);
        assertEquals(1.0, calculator.divide(-2, -2), DELTA);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
    }
}
