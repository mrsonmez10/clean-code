package com.tutorial.clean.code.chapter12.c01;

public class XAccountCalculation {

    private final int rate;

    public XAccountCalculation(int rate) {
        this.rate = rate;
    }

    public double calculate(int rate, int userInput) {

        int result = 0;
        result = rate*userInput;

        return AccountUtil.finalizeAmount(result);
    }
}
