package tasks.wrapperclasses;
public class StringParsingDemo {
    public static void main(String[] args) {
        // Step 1: Input strings
        String intStr = "123";
        String doubleStr = "45.67";
        String booleanStr = "true";

        // Step 2: Parse strings to primitives
        int intVal = Integer.parseInt(intStr);
        double doubleVal = Double.parseDouble(doubleStr);
        boolean booleanVal = Boolean.parseBoolean(booleanStr);

        // Step 3: Print converted values and their types
        System.out.println("Parsed int value: " + intVal + " | Type: " + ((Object)intVal).getClass().getSimpleName());
        System.out.println("Parsed double value: " + doubleVal + " | Type: " + ((Object)doubleVal).getClass().getSimpleName());
        System.out.println("Parsed boolean value: " + booleanVal + " | Type: " + ((Object)booleanVal).getClass().getSimpleName());
    }
}

