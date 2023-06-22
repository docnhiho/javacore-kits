package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class demo_list {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println(fruits);

        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        fruits.set(1, "Mango");
        System.out.println("Modified list: " + fruits);

        System.out.println("Elements in the list: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        boolean removed = fruits.remove("Orange");
        System.out.println("Is orange removed: " + removed);
        System.out.println("Update list: " + fruits);

        boolean contains = fruits.contains("Banana");
        System.out.println("Does the list contain banana? " + contains);

        fruits.clear();
        System.out.println("Size of the list after clearning: " + fruits.size());
    }
}
