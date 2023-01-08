public abstract class Person {

    String name;

    int age;

    int height;

    int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {

    }


    public  void info() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2){
            this.name = name;
        }
        else {
            System.err.println("Error. Name is short");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        }
        else {
            System.err.println("Incorrect age");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 40) {
            this.height = height;
        } else {
            System.err.println("Error. Person is too short");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 45) {
            this.weight = weight;
        } else {
            System.err.println("Error. Weight is too low");
        }
    }



    public abstract void die();

}


