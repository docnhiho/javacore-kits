package JavaBasic;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = sc.nextInt();
        if(year %4 == 0){
            System.out.println("Nam nhuan");
        }else {
            System.out.println("Nam khong nhuan");
        }
    }
}
