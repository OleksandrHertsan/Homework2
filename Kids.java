public class Kids extends Person{
    public Kids(String name) {
        super(name);
    }

    public Kids(String name, int age, int height, int weight) {
        super(name);
    }


    @Override
    public void die() {
        System.out.println("Ребенок умер");
    }

    @Override
    public String toString() {
        return "Child{" +
                "name=" + getName() +
                '}';
    }
}
