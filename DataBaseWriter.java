public class DataBaseWriter<TypeData> {
    private String database;
    private TypeData value;


    public DataBaseWriter(String database, TypeData value) {
        this.database = database;
        this.value = value;
    }

    public void save() {
        System.out.printf("данные в бд записаны, тип данных = %s", value.getClass());
    }
}
