package arrays;

import java.util.Random;
import java.util.Scanner;

// Класс для ввода, генерации и вывода массивов
public class ArrayUtils {

    // Считывает массив чисел с клавиатуры
    // scanner — объект для чтения пользовательского ввода
    // return — массив введённых чисел
    public static double[] readArray(Scanner scanner) {

        // Просим пользователя ввести размер массива
        System.out.print("Введите размер массива: ");

        // Считываем размер массива
        int n = scanner.nextInt();

        // Проверяем, что размер массива положительный
        if (n <= 0) {
            throw new ArrayException(
                    "Размер массива должен быть положительным");
        }

        // Создаём массив из n элементов типа double
        double[] array = new double[n];

        // Просим пользователя ввести числа
        System.out.println("Введите " + n + " действительных чисел:");

        // Считываем числа и записываем их в массив
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        // Возвращаем заполненный массив
        return array;
    }

    // Генерирует массив случайных чисел
    // size — количество элементов массива
    // min — минимальное значение диапазона
    // max — максимальное значение диапазона
    // return — массив случайных чисел
    public static double[] generateRandomArray(
            int size, double min, double max) {

        // Проверяем, что размер массива положительный
        if (size <= 0) {
            throw new ArrayException(
                    "Размер массива должен быть положительным");
        }

        // Проверяем правильность границ диапазона
        if (min > max) {
            throw new ArrayException(
                    "Минимум не должен быть больше максимума");
        }

        // Создаём объект для генерации случайных чисел
        Random random = new Random();

        // Создаём массив заданного размера
        double[] array = new double[size];

        // Заполняем массив случайными числами
        for (int i = 0; i < size; i++) {

            // Генерируем число в диапазоне от min до max
            array[i] = min + random.nextDouble() * (max - min);
        }

        // Возвращаем заполненный массив
        return array;
    }

    // Выводит элементы массива, по 10 элементов в строке
    // array — массив, элементы которого нужно вывести
    public static void printArray(double[] array) {

        // Проверяем, что массив не равен null
        if (array == null) {
            throw new ArrayException("Массив равен null");
        }

        // Перебираем элементы массива по индексам
        for (int i = 0; i < array.length; i++) {

            // Выводим число с двумя знаками после запятой
            System.out.printf("%.2f ", array[i]);

            // После каждых 10 элементов переходим на новую строку
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        // Переносим строку, если последний ряд содержит меньше 10 элементов
        if (array.length % 10 != 0) {
            System.out.println();
        }
    }
}
