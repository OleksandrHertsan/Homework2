public class MainForPerson {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.age = 19;
        person.height = "2 meters";
        person.weight = 100;

        Person secondPerson = new Person();
        person.info();

        PensionFund statePensionFund = new PensionFund("Bank1", true, "15-02-1992");
        PensionFund notStatePensionFund = new PensionFund("Bank2", false, "30-10-2005");

        double statePension = statePensionFund.calculatePension(25, 1500.0, 2800.0);
        double notStatePension = notStatePensionFund.calculatePension(25, 1500.0, 2800.0);

        System.out.println(statePension);
        System.out.println(notStatePension);

    }

}
