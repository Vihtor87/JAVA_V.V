/*Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.*/

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 2, 3, 5, 3, 3 };
        swapVal(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swapVal(int[] array) {
        int num = 3;
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] == num) {
                array[i] = array[j];
                array[j] = num;
                j--;
            } else {
                i++;
            }
        }
    }
}
