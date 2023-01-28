import java.util.ArrayList;
import java.util.List;

public class MainForPerson {

    public static void main(String[] args) {
        Worker firstWorker = new Worker("Alex");
        List<Kids> firsListOfKids = new ArrayList<>();
        firsListOfKids.add(new Kids("Veronika"));
        firsListOfKids.add(new Kids("Marine"));
        firsListOfKids.add(new Kids("Pasha"));
        firstWorker.setKids(firsListOfKids);


        Worker secondWorker = new Worker("Luke");
        List<Kids> secondListOfKids = new ArrayList<>();
        secondListOfKids.add(new Kids("Kate"));
        secondListOfKids.add(new Kids("Sasha"));
        secondListOfKids.add(new Kids("Conor"));
        secondListOfKids.add(new Kids("Jax"));
        secondWorker.setKids(secondListOfKids);


        Worker thirdWorker = new Worker("Kayne");
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Google"));
        companies.add(new Company("Apple"));
        companies.add(new Company("Microsoft"));
        thirdWorker.setJob(companies);


        firstWorker.showKids();
        secondWorker.showKids();
        thirdWorker.showCompaniesPersonWorked();

    }

}
