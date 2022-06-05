package com.tutorial.clean.code.chapter15.c01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FencyCalculatorTest {

    FencyCalculator fencyCalculator;

    @BeforeEach
    void setup() {
        fencyCalculator = new FencyCalculator();
    }

    @Test
    @DisplayName("Basic Fency Multiplication -> a>b")
    @Order(1)
    void testFencyMultiplyFirstParameterBiggerThanSecond() {
        assertEquals(20, fencyCalculator.fencyMultiply(4,3),
                "multiplication should work");
    }

    @Test
    @DisplayName("Basic Fency Multiplication -> b>a")
    @Order(2)
    void testFencyMultiplyFirstParameterSmallerThanSecond() {
        assertEquals(12, fencyCalculator.fencyMultiply(3,4),
                "multiplication should work");
    }
}
