public class MainGeneric {
    public static void main(String[] args) {

        Worker worker = new Worker("Alex");

        DataBaseWriter<Person> database = new DataBaseWriter<>("DB", worker);
        database.save();

    }
}
