package com.tutorial.clean.code.chapter12.c01;

public final class AccountUtil {

    private AccountUtil () {

    }

    public static double finalizeAmount(double input) {
        return input = Math.round(input * 100.0) / 100.0;
    }
}
