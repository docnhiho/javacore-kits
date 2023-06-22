public class demo {
    public static void main(String[] args) {
//        int myNumber = 14;
//        myNumber = 20;
//        System.out.println("myNumber: " +myNumber);
//
//        String numberStr = "123";
//        Integer number = Integer.parseInt(numberStr);
//        System.out.println(number.getClass());
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            i++;
//        }

//        int count = 1;
//        do {
//            System.out.println("Count: " +count);
//            count ++;
//        }while (count <4);
//        for (int i = 0; i <= 10 ; i++) {
//            if (i == 6){
//                continue;
//            }
//            System.out.println(i);
//        }

        //tim so chan dau tien trong mang
        int [] numbers ={ 3,9,4,7,2,6};
        int result = demo.findFirstNumber(numbers);
        System.out.println("First even number: "+result);

    }

    public static int findFirstNumber(int [] numbers){
        for (int num : numbers){
            if (num %2 == 0){
                return num;
            }
        }return -1;
    }
}
