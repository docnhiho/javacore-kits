package JavArray;

public class exe {
    public static void main(String[] args) {
//        String[] arr = new String[]{"a", "b", "c", "b"};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j])
//                    System.out.println(arr[j]);
//            }
//        }
       String[] arr = new String[]{"a", "b", "c", "b"};
       var ab = dedupe(arr);
        System.out.println(ab);
    }

    public static String[] dedupe(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) ;
                System.out.println(arr[j]);
            }
        }
        return arr;
    }

}
