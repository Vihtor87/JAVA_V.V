/*
 * Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */

public class task3Polindrome {
    public static void main(String[] args) {
        boolean isPolin = isPolindrome("ABCABA");
        System.out.println(isPolin);
    }

    public static boolean isPolindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

/* Ввод через консоль:
public class task3Polindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String str = scan.nextLine();
        boolean isPal = isPalindrome(str);
        System.out.println(str);
        System.out.println(isPal);

    }
    
    public static boolean isPalindrome(String str){
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
            
        }

        return true;
    } 
}
*/