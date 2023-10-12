/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
* Создать множество ноутбуков.
* Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
* Критерии фильтрации можно хранить в Map. Например:
* “Введите цифру, соответствующую необходимому критерию:
* 1 - ОЗУ
* 2 - Объем ЖД
* 3 - Операционная система
* 4 - Цвет …
* Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
*  Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class LaptopStore {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop("Lenovo", 8, 256, "Windows 11");
        Laptop lp2 = new Laptop("HP", 16, 512, "Windows 95");
        Laptop lp3 = new Laptop("Apple", 8, 256, "MacOs");
        Laptop lp4 = new Laptop("Asus", 4, 1024, "Windows 98");
        Laptop lp5 = new Laptop("Honor", 12, 512, "Windows 10");
        Laptop lp6 = new Laptop("Acer", 4, 256, "Windows 11");

        Set<Laptop> haveLaptop = new HashSet<Laptop>();
        haveLaptop.add(lp1);
        haveLaptop.add(lp2);
        haveLaptop.add(lp3);
        haveLaptop.add(lp4);
        haveLaptop.add(lp5);
        haveLaptop.add(lp6);

        Map<Integer, String> mapFiltr = new HashMap<>();
        mapFiltr.put(1, "оперативная память");
        mapFiltr.put(2, "жёсткий диск");
        mapFiltr.put(3, "операционная система");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите желаемые характеристики");
            System.out.print("объем оперативной памяти: ");
            int ramUser = sc.nextInt();
            System.out.print("объем накопителя: ");
            int storUser = sc.nextInt();
            
            for (Laptop lap : haveLaptop) {
                if ((lap.getRam() >= ramUser) && (lap.getHdd() >= storUser)) {
                    System.out.println(lap.toString());
                }
            }
        }
    }
}