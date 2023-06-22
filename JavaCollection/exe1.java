package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class exe1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("loop1");
        for(int num : numbers){
            System.out.println(num);
        }

        System.out.println("loop2");
        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("loop3");
        numbers.forEach((e) ->{
            System.out.println(e);
        });

    }
}
