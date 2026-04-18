package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleAreaCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, 6.0",
            "5, 12, 13, 30.0",
            "7, 24, 25, 84.0",
            "6, 8, 10, 24.0"
    })
    @DisplayName("Тестирование корректных треугольников")
    void testValidTriangles(double a, double b, double c, double expected) {
        double result = TriangleAreaCalculator.calculateArea(a, b, c);
        assertEquals(expected, result, 0.001,
                "Площадь треугольника со сторонами " + a + ", " + b + ", " + c +
                        " должна быть равна " + expected);
    }

    @ParameterizedTest
    @MethodSource("provideInvalidSides")
    @DisplayName("Отрицательные или нулевые стороны должны вызывать исключение")
    void testNegativeOrZeroSides(double a, double b, double c) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(a, b, c)
        );

        assertEquals("Все стороны должны быть положительными", exception.getMessage(),
                "Для некорректных сторон должно выбрасываться сообщение о положительных сторонах");
    }

    @ParameterizedTest
    @MethodSource("provideNonTriangles")
    @DisplayName("Стороны, не образующие треугольник, должны вызывать исключение")
    void testNonTriangleSides(double a, double b, double c) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(a, b, c)
        );

        assertEquals("Стороны не образуют треугольник", exception.getMessage(),
                "Для сторон, не образующих треугольник, должно выбрасываться соответствующее сообщение");
    }

    private static Stream<Arguments> provideInvalidSides() {
        return Stream.of(
                Arguments.of(-1, 2, 3),
                Arguments.of(0, 4, 5),
                Arguments.of(1, -2, 3),
                Arguments.of(2, 3, 0),
                Arguments.of(-1, -2, -3)
        );
    }

    private static Stream<Arguments> provideNonTriangles() {
        return Stream.of(
                Arguments.of(1, 1, 3),
                Arguments.of(2, 2, 5),
                Arguments.of(10, 1, 1),
                Arguments.of(5, 3, 9),
                Arguments.of(7, 2, 10)
        );
    }
}
