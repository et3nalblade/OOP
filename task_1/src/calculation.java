/**
 *  класс для вычисления площади круга по заданному диаметру
 *
 * @author  Григорий Матыскин
 */
public class calculation {

    /**
     * вычисляет площадь круга по его диаметру
     *
     * Формула: S = ((d**2)/4*pi) где d — диаметр круга
     *
     * @param length диаметр круга (неотрицательное число)
     * @return площадь круга, или return -1, если диаметр отрицательный
     */
    public static double result(double length) {
        if (length < 0) {
            System.out.println("Длина не может быть отрицательной");
            return -1;
        }

        double PI = Math.PI;
        return (length * length) / (4 * PI);
    }
}