package com.tutorial.clean.code.chapter09.c01;

public class CreditCalculation {

	private static final int RATE = 12;

	public double creditCalculator(double amount, int months) {
		if (!isAmountValid(amount)) {
			throw new IllegalArgumentException("Amount is not valid!");
		}
		double interest = (amount * (RATE * 0.01)) / months;
		return ((amount / months) + interest);
	}

	private boolean isAmountValid(double amount) {
		boolean flag = true;
		if (amount == 0) {
			flag = false;
		} else if (amount > 1000000) {
			flag = false;
		}
		return flag;
	}
}
