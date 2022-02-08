package com.tutorial.clean.code.chapter10.c03;

import com.tutorial.clean.code.chapter10.c03.helper.SomeObject;

public class LowCohesion {
    SomeObject someObject = new SomeObject();
    SomeObject someOtherObject = new SomeObject();
    SomeObject someOtherOtherObject = new SomeObject();

    public void method1(){
        someObject.helloItsMe();;
    }

    public void method2(){
        someOtherObject.helloItsMe();;
    }

    public void method3(){
        someOtherOtherObject.helloItsMe();;
    }
}
