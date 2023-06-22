package JavaCollection;

import java.util.HashMap;
import java.util.Map;

public class demo_map {
    public static void main(String[] args) {
        Map<String, Integer> studentIds = new HashMap<>();

        studentIds.put("John" , 101);
        studentIds.put("Alice" , 102);
        studentIds.put("Bob" , 103);
        System.out.println(studentIds);

        int size = studentIds.size();
        System.out.println("Size of the map: " + size);

        int johnId = studentIds.get("John");
        System.out.println("John's ID: " + johnId);

        boolean containAlice = studentIds.containsKey("Alice");
        System.out.println("Does the map contain Alice? " +containAlice);

        System.out.println("Element in the map: ");
        for (Map.Entry<String, Integer> entry : studentIds.entrySet()){
            String name = entry.getKey();
            int id = entry.getValue();
            System.out.println("Name: " + name + ", ID: " +id);
        }

        //Remove element from the map
        Integer removedID = studentIds.remove("Bob");
        System.out.println("Removed ID: " + removedID);
        System.out.println("Update map: "+ studentIds);

        //Clear all
        studentIds.clear();
        System.out.println("Size of the map after clearing: " + studentIds.size());

    }
}
