package com.tutorial.clean.code.chapter15.c01;

public class FencyCalculator {

    public int fencyMultiply(int a, int b) {
        if(a > b) {
            for(int i = 0; i < 1; i++) {
                a++;
                for(int j = 0; j < 1; j++) {
                    b++;
                }
            }
        }
        return a * b;
    }

//    public static void main(String[] args) {
//        System.out.println(fencyMultiply(4,3)); // 20
//        System.out.println(fencyMultiply(3,4)); // 12
//    }
}
