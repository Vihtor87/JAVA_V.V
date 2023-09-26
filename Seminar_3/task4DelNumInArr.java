/*
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */

import java.util.ArrayList;
import java.util.List;

public class task4DelNumInArr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("789");
        list.add("World");
        list.add("123");
        list.add("Java");
        list.add("456");

        System.out.println(list);
        deleteString(list);
        System.out.println(list);

    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void deleteString(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            if (isInteger(element)) {
                list.remove(i);
            }

        }
    }
}
