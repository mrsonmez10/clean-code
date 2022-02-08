package com.tutorial.clean.code.chapter05.c03;

public class TestDrive{
    int lineCount;
    int totalChars;

    private void measureLine(String line){
        lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
    }

}
