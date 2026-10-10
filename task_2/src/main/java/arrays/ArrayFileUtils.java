package arrays;

import java.io.PrintWriter;

// класс для работы с файлами: сохранения массива в файл
public class ArrayFileUtils {

    // сохраняет элементы массива в текстовый файл
    // array — массив чисел, которые нужно сохранить
    // fileName — имя или путь к файлу
    public static void writeToFile(double[] array, String fileName) {

        // проверяем, что массив существует
        if (array == null) {
            throw new ArrayException("Массив равен null");
        }

        // открываем файл для записи; try-with-resources автоматически закрывает файл
        try (PrintWriter writer = new PrintWriter(fileName)) {

            // перебираем все элементы массива
            for (double value : array) {

                // записываем текущее число в файл с переходом на новую строку
                writer.println(value);
            }

            // обрабатываем ошибки, возникшие при записи в файл
        } catch (Exception e) {
            throw new ArrayException("Ошибка сохранения файла");
        }
    }
}
