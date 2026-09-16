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
        Scanner scanner = new Scanner(System.in);
        // Считываем длину (целое число)
        int length = scanner.nextInt();
        System.out.println(calculation.result(length));
    }
}