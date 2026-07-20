package Homework9.figura;

public class Circle extends Figura {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
