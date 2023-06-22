package JavaBasic;

import java.util.Scanner;

public class exe1 {


    public static void main(String[] args) {
        InsertScore();
    }

    private static void InsertScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem: ");
        int score = sc.nextInt();
        if (score <= 100 && score >= 80) {
            System.out.println("Diem A");
        } else if (score <= 79 && score >= 60) {
            System.out.println("Diem B");
        } else if (score <= 59 && score >= 40) {
            System.out.println("Diem C");
        } else if (score <= 39 && score >= 20) {
            System.out.println("Diem D");
        } else if (score <= 19 && score >= 0) {
            System.out.println("Diem E");
        }


    }


}
