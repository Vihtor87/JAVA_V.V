/*
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент 
 * уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        int[] array = getRandomArray(1000, 24);
        Set<Integer> set = getSet(array);
        System.out.println(calculate(array, set));
    }

    public static int[] getRandomArray(int len, int max) {
        int[] arr = new int[len];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(max + 1);
        }
        return arr;
    }

    public static Set<Integer> getSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }

    public static double calculate(int[] arr, Set<Integer> set) {
        int count = arr.length;
        int uniqCount = set.size();
        return (double) uniqCount * 100 / count;
    }
}
