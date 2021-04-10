package abstractionExamples;

public class Rectangle implements IShape{
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}
