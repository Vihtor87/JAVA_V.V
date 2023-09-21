/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1
 */
public class task2 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1, 0, 1, 1, 1 };
        System.out.println(getCountValue(arr));
    }

    private static int getCountValue(int[] val) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            if (val[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return count > maxCount ? count : maxCount;
    }
}
