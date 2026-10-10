package arrays;

import java.util.Random;

public class ArrayUtils {
    public static double[] GenerateRandomArrays(int size, double min, double max){
        if (size<=0){
            throw new ArrayException("размер массива должен быть положительным");
        }
        if (min>max){
            throw new ArrayException("Максимум не должен быть меньше минимума");
        }
        Random random = new Random();
        double[] array =new double[size];
        for (int i=0;i<size;i++){
            array[i]=min + random.nextDouble() *(max-min);
        }
        return array;
    }
    public static void printArray(double[] array){
        if (array == null){
            throw new ArrayException("Массив не должен быть пустым");
        }
        for (int i=0;i<array.length<i++){
            System.out.println("%.2f", array[i]);

        }
    }
}
