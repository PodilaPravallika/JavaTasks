package tasks.exceptionhandling;

public class MultipleExceptionDemo {

    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};

           
            System.out.println("Accessing 5th element: " + numbers[4]);

            
            int result = 100 / 0;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}

