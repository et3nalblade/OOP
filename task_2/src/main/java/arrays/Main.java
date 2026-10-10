package ru.zabgu.arrays;

import java.util.Scanner;

/**
 * Главный класс программы.
 *
 * @author ТВОЁ_ИМЯ
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new ArrayException(
                        "Размер массива должен быть положительным");
            }

            double[] array = new double[n];

            System.out.println(
                    "Введите " + n + " действительных чисел:");

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextDouble();
            }

            System.out.println("Массив:");
            ArrayUtils.printArray(array);

            double product =
                    ProductCalculator.calculateProduct(array);

            System.out.println(
                    "Произведение = " + product);

            ArrayFileUtils.writeToFile(
                    array, "array.txt");

            System.out.println(
                    "Массив записан в array.txt");

        } catch (ArrayException e) {

            System.out.println(
                    "Ошибка: " + e.getMessage());

        } catch (Exception e) {

            System.out.println(
                    "Ошибка ввода: " + e.getMessage());
        }
    }
}