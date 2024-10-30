package com.tutorial.clean.code.chapter07.c02;

import java.io.IOException;

public class TestDrive {


    /*
        Checked exception atan bir yapıyı lambdalar ile kullanamayız.
        // IO Exception
     */


    static void stringConverter() throws RuntimeException {
        String test = null;
        test.toString();
    }


    public static void main(String[] args) {


        stringConverter();
        System.out.println("Hello");

    }

}
