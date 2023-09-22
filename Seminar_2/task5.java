/*
 * Напишите метод, который вернет содержимое текущей папки в виде массива строк.
 * Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
 * Обработайте ошибки с помощью try-catch конструкции.
 * В случае возникновения исключения, оно должно записаться в лог-файл.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task5 {
    static Logger logger = Logger.getLogger(task5.class.getName());

    public static void main(String[] args) {
        String[] array = getCurrentDirectoryCountent();
        System.out.println(Arrays.toString(array));
        loggerInit();
        writeToFile(array, "listArray.txt");
    }

    public static String[] getCurrentDirectoryCountent() {
        File file = new File(".");
        return file.list();
    }

    public static void writeToFile(String[] word, String road) {
        // File dir = new File(".txt");
        try (BufferedWriter bfWriter = new BufferedWriter(new FileWriter(road))) {
            for (String str : word) {
                bfWriter.write(str + System.lineSeparator());
            }
        }

        catch (IOException e) {
            logger.info(e.getMessage());
        }
    }

    public static void loggerInit() {
        try {
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formater = new SimpleFormatter();
            fh.setFormatter(formater);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
