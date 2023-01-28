public enum Month {
    JANUARY(1.1),
    FEBRUARY(0),
    MARCH(0),
    APRIL(0),
    MAY(0),
    JUNE(0),
    JULY(0),
    AUGUST(0),
    SEPTEMBER(0),
    OCTOBER(0),
    NOVEMBER(2),
    DECEMBER(10);

    private double number;

    Month(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }
}
