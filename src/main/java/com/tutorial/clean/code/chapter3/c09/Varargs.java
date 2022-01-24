package com.tutorial.clean.code.chapter3.c09;

public class Varargs {

    public static int sum(int a, int... args) {
        int sum = 0;
        for (int i : args)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        sum(1);


    }

}
