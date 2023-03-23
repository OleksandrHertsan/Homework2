import java.io.IOException;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {

        List<PensionFund> pensionFunds = FundGenerator.generate();

        pensionFunds.stream()
                .filter(f -> f.getFundType().equals(TypeOfPension.State))
                .filter(f -> f.getFundName().length() < 15)
                .forEach(System.out::println);

    }
}
