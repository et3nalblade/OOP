import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {

    @Test
    void testPositiveLength() {
        assertEquals(Math.PI, calculation.result(2 * Math.PI), 1e-9);
    }

    @Test
    void testZeroDiameter() {
        assertEquals(0.0, calculation.result(0.0), 1e-9);
    }

    @Test
    void testNegativeLength() {
        assertEquals(-1.0, calculation.result(-5.0));
    }
    @Test
    void testLargeLength() {
        assertEquals(100.0 * 100.0 / (4 * Math.PI),
                calculation.result(100.0), 1e-6);
    }
}
