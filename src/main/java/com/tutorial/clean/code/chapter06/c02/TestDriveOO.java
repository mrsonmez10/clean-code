package com.tutorial.clean.code.chapter06.c02;

public class TestDriveOO {

    public class Square implements Shape {
        private Point topLeft;
        private double side;

        public double area() {
            return side*side;
        }
    }

    public class Rectangle implements Shape {
        private Point topLeft;
        private double height;
        private double width;

        public double area() {
            return height * width;
        }
    }

    public class Circle implements Shape {
        private Point center;
        private double radius;
        public final double PI = 3.141592653589793;

        public double area() {
            return PI * radius * radius;
        }
    }

    public class Triangle implements Shape {
        private Point center;
        private double radius;
        public final double PI = 3.141592653589793;

        public double area() {
            return PI * radius * radius;
        }
    }

}
