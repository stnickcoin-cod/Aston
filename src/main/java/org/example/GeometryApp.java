package org.example;


import java.awt.Color;

interface Shape {
    Color getFillColor();
    Color getBorderColor();
    double getPerimeter();
    double getArea();

    default void printInfo() {
        System.out.printf("Периметр: %.2f, Площадь: %.2f, Цвет фона: %s, Цвет границ: %s%n",
                getPerimeter(), getArea(), getFillColor(), getBorderColor());
    }
}
class Circle implements Shape {
    private final double radius;
    private final Color fillColor;
    private final Color borderColor;

    public Circle(double radius, Color fillColor, Color borderColor) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public Color getFillColor() { return fillColor; }

    @Override
    public Color getBorderColor() { return borderColor; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public double getArea() { return Math.PI * radius * radius; }
}
class Rectangle implements Shape {
    private final double width, height;
    private final Color fillColor;
    private final Color borderColor;

    public Rectangle(double width, double height, Color fillColor, Color borderColor) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Размеры должны быть положительными");
        }
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    @Override
    public Color getFillColor() { return fillColor; }

    @Override
    public Color getBorderColor() { return borderColor; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }

    @Override
    public double getArea() { return width * height; }
}
class Triangle implements Shape {
    private final double side;
    private final Color fillColor;
    private final Color borderColor;

    public Triangle(double side, Color fillColor, Color borderColor) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной");
        }
        this.side = side;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public Color getFillColor() { return fillColor; }

    @Override
    public Color getBorderColor() { return borderColor; }

    @Override
    public double getPerimeter() { return 3 * side; }

    @Override
    public double getArea() { return (Math.sqrt(3) / 4) * side * side; }
}
public class GeometryApp {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, Color.RED, Color.BLACK);
        Shape rectangle = new Rectangle(4.0, 6.0, Color.GREEN, Color.BLUE);
        Shape triangle = new Triangle(5.0, Color.YELLOW, Color.ORANGE);

        System.out.println("=== РАСЧЁТ ХАРАКТЕРИСТИК ГЕОМЕТРИЧЕСКИХ ФИГУР ===");
        System.out.println();

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}

