package com.tutorial.clean.code.chapter12.c01;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDriveTest {

    @Test
    public void toplaTest() {
        TestDrive testDrive = new TestDrive();
        assertEquals(7,  testDrive.topla(3,4));
    }

}
