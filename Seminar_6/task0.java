/*
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
 * Распечатайте содержимое данного множества.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class task0 {

    public static void main(String[] args) {
        System.out.println(getHashSet());
        System.out.println(getLinkedHashSet());
        System.out.println(getTreeSet());
    }

    public static HashSet<Integer> getHashSet() {
        HashSet<Integer> hSet = new HashSet<>(Arrays.asList(34, 6, 1, 3, -67, 5, 4, 5, 9, -5));
        return hSet;
    }

    public static LinkedHashSet<Integer> getLinkedHashSet() {
        LinkedHashSet<Integer> lHSet = new LinkedHashSet<>(Arrays.asList(34, 6, 1, 3, -67, 5, 4, 5, 9, -5));
        return lHSet;
    }

    public static TreeSet<Integer> getTreeSet() {
        TreeSet<Integer> tSet = new TreeSet<>(Arrays.asList(34, 6, 1, 3, -67, 5, 4, 5, 9, -5));
        return tSet;
    }
}