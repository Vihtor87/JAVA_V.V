/*
 * Написать метод, который переведет число из римского формата записи в арабский.
 * Например, MMXXII = 2022
 */

import java.util.HashMap;
import java.util.Map;

public class task3Numbers {
    public static void main(String[] args) {
        String st = "MMXIX";
        System.out.println(convertRomanToArabik(st));
    }

    public static Map<Character, Integer> numbersRoman() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int convertRomanToArabik(String str) {
        Map<Character, Integer> map = numbersRoman(); // MMXIX = 2019
        int res = 0;
        int valuePrev = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentSimbol = str.charAt(i);
            int curentValue = map.get(currentSimbol);
            if (curentValue >= valuePrev) {
                res += curentValue;
            } else {
                res -= curentValue;
            }
            valuePrev = curentValue;
        }
        return res;
    }
}
