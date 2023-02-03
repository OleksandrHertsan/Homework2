import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Company microsoft = new Company("Microsoft");
        Company google = new Company("Google");
        Company cdek = new Company("cdek");
        Company kfc = new Company("KFC");

        Set<Company> set = new TreeSet<>();
        set.add(microsoft);
        set.add(google);
        set.add(cdek);
        set.add(kfc);

        System.out.println(set);


    }
}
