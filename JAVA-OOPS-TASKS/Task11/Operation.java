package tasks.oops;

@FunctionalInterface
interface MathOperation
{
	int calculate(int x, int y);
}
public class Operation {

	// Generalized method to perform and print operation
    static void performOperation(String label, MathOperation calc, int a, int b) {
        System.out.println(label + ": " + calc.calculate(a, b));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation add = (x, y) -> x + y;
		MathOperation multiply = (x, y) -> x * y;
		MathOperation subs = (x, y) -> x - y;
		MathOperation div = (x, y) -> x / y;

        performOperation("Addition", add, 10, 20);
        performOperation("Multiplication", multiply, 10, 20);
        performOperation("Subtraction", subs, 80, 10);
        performOperation("Division", div, 100, 20);


	}

}
