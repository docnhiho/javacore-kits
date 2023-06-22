public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    //1
    public float divide(float a, float b) {
        return a / b;
    }

    //2
    public String firstLetter(String a) {
        return a.substring(0, 1);
    }
    //3
    public String isEven(int a) {
        if (a % 2 == 0) {
            return "So chan";
        } else {
            return "So le";
        }
    }

    //4
    public short sum(short a, short b) {
        return (short) (a + b);
    }

    //5
    public long Factorial(int n) {
        long giai_thua = 1;
        for (int i = 1; i <= n; i++) {
            giai_thua *= i;
        }
        return giai_thua;
    }

    //6
    public double Average (int...a){
        double j = 0;
        for (int i = 0; i <a.length ; i++) {
            j = j + a[i];
        }
        return j = j / a.length;
    }
    
    public int Equal(int a, int b){
        int i = a > b ? a : b;
        return i;
    }

    public float canhHuyen(float a ,float b){
        float result = (float) Math.sqrt(a*a + b*b);
        return result;
    }

    public char lastLetter(String a){
        char b = a.charAt(a.length()-1);
        return b;
    }

//    public static void piramid(){
//        int k = 0;
//        for (int i = 0; i < ; i++) {
//
//        }
//    }
}
