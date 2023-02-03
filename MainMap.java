import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();


        map.put("Сидоров", 5);
        map.put("Иванов", 2);

if (map.containsKey(name)) {
    Integer mark = map.get(name);
    System.out.println(mark);
}
else {
    System.out.println("There is no this student");
}

     Set<String> set = map.keySet();
        System.out.println(set);

        Collection<Integer> collection = map.values();

        for (Integer integer : collection){
            System.out.println(integer);
        }

        boolean hasTwo = map.containsValue(2);
        System.out.println(hasTwo);


    }
}
