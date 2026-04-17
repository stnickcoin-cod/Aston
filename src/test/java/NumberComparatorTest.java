import org.example.NumberComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparatorTest {
    @Test
    void testEqualNumbers() {
        assertEquals(0, NumberComparator.compare(5, 5));
    }

    @Test
    void testFirstGreater() {
        assertEquals(1, NumberComparator.compare(7, 5));
    }

    @Test
    void testSecondGreater() {
        assertEquals(-1, NumberComparator.compare(3, 8));
    }
}
