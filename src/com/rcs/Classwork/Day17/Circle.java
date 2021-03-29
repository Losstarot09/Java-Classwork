package com.rcs.Classwork.Day17;



public class Circle {
    String color;
    double radius;
    static final double pi = 3.14159265;

    public Circle(double radius) {
        this.color = "Black";
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return pi * this.radius * this.radius;
    }

    public double getCircleLength() {
        return pi * this.radius * 2;
    }
}