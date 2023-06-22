package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class demo_set {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println(fruits);

        int size = fruits.size();
        System.out.println("Size of the set: " +size);

        boolean containsApple = fruits.contains("Apple");
        System.out.println("Does the set contain Apple? " + containsApple);

        System.out.println("Elements of the set: ");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        boolean removed = fruits.remove("Orange");
        System.out.println("Is Orange removed: " + removed);
        System.out.println("Update set: " + fruits);

        fruits.clear();
        System.out.println("Size of the set after clearing: " +fruits.size());

    }
}
