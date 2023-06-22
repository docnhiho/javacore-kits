package JavaString;

public class exe1 {
    public static void main(String[] args) {
        String a = dedupe("aabc");
        System.out.println("Exe1: "+ a);

        System.out.println("Exe2: " + findChar("adsasd", 2));
    }

    public static String dedupe(String str) {
        char[] chars = str.toCharArray();
        int count;
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != ' ') {
                    count++;
                    chars[j] = '0';
                }
            }
            if (count > 1 && chars[i] != '0') {
                System.out.println(chars[i]);
            }
        }
        return str;
    }

    public static char findChar(String str, int i){
        return str.charAt(i);
    }


}
