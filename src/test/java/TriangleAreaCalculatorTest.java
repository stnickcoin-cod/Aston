import org.example.TriangleAreaCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleAreaCalculatorTest {
    @Test
     void testTriangleArea() {
        assertEquals(6.0, TriangleAreaCalculator.calculateArea(3, 4, 5), 0.001);
    }

    @Test
     void testNegativeSides() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(-1, 2, 3));
    }

    @Test
     void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(1, 1, 3));
    }
}

