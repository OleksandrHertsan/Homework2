public class MainForPerson {

    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            public void die() {

            }
        };
        person.name = "Alex";
        person.age = 19;
        person.height = 200;
        person.weight = 100;

        Person secondPerson = new Person() {
            @Override
            public void die() {
            }
        };
        person.info();

        PensionFund statePensionFund = new PensionFund("Bank1", TypeOfPension.State, "15-02-1992");
        PensionFund notStatePensionFund = new PensionFund("Bank2", TypeOfPension.notState, "30-10-2005");

        double statePension = statePensionFund.calculatePension(25, 1500.0, 2800.0);
        double notStatePension = notStatePensionFund.calculatePension(25, 1500.0, 2800.0);

        System.out.println(statePension);
        System.out.println(notStatePension);

        Worker worker = new Worker("Vasya", 49, 175, 86);
        worker.setMinSalary(1300);
        worker.setMaxSalary(2800);
        double workersPension;
        workersPension = worker.calculatePension();
        System.out.println(workersPension);

    }

}
