package tasks.exceptionhandling;

interface Printable {
 void print(); 
}

interface Scannable {
 void scan();
}


public class MultiFunctionPrinter implements Printable, Scannable {

 @Override
 public void print() {
     System.out.println("Printing document... Done!");
 }

 @Override
 public void scan() {
     System.out.println("Scanning document... Done!");
 }

 public static void main(String[] args) {
     MultiFunctionPrinter mfp = new MultiFunctionPrinter();

     mfp.print();
     mfp.scan();
 }
}

