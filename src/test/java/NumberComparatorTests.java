package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberComparatorTests {

    @ParameterizedTest
    @CsvSource({
            "5, 5, 0",
            "10, 10, 0",
            "-3, -3, 0",
            "0, 0, 0"
    })
    @DisplayName("Тестирование равных чисел")
    void testEqualNumbers(int a, int b, int expected) {
        int result = NumberComparator.compare(a, b);
        assertEquals(expected, result,
                "Сравнение равных чисел: " + a + " и " + b + " должно дать " + expected);
    }

    @ParameterizedTest
    @MethodSource("provideFirstGreaterCases")
    @DisplayName("Первое число больше")
    void testFirstGreater(int a, int b, int expected) {
        int result = NumberComparator.compare(a, b);
        assertEquals(expected, result,
                "Сравнение: " + a + " > " + b + " должно дать " + expected);
    }

    @ParameterizedTest
    @MethodSource("provideSecondGreaterCases")
    @DisplayName("Второе число больше")
    void testSecondGreater(int a, int b, int expected) {
        int result = NumberComparator.compare(a, b);
        assertEquals(expected, result,
                "Сравнение: " + a + " < " + b + " должно дать " + expected);
    }

    private static Stream<Arguments> provideFirstGreaterCases() {
        return Stream.of(
                Arguments.of(7, 3, 1),
                Arguments.of(100, 50, 1),
                Arguments.of(-1, -5, 1),
                Arguments.of(0, -10, 1),
                Arguments.of(15, 8, 1)
        );
    }

    private static Stream<Arguments> provideSecondGreaterCases() {
        return Stream.of(
                Arguments.of(3, 7, -1),
                Arguments.of(50, 100, -1),
                Arguments.of(-5, -1, -1),
                Arguments.of(-10, 0, -1),
                Arguments.of(8, 15, -1)
        );
    }
}