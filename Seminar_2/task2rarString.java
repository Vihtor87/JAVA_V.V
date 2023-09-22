/*
 *  Напишите метод, который сжимает строку.
 * Пример:
 * вход: aaaabbbcdd
 * результат: a4b3c1d2
 */

public class task2rarString {
    public static void main(String[] args) {
        String result = rarSrting("aaaabbbcdd");
        System.out.println(result);
    }

    public static String rarSrting(String str) {
        char currentChar = str.charAt(0);
        String res = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                res += currentChar + Integer.toString(count);
                count = 1;
                currentChar = str.charAt(i);
            }
        }
        return res += currentChar + Integer.toString(count);
    }

}
