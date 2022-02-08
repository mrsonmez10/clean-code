package com.tutorial.clean.code.chapter06.c03.wikipedia;

public class ClassOne {

    private ClassTwo classTwo;



    public void method1() {
        method2();
    }
    public void method2() {

    }






    public void method3(ClassTwo classTwo) {
        classTwo.method4();
    }







    public void method4(){
        ClassTwo classTwo = new ClassTwo();
        classTwo.method4();
    }





    public void method5(){
        classTwo = new ClassTwo();
        classTwo.method4();
    }

}
