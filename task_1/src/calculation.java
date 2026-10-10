/**
 * Класс для вычисления площади круга по заданному диаметру.
 *
 * @author Григорий Матыскин
 */
public class calculation {
    /**
     * Вычисляет площадь круга по его диаметру.
     *
     * Формула: S = (d * d * PI) / 4, где d — диаметр круга.
     *
     * @param length диаметр круга (неотрицательное число)
     * @return площадь круга
     * @throws IllegalArgumentException если диаметр отрицательный
     */
    public static double result(double length) {
        if (length < 0) {
            throw new IllegalArgumentException(
                    "Диаметр не может быть отрицательным"
            );
        }

        return (length * length * Math.PI) / 4;
    }

    public static void main(String[] args) {
        try {
            // Проверяем, передан ли диаметр через аргументы запуска
            if (args.length == 0) {
                throw new IllegalArgumentException(
                        "Не указан диаметр круга"
                );
            }

            // Преобразуем первый аргумент в число
            double length = Double.parseDouble(args[0]);

            // Вычисляем и выводим площадь круга
            System.out.println("Площадь круга: " + result(length));

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: диаметр должен быть числом");

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
