package com.tutorial.clean.code.chapter02.c02;

public class YanlışTelkin {

    String accountName = "";

    static int O;
    static int l;

    public static void main(String[] args) {
        {
            int a = l;
            if ( O == l )
                a = 1;
            else
                l = 01;
        }

        System.out.println(l);
    }


}
