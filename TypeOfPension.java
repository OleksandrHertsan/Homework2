import java.util.Random;

public enum TypeOfPension {

    State,
    notState,
    scam;

    public static TypeOfPension getRandomType() {
        TypeOfPension[] types = TypeOfPension.values();
        Random random = new Random();
        return types[random.nextInt(values().length)];
    }
}
