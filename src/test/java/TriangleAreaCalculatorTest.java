import org.example.TriangleAreaCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaCalculatorTest {
    @DisplayName("площадь корректного треугольника")
    @Test
     void testTriangleArea() {
        assertEquals(6.0, TriangleAreaCalculator.calculateArea(3, 4, 5), 0.001);
    }
    @DisplayName("площадь с отрицательной стороной")
    @Test
     void testNegativeSides() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(-1, 2, 3));
    }
    @DisplayName("сумма двух сторон меньше третьей")
    @Test
     void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(1, 1, 3));
    }
}

