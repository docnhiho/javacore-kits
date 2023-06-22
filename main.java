public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(25,4);
        System.out.println(result);

        //1
        float devide = calc.divide(10, 3);
        System.out.println(devide);

        //2
        String str = calc.firstLetter("minhnhat");
        System.out.println(str);

        //3
        String a = calc.isEven(11);
        System.out.println(a);

        //4
        short b = calc.sum((short)5, (short)2);
        System.out.println(b);

        //5
        long c = calc.Factorial(10);
        System.out.println(c);

        //6
        double d = calc.Average(1, 2, 3);
        System.out.println("trung binh cong: " + d);

        //7
        int i = calc.Equal(0,0);
        System.out.println("so lon hon la: " +i);

        //8
        float e = calc.canhHuyen(-3,-4);
        System.out.println(e);

        //9
        char s = calc.lastLetter("nhat");
        System.out.println(s);

//        calc.piramid();

    }
}
