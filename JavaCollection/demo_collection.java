package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

public class demo_collection {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //Get the size of collection
        int size = numbers.size();
        System.out.println("Size of the collection: " + size);

        //check if the collection is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the collection empty: " + isEmpty);

        //Iterate over the elements in the collection
        System.out.println("Elements in the collection: ");
        for (int number : numbers){
            System.out.println(number);
        }

        //Remove an element from the collection
        boolean removed = numbers.remove(20);
        System.out.println("Is 20 removed? " + removed);
        for (int number : numbers){
            System.out.println(number);
        }
        System.out.println("Size of the collection: " + numbers.size());

        numbers.clear();
        System.out.println("Size of the collection: " + numbers.size());


    }
}
