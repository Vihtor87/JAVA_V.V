/*
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2List {

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        List<String> memory = new ArrayList<>();

        while (!str.equals("exit")) {
            if (str.equals("print")) {
                printReverse(memory);
                System.out.println(memory);
            } else if (str.equals("revert")) {
                deleteStrLastEl(memory);
                System.out.println(memory);
            } else {
                saveInput(str, memory);
                System.out.println(memory);
            }
            System.out.println();
            str = scanner.next();
        }
        scanner.close();
    }

    public static void saveInput(String str, List<String> memory) {
        memory.add(str);
    }

    public static void printReverse(List<String> memory) {
        for (int i = memory.size() - 1; i >= 0; i--) {
            System.out.println(memory.get(i));
        }
    }

    public static void deleteStrLastEl(List<String> memory) {
        if (!memory.isEmpty()) {
            memory.remove(memory.size() - 1);
        }
    }
}