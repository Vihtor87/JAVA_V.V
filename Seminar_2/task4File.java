/*
 * Напишите метод, который составит строку, состоящую из 100
 * повторений слова TEST и метод, который запишет эту строку в
 * простой текстовый файл, обработайте исключения.
 */

import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task4File {
    public static void main(String[] args) {
        String str = "TEST";
        int count = 100;
        String text = repeatString(str, count);
        writeToFile(text, "forTask4.txt");
    }

    public static String repeatString(String word, int val) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < val; i++) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void writeToFile(String abc, String road) {
        //File dir = new File(".txt");
        try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(road))) {
            bWriter.write(abc);
        }
        catch(IOException e) {
            System.out.println("ERROR!");
        }
    }
}
