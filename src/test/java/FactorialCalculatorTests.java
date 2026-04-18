package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialCalculatorTests {

    @ParameterizedTest
    @MethodSource("provideFactorialCases")
    @DisplayName("Факториал корректных чисел")
    void testFactorialForValidInputs(int n, long expected) {
        long result = FactorialCalculator.calculateFactorial(n);
        assertEquals(expected, result,"Факториал числа " + n + " должен быть равен " + expected);
    }

    @ParameterizedTest
    @MethodSource("provideNegativeNumbers")
    @DisplayName("Факториал отрецательных чисел")
    void testFactorialForNegativeInputs(int n) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> FactorialCalculator.calculateFactorial(n)
        );

        assertEquals("Факториал отрицательного числа не определён", exception.getMessage(),
                "Сообщение об ошибке для отрицательного числа должно быть корректным");
    }

    @ParameterizedTest
    @MethodSource("provideEdgeCases")
    @DisplayName("Граничные случаи")
    void testFactorialEdgeCases(int n, long expected) {
        long result = FactorialCalculator.calculateFactorial(n);
        assertEquals(expected, result,
                "Крайний случай: факториал числа " + n + " должен быть равен " + expected);
    }

    private static Stream<Arguments> provideFactorialCases() {
        return Stream.of(
                Arguments.of(2, 2L),
                Arguments.of(3, 6L),
                Arguments.of(4, 24L),
                Arguments.of(5, 120L),
                Arguments.of(6, 720L)
        );
    }

    private static Stream<Arguments> provideNegativeNumbers() {
        return Stream.of(
                Arguments.of(-1),
                Arguments.of(-5),
                Arguments.of(-10)
        );
    }

    private static Stream<Arguments> provideEdgeCases() {
        return Stream.of(
                Arguments.of(0, 1L),
                Arguments.of(1, 1L)
        );
    }
}
