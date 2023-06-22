package JavaString;

import java.util.LinkedList;
import java.util.List;

public class exe_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>(List.of("mid"));
        System.out.println(arr);
        insertHead(arr,"head");
        System.out.println(arr);
        insertTail(arr,"tail");
        System.out.println(arr);

    }
    public static void insertHead(LinkedList<String> list, String value){
        list.addFirst( value);
    }public static void insertTail(LinkedList<String> list, String value){
        list.addLast( value);
    }

}
