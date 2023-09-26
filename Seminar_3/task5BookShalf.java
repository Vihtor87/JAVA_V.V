/*
 * Каталог товаров книжного магазина сохранен в виде двумерного
 * списка List<ArrayList<String>> так, что на 0й позиции каждого
 * внутреннего списка содержится название жанра, а на остальных
 * позициях - названия книг. Напишите метод для заполнения данной структуры.
 */

import java.util.ArrayList;
import java.util.List;

public class task5BookShalf {
    public static void main(String[] args) {
        List<ArrayList<String>> book = new ArrayList<>();
        fillArray(book);
        System.out.println(book);
    }

    public static void fillArray(List<ArrayList<String>> book) {
        ArrayList<String> detective = new ArrayList<>();
        detective.add("Детектив");
        detective.add("Шерлок Холмс");
        detective.add("Пуаро");
        detective.add("Девушка из поезда");
        book.add(detective);

        ArrayList<String> classic = new ArrayList<>();
        classic.add("Классика");
        classic.add("Война и мир");
        classic.add("Евгений Онегин");
        classic.add("Анна Каренина");
        book.add(classic);

        ArrayList<String> fantazy = new ArrayList<>();
        fantazy.add("Фэнтези");
        fantazy.add("Гарри Поттер");
        fantazy.add("Путешествие туда и обратно");
        fantazy.add("Песнь льда и пламени");
        book.add(fantazy);
    }
}
