package com.tutorial.clean.code.chapter09.c01;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CreditCalculationTest {

	CreditCalculation creditCalculation = new CreditCalculation();

	@Test
	void should_work_when_inputs_are_greater_than_zero() {
		assertTrue(creditCalculation.creditCalculator(10000, 3) > 0);
	}

	@Test
	void should_throw_illegal_argument_exception_when_amount_zero() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			double result = creditCalculation.creditCalculator(0, 3);
		});
	}

	@Test
	void should_throw_illegal_argument_exception_when_amount_greater_than_upperLimit() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			double result = creditCalculation.creditCalculator(1000001, 3);
		});
	}

	@Test
	void should_throw_illegal_argument_exception_when_amount_less_than_zero() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			double result = creditCalculation.creditCalculator(-1000, 3);
		});
	}
}
