/*
 *  Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 * Задание состоит из двух блоков
 * Задание №2.2 (если выполнено первое задание)
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */

import java.util.ArrayList;
import java.util.Collections;

public class task3FillEarth {
    public static void main(String[] args) {
        ArrayList<String> planetName = new ArrayList<>();
        createList(planetName);
        System.out.println(planetName);

        Collections.sort(planetName);
        System.out.println(planetName);

        System.out.println(dict(planetName));

        deleteSomePlanet(planetName);
        System.out.println(planetName);

    }

    public static void createList(ArrayList<String> planetName) {
        planetName.add("Earth");
        planetName.add("Saturn");
        planetName.add("Venera");
        planetName.add("Uran");
        planetName.add("Mars");
        planetName.add("Upiter");
        planetName.add("Saturn");
        planetName.add("Uran");
    }

    public static String dict(ArrayList<String> planetName) {
        String currentPlanet = planetName.get(0);
        String result = "";
        int count = 1;
        for (int i = 1; i < planetName.size(); i++) {
            if (planetName.get(i) == currentPlanet) {
                count++;
            } else {
                result += currentPlanet + "->" + Integer.toString(count) + System.lineSeparator();
                ;
                count = 1;
                currentPlanet = planetName.get(i);
            }
        }

        return result += currentPlanet + "->" + Integer.toString(count);
    }

    public static void deleteSomePlanet(ArrayList<String> planetName) {
        for (int i = 1; i < planetName.size(); i++) {
            if (planetName.get(i) == planetName.get(i - 1)) {
                planetName.remove(i);
            }
        }
    }
}
