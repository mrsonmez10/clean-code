package com.tutorial.clean.code.chapter10.c01;

public class EncapTest {

    // Aşağı doğru ve ilişki kuralı

    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        if(newAge<18){
            throw new NullPointerException();
        }
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {
        idNum = newId;
    }
}
