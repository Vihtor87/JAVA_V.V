import java.util.Calendar;
import java.util.Scanner;

public class CheckData {
    /*
     * В консоли запросить имя пользователя. В зависимости от текущего времени,
     * вывести приветствие вида
     * "Доброе утро, <Имя>!", если время от 05:00 до 11:59;
     * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
     * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
     * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
     */

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner Scanner = new Scanner(System.in, "ibm866");
        String name = Scanner.nextLine();
        Scanner.close();

        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
    

        String timeOfDay;
    
        if (hour >= 5 && hour < 12) {
            timeOfDay = "Доброе утро";
        } else if (hour >= 12 && hour < 18) {
            timeOfDay = "Добрый день";
        } else if (hour >= 18 && hour < 23) {
            timeOfDay = "Добрый вечер";
        } else {
            timeOfDay = "Доброй ночи";
        }
        System.out.printf(timeOfDay + ", " + name + "!");
    }
}
