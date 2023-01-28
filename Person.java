import java.util.List;
import java.util.Objects;

public abstract class Person {

    String name;

    int age;

    int height;

    int weight;
    private List<Kids> kids;

    public Person(String name) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Kids> getKids() {
        return kids;
    }

    public void setKids(List<Kids> kids) {
        this.kids = kids;
    }

    public abstract void die();

    public void showKids() {
        System.out.println("I have " + kids.size() + " kids");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && Objects.equals(name, person.name) && Objects.equals(kids, person.kids);
    }

    public void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю дома");
        } else {
            System.out.println("Работаю(");
        }
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + weight;
        result = 31 * result + (kids != null ? kids.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", kids=" + kids +
                '}';
    }

    }



