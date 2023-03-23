import java.util.List;
import java.util.Objects;

public class PensionFund {

    private static final double pensionCoefficient = 0.02; //коэфицент
    private static double average_Salary = 1500;

    private String fundName;

    private final String date;

    private TypeOfPension type;
    private List<String> currencies;

    private String name;

    private TypeOfPension typeOfPension;
    public String getFundName() {
        return name;
    }

    public void setFundName(String name) {
        this.name = name;
    }

    public TypeOfPension getFundType() {
        return typeOfPension;
    }

    public void setFundType(TypeOfPension fundType) {
        this.typeOfPension = fundType;
    }



    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }


    public PensionFund(String fundName, TypeOfPension type, String date) {
        this.fundName = fundName;
        this.date = date;
        this.type = type;
    }

    public double calculatePension(int age, double minSalary, double maxSalary) {
        double averageSalary;
        switch (type) {
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

    if(!Objects.equals(fundName,that.fundName))return false;
        if(type !=that.type)return false;
        return Objects.equals(date,that.date);
}
    
    @Override
    public int hashCode() {
        int result = fundName != null ? fundName.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
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








