package JavaCollection;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class demo_hashset {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        int size = numbers.size();
        System.out.println("Size of the HashSet: " + size);


        boolean contains = numbers.contains(10);
        System.out.println("Does the map contain 10? " + contains);

        System.out.println("Element in the Hashset: ");
        for (int number : numbers){
            System.out.println(number);
        }

        //Remove element from the map
        boolean removedID = numbers.remove(20);
        System.out.println("Is 20 removed: " + removedID);
        System.out.println("Update HashSet: "+ numbers);

        //Clear all
        numbers.clear();
        System.out.println("Size of the Hashset after clearing: " + numbers.size());
    }
}
