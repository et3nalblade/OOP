
/**
 * Задание: Известна длина окружности. Найти площадь круга,
 * ограниченного этой окружностью.
 *
 * @author Григорий Матыскин
 */
public class Main {

    /**
     * Главный класс программы. Получает длину окружности через args
     * и выводит площадь круга.
     */
    public static void main(String[] args) {
        double length = Double.parseDouble(args[0]);

        System.out.println(calculation.result(length));
    }
}
