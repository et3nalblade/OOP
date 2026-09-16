import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {

    @Test
    void testPositiveDiameter() {
        double result = calculation.result(2.0);
        assertEquals(Math.PI, result, 1e-9);
    }

    @Test
    void testZeroDiameter() {
        assertEquals(0.0, calculation.result(0.0), 1e-9);
    }

    @Test
    void testNegativeDiameter() {
        assertEquals(-1.0, calculation.result(-5.0));
    }

    @Test
    void testLargeDiameter() {
        double d = 100.0;
        double expected = Math.PI * d * d / 4.0;
        assertEquals(expected, calculation.result(d), 1e-6);
    }
}
