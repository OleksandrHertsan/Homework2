import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainForPerson {

    public static void main(String[] args) {
        Set<PensionFund> firstPensionFundSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            firstPensionFundSet.add(new PensionFund("", TypeOfPension.getRandomType(), "27-01-2023"));
        }

        Worker firstWorker = new Worker("Alex");

        firstWorker.setAge(42);
        firstWorker.setMinSalary(1700);
        firstWorker.setMaxSalary(3000);
        firstWorker.setPensionFundSet(firstPensionFundSet);

        Worker secondWorker = new Worker("Paul");
        secondWorker.setAge(57);
        secondWorker.setMinSalary(2300);
        secondWorker.setMaxSalary(5000);
        Set<PensionFund> secondPensionFundSet = new HashSet<>();
        secondPensionFundSet.add(new PensionFund("", TypeOfPension.scam, "21-10-1992"));
        secondPensionFundSet.add(new PensionFund("", TypeOfPension.notState, "30-05-1999"));
        secondWorker.setPensionFundSet(secondPensionFundSet);


        double firstResult = firstWorker.calculateBestPension();
        System.out.println(firstResult);
        double secondResult = secondWorker.calculateBestPension();
        System.out.println(secondResult);
//        Worker firstWorker = new Worker("Alex");
//        List<Kids> firsListOfKids = new ArrayList<>();
//        firsListOfKids.add(new Kids("Veronika"));
//        firsListOfKids.add(new Kids("Marine"));
//        firsListOfKids.add(new Kids("Pasha"));
//        firstWorker.setKids(firsListOfKids);
//
//
//        Worker secondWorker = new Worker("Luke");
//        List<Kids> secondListOfKids = new ArrayList<>();
//        secondListOfKids.add(new Kids("Kate"));
//        secondListOfKids.add(new Kids("Sasha"));
//        secondListOfKids.add(new Kids("Conor"));
//        secondListOfKids.add(new Kids("Jax"));
//        secondWorker.setKids(secondListOfKids);
//
//
//        Worker thirdWorker = new Worker("Kayne");
//        List<Company> companies = new ArrayList<>();
//        companies.add(new Company("Google"));
//        companies.add(new Company("Apple"));
//        companies.add(new Company("Microsoft"));
//        thirdWorker.setJob(companies);
//
//
//        firstWorker.showKids();
//        secondWorker.showKids();
//        thirdWorker.showCompaniesPersonWorked();

    }

}
