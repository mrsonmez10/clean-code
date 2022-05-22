package com.tutorial.clean.code.chapter13.c03;

public class Versus {

    private static void performanceTestStringVsStringbuffereVsStringBuilder() {
        // String vs StringBiffer vs StringBuilder performance Test

        int loop = 100000;
        long start = 0;

        // String
        String str = null;
        start = System.currentTimeMillis();
        for (int i = 1; i <= loop; i++) {
            str += i + "test"; // str cntct
        }
        System.out.println("String - " + (System.currentTimeMillis() - start) + " ms");

        // String buffer
        StringBuffer sbuffer = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 1; i <= loop; i++) {
            sbuffer.append(i).append("test");
        }
        System.out.println("String Buffer - " + (System.currentTimeMillis() - start) + " ms");

        // String builder
        start = System.currentTimeMillis();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 1; i <= loop; i++) {
            sbuffer.append(i).append("test");
        }
        System.out.println("String Builder - " + (System.currentTimeMillis() - start) + " ms");

    }

    public static void main(String[] args) {

        performanceTestStringVsStringbuffereVsStringBuilder();

        // StringBuilder > StringBuffer > StringConc.

    }

}

