import java.util.Scanner;

/*
 * test
 */
public class Scaner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String t = scanner.nextLine();
        System.out.println("Введено: " + t);
        scanner.close();
    }
}