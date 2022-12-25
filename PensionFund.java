public class PensionFund {

      private static final double pensionCoefficient = 0.02; //коэфицент
      private static final int average_Salary = 1500;

      private String fundName;
      private boolean isState;
      private final String date;

      public PensionFund(String fundName, boolean isStatePension, String date) {
          this.fundName = fundName;
          this.isState = isStatePension;
          this.date = date;
      }

      public double calculatePension(int age, double minSalary, double maxSalary) {
          if (isState) {
              double averageSalary = AverageUtils.findAverageOfTwoNumbers(maxSalary, minSalary);
              return averageSalary * age * pensionCoefficient;
          } else {
              double averageSalary = AverageUtils.findAverageOfThreeNumbers(minSalary, maxSalary, average_Salary);
              return averageSalary * age * average_Salary;
          }

      }

      }





