package arrays;

import java.util.Scanner;

// Главный класс программы, с которого начинается выполнение
public class Main {

    // Точка входа в программу
    // String[] args — аргументы командной строки
    public static void main(String[] args) {

        // Создаём объект для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Выполняем основные действия и обрабатываем возможные ошибки
        try {

            // Считываем массив чисел, введённых пользователем
            // scanner — объект для чтения данных
            double[] array = ArrayUtils.readArray(scanner);

            // Выводим заголовок и элементы массива
            System.out.println("Массив:");
            ArrayUtils.printArray(array);

            // Вычисляем произведение всех элементов массива
            double product = ProductCalculator.calculateProduct(array);

            // Выводим результат вычисления
            System.out.println("Произведение = " + product);

            // Записываем массив в файл array.txt
            // array — массив для записи
            // "array.txt" — имя файла
            ArrayFileUtils.writeToFile(array, "array.txt");

            // Сообщаем об успешном выполнении записи
            System.out.println("Массив записан в array.txt");

            // Обрабатываем ошибки, связанные с работой программы и массивами
        } catch (ArrayException e) {
            System.out.println("Ошибка: " + e.getMessage());

            // Обрабатываем другие ошибки, например некорректный ввод
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }

        // Генерируем случайный массив из 5 чисел в диапазоне от 0 до 10
        // и выводим его на экран
        ArrayUtils.printArray(ArrayUtils.generateRandomArray(5, 0, 10));

        // Закрываем Scanner после завершения ввода
        scanner.close();
    }
}
