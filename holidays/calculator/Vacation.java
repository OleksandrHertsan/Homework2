package holidays.calculator;

public class Vacation {
    public static int calculate(int days, int people) {
        if (days >= 0 && people >= 0) {
            return days * people;
        }
        else {
            return 0;
        }
    }
}
