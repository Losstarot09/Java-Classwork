package com.rcs.Classwork.Day17;



public class Circle {
    static final double pi = 3.14159265;
    static final String defaultColor = "Black";
    String color;
    double radius;

    public Circle(double radius) {
        this.color = defaultColor;
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return pi * Math.pow(this.radius, 2);
    }

    public double getCircleLength() {
        return pi * this.radius * 2;
    }
}