import org.example.ArithmeticCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticCalculatorTest {
    @DisplayName("сложение")
    @Test
    void testAddition() {
        assertEquals(5, ArithmeticCalculator.add(2, 3));
    }
    @DisplayName("вычетание")
    @Test
    void testSubtraction() {
        assertEquals(-1, ArithmeticCalculator.subtract(2, 3));
    }
    @DisplayName("умножение")
    @Test
    void testMultiplication() {
        assertEquals(6, ArithmeticCalculator.multiply(2, 3));
    }
    @DisplayName("деление")
    @Test
    void testDivision() {
        assertEquals(2.0, ArithmeticCalculator.divide(6, 3), 0.001);
    }
    @DisplayName("деление на 0")
    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> ArithmeticCalculator.divide(5, 0));
    }
}
