import org.example.ArithmeticCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticCalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, ArithmeticCalculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, ArithmeticCalculator.subtract(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, ArithmeticCalculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, ArithmeticCalculator.divide(6, 3), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> ArithmeticCalculator.divide(5, 0));
    }
}
