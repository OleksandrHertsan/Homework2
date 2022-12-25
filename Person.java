public class Person {

    String name;

    int age;

    String height;

    int weight;



    public void info() {
        System.out.println("Этого человека зовут " + name + ", ему " + age + " лет, его рост равен " + height + ", его вес равен " + weight + " кг");
        System.out.println("Идти на работу?");
        if (age < 18 || age > 70) {
            System.out.println("Отдыхаю дома");
        }
        else {
            System.out.println("Работаю(");
        }
    }

    private int money() {
        int money = 20000;
        return money;
        //Ничего такого не произошло, просто попросил написать return
    }

}


