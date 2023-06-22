package JavaBasic;

public class exe5 {
    public static void main(String[] args) {
//        int i = 9;
//        piramid(i);



        //in cac tham so tu args
        int result = 0;
        for (int i = 0; i < args.length ; i++) {
            result += Integer.parseInt(args[i]);
        }
        System.out.println("Tong la: " + result);
//        for (String arg : args)
//            System.out.println(arg);
        //chay chuong trinh :  java JavaBasic/exe5.java "minh nhat"
    }

//    static void piramid(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }
//
//
//    }
}
