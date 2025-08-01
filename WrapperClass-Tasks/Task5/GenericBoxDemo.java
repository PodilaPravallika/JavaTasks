package tasks.wrapperclasses;

//Generic class definition
class Box<T> {
 private T value;

 // Method to store a value
 public void setValue(T value) {
     this.value = value;
 }

 // Method to retrieve the value
 public T getValue() {
     return value;
 }
}

public class GenericBoxDemo {
 public static void main(String[] args) {
     // Instantiate Box for Integer
     Box<Integer> intBox = new Box<>();
     intBox.setValue(100);  // Autoboxing of int to Integer
     Integer intValue = intBox.getValue();
     System.out.println("Integer value from Box: " + intValue);

     // Instantiate Box for Double
     Box<Double> doubleBox = new Box<>();
     doubleBox.setValue(55.75);  // Autoboxing of double to Double
     Double doubleValue = doubleBox.getValue();
     System.out.println("Double value from Box: " + doubleValue);
 }
}

