package tasks.wrapperclasses;

public class PrimitiveWrapperConversion {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int intVal = 42;
        double doubleVal = 3.14;
        char charVal = 'A';

        // Step 2: Convert primitives to wrapper objects using valueOf()
        Integer intWrapper = Integer.valueOf(intVal);
        Double doubleWrapper = Double.valueOf(doubleVal);
        Character charWrapper = Character.valueOf(charVal); // Character doesn't have valueOf(int), so this is correct

        // Step 3: Convert wrapper objects back to primitives using xxxValue() methods
        int intPrimitive = intWrapper.intValue();
        double doublePrimitive = doubleWrapper.doubleValue();
        char charPrimitive = charWrapper.charValue();

        // Step 4: Print all values
        System.out.println("Primitive int: " + intVal + ", Wrapper Integer: " + intWrapper + ", Back to Primitive: " + intPrimitive);
        System.out.println("Primitive double: " + doubleVal + ", Wrapper Double: " + doubleWrapper + ", Back to Primitive: " + doublePrimitive);
        System.out.println("Primitive char: " + charVal + ", Wrapper Character: " + charWrapper + ", Back to Primitive: " + charPrimitive);
    }
}
