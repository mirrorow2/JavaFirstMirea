package com.company.Mironova;
import java.util.Arrays;
import java.util.Random;

public class Num6 {
    public static void main(String[] args) {
        int size = 10;
        int min = 1;
        int max = 100;
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
