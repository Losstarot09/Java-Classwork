package abstractionExamples;

public class Circle implements IShape{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public double perimeter() {
        return this.radius * Math.PI * 2;
    }
}
