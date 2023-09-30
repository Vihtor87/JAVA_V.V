/*
 * Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * Замерьте время, за которое в LinkedList добавятся 10000 элементов.
 * Сравните с предыдущим
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task0ArrayLinked {

    public static void main(String[] args) {
        int len = 100_000;
        long getTimeAl = getArrayListAddLast(len);
        long getTimeLl = getLinkedListAddLast(len);
        System.out.println(getTimeAl);
        System.out.println(getTimeLl);
        System.out.println();
        long getTimeAl2 = getArrayListAddFirst(len);
        long getTimeLl2 = getLinkedListAddFirst(len);
        System.out.println(getTimeAl2);
        System.out.println(getTimeLl2);
    }

    public static long getArrayListAddLast(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < len; i++) {
            arrayList.add(i);
        }

        long end = System.currentTimeMillis() - start;
        return end;
    }

    public static long getLinkedListAddLast(int len) {
        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < len; i++) {
            linkedList.add(i);
        }

        long end = System.currentTimeMillis() - start;
        return end;
    }

    public static long getArrayListAddFirst(int len) {
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < len; i++) {
            arrayList.add(0, i);
        }

        long end = System.currentTimeMillis() - start;
        return end;
    }

    public static long getLinkedListAddFirst(int len) {
        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < len; i++) {
            linkedList.add(0, i);
        }

        long end = System.currentTimeMillis() - start;
        return end;
    }
}