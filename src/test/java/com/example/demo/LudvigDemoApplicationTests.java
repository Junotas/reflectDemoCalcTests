package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class LudvigDemoApplicationTests {

    @Test
    void testAddition() {
        double result = LudvigDemoApplication.Calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testAdditionMultiplicationCrossOver() {
        double result = LudvigDemoApplication.Calculator.add(2, 2);
        assertEquals(4, result);
    }

    @Test
    void testSubtraction() {
        double result = LudvigDemoApplication.Calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testDivision() {
        double result = LudvigDemoApplication.Calculator.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            LudvigDemoApplication.Calculator.divide(6, 0);
        });
    }

    @Test
    void testMultiplication() {
        double result = LudvigDemoApplication.Calculator.multiply(5, 3);
        assertEquals(15, result);
    }
}
