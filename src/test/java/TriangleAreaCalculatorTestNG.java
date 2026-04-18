
package org.example;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.Assert;

public class TriangleAreaCalculatorTestNG {

    @Test(dataProvider = "validTriangles")
    public void testValidTriangles(double a, double b, double c, double expected) {
        double result = TriangleAreaCalculator.calculateArea(a, b, c);
        Assert.assertEquals(result, expected, 0.001,
                "Площадь треугольника со сторонами " + a + ", " + b + ", " + c +
                        " должна быть равна " + expected);
    }

    @Test(dataProvider = "invalidSides")
    public void testInvalidSides(double a, double b, double c) {
        Assert.expectThrows(
                "Все стороны должны быть положительными",
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(a, b, c)
        );
    }

    @Test(dataProvider = "nonTriangles")
    public void testNonTriangles(double a, double b, double c) {
        Assert.expectThrows(
                "Стороны не образуют треугольник",
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(a, b, c)
        );
    }

    @DataProvider(name = "validTriangles")
    public Object[][] provideValidTriangles() {
        return new Object[][] {
                {3, 4, 5, 6.0},           // прямоугольный треугольник
                {5, 12, 13, 30.0},       // прямоугольный треугольник
                {7, 24, 25, 84.0},      // прямоугольный треугольник
                {6, 8, 10, 24.0},       // прямоугольный треугольник (удвоенный 3-4-5)
                {4, 4, 4 * Math.sqrt(3), 4 * 4 * Math.sqrt(3) / 4} // равносторонний
        };
    }

    @DataProvider(name = "invalidSides")
    public Object[][] provideInvalidSides() {
        return new Object[][] {
                {-1, 2, 3},      // отрицательная сторона
                {0, 4, 5},       // нулевая сторона
                {1, -2, 3},      // отрицательная сторона
                {2, 3, 0},      // нулевая сторона
                {-1, -2, -3}     // все отрицательные
        };
    }

    @DataProvider(name = "nonTriangles")
    public Object[][] provideNonTriangles() {
        return new Object[][] {
                {1, 1, 3},     // 1 + 1 < 3
                {2, 2, 5},     // 2 + 2 < 5
                {10, 1, 1},    // 1 + 1 < 10
                {5, 3, 9},     // 5 + 3 < 9
                {7, 2, 10}     // 7 + 2 < 10
        };
    }
}
