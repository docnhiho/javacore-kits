package JavaString;

import java.util.ArrayList;
import java.util.List;

public class exe5 {
    public static void main(String[] args) {
        transform();
    }
    public static void transform() {
        ArrayList<String> str = new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
            str.set(i, String.valueOf((Integer)i));
        }
        System.out.println(str);
    }

}


