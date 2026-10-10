package arrays;

public class ProductCalculatorTest {
    public static double calculateProduct(double[] array) {
        if (array == null || array.length == 0) {
            throw new ArrayException("Массив пустой");
        }
        double product = 1.0;
        for (double value : array) {
            product *= value;
        }
        return product;
    }
}
