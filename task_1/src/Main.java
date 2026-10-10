import java.util.Scanner;
/**
 * Задание: Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 * Площадь вычисляется по формуле: S = (L * L) / (4 * π), где L — длина окружности.
 * @author Григорий Матыскин
 */
public class Main {
    /**
     * Главный класс программы. Считывает диаметр круга и вовзращает его площадь
     */
    public static void main(String[] args) {
        System.out.println("Введите длину");
        Scanner scanner = new Scanner(System.in);
        // Считываем длину (целое число)
        double length = scanner.nextDouble();
        System.out.println(calculation.result(length));
    }
}