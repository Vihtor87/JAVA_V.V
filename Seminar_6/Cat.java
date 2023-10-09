import java.util.Map;
import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private Map<Integer, String> vactin;

    public Cat(String name, int age, Map<Integer, String> vactin) {
        this.name = name;
        this.age = age;
        this.vactin = vactin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<Integer, String> geVactin() {
        return vactin;
    }

    public Map<Integer, String> setVactin(int num, String value) {
        vactin.put(num, value);
        return vactin;
    }

    @Override
    public String toString() {
        return "Name: " + name + " age: " + age + " vaction" + vactin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cat cat = (Cat) obj;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
