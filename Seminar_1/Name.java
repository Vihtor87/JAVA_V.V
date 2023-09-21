import java.util.Scanner;

public class Name {
    /*
     * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
     * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
     */
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in, "ibm866");
        String name = scanner.next();
        System.out.println("Привет, " + name + "!");
        scanner.close();
    }
}
