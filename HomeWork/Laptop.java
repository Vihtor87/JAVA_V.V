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

class Laptop {
    private String name;
    private int ram;
    private int hdd;
    private String os;

    public Laptop(String name, int ram, int hdd, String os) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    @Override
    public String toString() {
        return String.format(
                "Название: " + this.name + "; объем оперативной памяти: " + this.ram + "Гб;" + " объем накопителя: "
                        + this.hdd + "Гб;" + " ОС - " + this.os);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            return this.name.equals(((Laptop) obj).name) && this.ram == ((Laptop) obj).ram
                    && this.hdd == ((Laptop) obj).hdd && this.os.equals(((Laptop) obj).os);
        }
        return false;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHdd() {
        return this.hdd;
    }

    public String getOs() {
        return this.os;
    }
}
