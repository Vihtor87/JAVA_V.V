/*
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида text~num
 * 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task1String {
    public static void main(String[] args) {
        System.out.println("Введите строку вида text~num: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        List<String> linkedList = new LinkedList<>();

        while (!str.equals("exit")) {
            String[] strArr = str.split("~");

            String text = strArr[0];
            int pos = Integer.parseInt(strArr[1]);
            if (!text.equals("print")) {

                if (pos <= linkedList.size()) {
                    linkedList.add(pos, text);
                    System.out.println("added text: " + text);
                    System.out.println(linkedList);
                } else {
                    System.out.println("Ошибка! Неверное значение!");
                }
            } else {
                if (pos < linkedList.size()) {
                    System.out.println(linkedList.get(pos));
                    linkedList.remove(pos);
                    System.out.println(linkedList);
                } else {
                    System.out.println("Ошибка! Неверное значение!");
                }

            }
            System.out.println("Введите заново строку вида text~num: ");
            str = scanner.next();
        }
        scanner.close();
    }
}
