package com.tutorial.clean.code.chapter4.c05;

import java.util.regex.Pattern;

public class TestDrive{

    // format matched kk:mm:ss EEE, MMM dd, yyyy
    Pattern timeMatcher = Pattern.compile("\\d*:\\d*:\\d* \\w*, \\w* \\d*, \\d*");

}
