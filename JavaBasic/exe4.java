package JavaBasic;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        exe4 exe4 = new exe4();
        Scanner sc = new Scanner(System.in);
        System.out.print("input n: ");
        int n = sc.nextInt();
        exe4.printEven(n);
    }

    void printEven(int n){
        for (int i = 0; i < n; i++) {
            if(i %2 == 0){
                System.out.println(i);
            }
        }
    }
}
