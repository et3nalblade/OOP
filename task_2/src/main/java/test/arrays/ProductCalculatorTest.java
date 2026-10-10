package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductCalculatorTest {

    // Проверка правильности вычисления произведения положительных чисел
    @Test
    void testCalculateProduct() {
        double[] array = {2, 3, 4};

        assertEquals(24.0, ProductCalculator.calculateProduct(array));
    }

    // Проверка вычисления произведения отрицательных и положительных чисел
    @Test
    void testNegativeNumbers() {
        double[] array = {-2, 3};

        assertEquals(-6.0, ProductCalculator.calculateProduct(array));
    }

    // Проверка, что при наличии нуля произведение равно нулю
    @Test
    void testArrayWithZero() {
        double[] array = {5, 0, 3};

        assertEquals(0.0, ProductCalculator.calculateProduct(array));
    }

    // Проверка обработки пустого массива
    @Test
    void testEmptyArray() {
        assertThrows(
                ArrayException.class,
                () -> ProductCalculator.calculateProduct(new double[0])
        );
    }

    // Проверка обработки null вместо массива
    @Test
    void testNullArray() {
        assertThrows(
                ArrayException.class,
                () -> ProductCalculator.calculateProduct(null)
        );
    }

    // Проверка генерации массива заданного размера и диапазона значений
    @Test
    void testGenerateRandomArray() {
        double[] array = ArrayUtils.generateRandomArray(5, 1, 10);

        assertEquals(5, array.length);

        for (double value : array) {
            assertTrue(value >= 1 && value <= 10);
        }
    }

    // Проверка обработки недопустимого размера массива
    @Test
    void testInvalidArraySize() {
        assertThrows(
                ArrayException.class,
                () -> ArrayUtils.generateRandomArray(0, 1, 10)
        );
    }

    // Проверка обработки некорректного диапазона генерации
    @Test
    void testInvalidRange() {
        assertThrows(
                ArrayException.class,
                () -> ArrayUtils.generateRandomArray(5, 10, 1)
        );
    }
}
