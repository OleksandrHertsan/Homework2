import java.util.Objects;

public class PensionFund {

      private static final double pensionCoefficient = 0.02; //коэфицент
      private static double average_Salary = 1500;

      private String fundName;

      private final String date;

      private TypeOfPension type;

      public PensionFund(String fundName, TypeOfPension type, String date) {
          this.fundName = fundName;
          this.date = date;
          this.type = type;
      }

      public double calculatePension(int age, double minSalary, double maxSalary) {
          double averageSalary;
          switch (type){
              case State:
                  averageSalary = AverageUtils.findAverageOfNumbers(minSalary, maxSalary);
                  break;
              case notState:
                  averageSalary = AverageUtils.findAverageOfNumbers(minSalary, maxSalary, average_Salary);
                  break;
              case scam:
                  averageSalary = 0;
              default:
                  averageSalary = 0;
          }
              return averageSalary * age * average_Salary;
          }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return Objects.equals(fundName, that.fundName) && Objects.equals(date, that.date) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundName, date, type);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "fundName='" + fundName + '\'' +
                ", date='" + date + '\'' +
                ", type=" + type +
                '}';
    }
}








