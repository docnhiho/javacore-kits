package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class demo_hashmap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Alice" , 101);
        students.put("Bob" , 102);
        students.put("Charlie" , 103);
        System.out.println(students);

        int size = students.size();
        System.out.println("Size of the hashmap: " + size);

        int aliceId = students.get("Alice");
        System.out.println("Alice's ID: " + aliceId);

        boolean containBob = students.containsKey("Bob");
        System.out.println("Does the map contain Bob? " +containBob);

        System.out.println("Element in the map: ");
        for (Map.Entry<String, Integer> entry : students.entrySet()){
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("Name: " + name + ", ID: " +id);
        }

        Integer removedId= students.remove("Bob");
        System.out.println("Remove Id for Bob" + removedId);

        students.clear();
        System.out.println("size of HashMap after remove: " +students.size());
    }
}
