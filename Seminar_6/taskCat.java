import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class taskCat {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "vact1");
        map.put(2, "vact2");
        map.put(3, "vact3");

        Cat cat1 = new Cat("Vasja", 5, map);
        Cat cat2 = new Cat("Max", 4, map);
        Cat cat3 = new Cat("Fedja", 6, map);
        Cat cat4 = new Cat("Vasja", 5, map);
        Cat cat5 = new Cat("Fedja", 6, map);

        HashSet<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);


        // System.out.println(cat1);
        // System.out.println(cat2);
        // System.out.println(cat3);
        // System.out.println(cat4);
        // System.out.println(cat5);

        for (Cat cat : catSet) {
            System.out.println(cat);
        }
    }
}
