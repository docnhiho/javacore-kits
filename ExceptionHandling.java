public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int [] numbers = {1,2,3};
            int result = divide(numbers,0);
            System.out.println("Result: " + result);
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException: " + ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }finally {
            System.out.println("Cleanup code goes here");
        }
    }

    public static int divide(int[] numbers, int divisor) {
        int result = 0;
        try {
            result = numbers[0]/divisor;
        }catch (ArithmeticException ex){
            throw  ex;
        }catch (ArrayIndexOutOfBoundsException ex){
            throw ex;
        }
        return result;
    }
}
