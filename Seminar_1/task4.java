/*
 * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
 * Если общего префикса нет, вернуть пустую строку "".
 */
public class task4 {

    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0]; // сохраняем flower
        for (var str : strs)

            while (str.indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }
}