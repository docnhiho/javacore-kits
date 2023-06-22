package JavaBasic;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
//        if(a < b){
//            System.out.println("-1");
//        } else if (a == b) {
//            System.out.println("0");
//        } else {
//            System.out.println("1");
//        }
        String result;

        result = a<b? "-1" : a==b? "0" : "1";
        System.out.println(result);
    }

}
