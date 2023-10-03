/*
 * Взять набор строк, например: Мороз и солнце день чудесный Еще ты дремлешь друг
 * прелестный Пора красавица проснись.
 * Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
 * одинаковой длиной не должны “потеряться”.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task4Stichi {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Мороз и солнце день чудесный");
        str.add("Мороз и cолнце день чудесnый");
        str.add("Еще ты дремлешь друг прелестный");
        str.add("Пора красавица проснись");

        Map<Integer, List<String>> sortedString = sortSrListtringsByLength(str);

        System.out.println(sortedString);
    }


    public static Map<Integer, List<String>> sortSrListtringsByLength(List<String> str) {
        Map<Integer, List<String>> sortedStrings = new TreeMap<>();
        for (String string : str) {
            int len = string.length();
            List<String> words = sortedStrings.getOrDefault(len, new ArrayList<>());
            words.add(string);
            sortedStrings.put(len, words);
        }
        return sortedStrings;
    }
}