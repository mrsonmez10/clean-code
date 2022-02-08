package com.tutorial.clean.code.chapter03.c06;

public class TestDrive {

    public static void main(String[] args) {


        // booelan fileExists("myFile")
        // InputStream fileOpen(“MyFile”)


        String file = "file";
        FlagMethod.save(file, true);


        FlagMethod.isVersionIncrement(file);
        FlagMethod.saveNew(file);



    }

}
