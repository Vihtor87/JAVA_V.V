/*
 *Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
 * и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
 * некоторую букву во втором слове, при этом
 * 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
 * порядка следования. (Например, add - egg изоморфны)
 * 2. буква может не меняться, а остаться такой же. (Например, note - code)
 * Пример 1:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Пример 2:
 * Input: s = "paper", t = "title"
 * Output: true 
 */

import java.util.HashMap;
import java.util.Map;

public class task1TwoString {

    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "tiule"; 
        System.out.println(isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        if (str1.equals(str2)) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char charStr1 = str1.charAt(i);
            char charStr2 = str2.charAt(i);
            if (map.containsKey(charStr1) && map.get(charStr1) != charStr2) {
                return false;
            } else {
                map.put(charStr1, charStr2);
            }
        }
        return true;
    }
}