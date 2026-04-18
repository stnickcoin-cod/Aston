package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticCalculatorTests {

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "-1, 1, 0",
            "0, 0, 0",
            "100, -50, 50"
    })
    @DisplayName("Тестирование сложения")
    void testAddition(int a, int b, int expected) {
        int result = ArithmeticCalculator.add(a, b);
        assertEquals(expected, result,
                "Сложение " + a + " и " + b + " должно дать " + expected);
    }

    @ParameterizedTest
    @MethodSource("provideMultiplicationCases")
    @DisplayName("Тестирование умножения")
    void testMultiplication(int a, int b, int expected) {
        int result = ArithmeticCalculator.multiply(a, b);
        assertEquals(expected, result,
                "Умножение " + a + " на " + b + " должно дать " + expected);
    }

    @ParameterizedTest
    @MethodSource("provideSubtractionCases")
    @DisplayName("Тестирование вычитания")
    void testSubtraction(int a, int b, int expected) {
        int result = ArithmeticCalculator.subtract(a, b);
        assertEquals(expected, result,
                "Вычитание " + a + " минус " + b + " должно дать " + expected);
    }

    @ParameterizedTest
    @CsvSource({
            "6, 3, 2.0",
            "10, 2, 5.0",
            "-8, 4, -2.0",
            "7, 2, 3.5"
    })
    @DisplayName("Тестирование деления")
    void testDivision(int a, int b, double expected) {
        double result = ArithmeticCalculator.divide(a, b);
        assertEquals(expected, result, 0.001,
                "Деление " + a + " на " + b + " должно дать " + expected);
    }

    @ParameterizedTest
    @CsvSource({"5, 0", "10, 0", "-3, 0"})
    @DisplayName("Деление на ноль должно вызывать исключение")
    void testDivisionByZero(int a, int b) {
        assertThrows(IllegalArgumentException.class,
                () -> ArithmeticCalculator.divide(a, b),
                "Деление на ноль должно выбрасывать IllegalArgumentException"
        );
    }

    private static Stream<Arguments> provideMultiplicationCases() {
        return Stream.of(
                Arguments.of(2, 3, 6),
                Arguments.of(-2, 4, -8),
                Arguments.of(0, 100, 0),
                Arguments.of(-3, -4, 12),
                Arguments.of(1, 1000, 1000)
        );
    }

    private static Stream<Arguments> provideSubtractionCases() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(3, 5, -2),
                Arguments.of(0, 0, 0),
                Arguments.of(-5, -3, -2),
                Arguments.of(10, -5, 15)
        );
    }
}