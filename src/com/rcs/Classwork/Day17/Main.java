package com.rcs.Classwork.Day17;

public class Main {

    public static void main(String[] args) {
        System.out.println("Uzdevums 1");
        Circle redCircle = new Circle(6.4, "Red");
        Circle blueCircle = new Circle(2.0, "Blue");
        Circle blackCircle = new Circle(3.2);

        System.out.printf("Color = %s, Area = %.8f, Circle Length = %.8f\n",redCircle.color, redCircle.getArea(),
                redCircle.getCircleLength());
        System.out.printf("Color = %s, Area = %.8f, Circle Length = %.8f\n",blueCircle.color, blueCircle.getArea(),
                blueCircle.getCircleLength());
        System.out.printf("Color = %s, Area = %.8f, Circle Length = %.8f\n",blackCircle.color, blackCircle.getArea(),
                blackCircle.getCircleLength());
    }
}
