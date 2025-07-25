package tasks.exceptionhandling;
import java.lang.Math;

abstract class Shape1 {

 abstract void area();

 void displayShapeType() {
     System.out.println("This is a shape.");
 }
}

class Circle1 extends Shape1 {
 double radius;

 Circle1(double radius) {
     this.radius = radius;
 }

 void area() {
     double result = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + result);
 }

 void displayShapeType() {
     System.out.println("Shape Type: Circle");
 }
}

class Rectangle1 extends Shape1 {
 double length, width;

 Rectangle1(double length, double width) {
     this.length = length;
     this.width = width;
 }

 void area() {
     double result = length * width;
     System.out.println("Area of Rectangle: " + result);
 }

 void displayShapeType() {
     System.out.println("Shape Type: Rectangle");
 }
}

public class ShapeDisplay {
 public static void main(String[] args) {

     Shape1 circle = new Circle1(5.0);
     Shape1 rectangle = new Rectangle1(4.0, 6.0);

     circle.displayShapeType();
     circle.area();

     System.out.println();

     rectangle.displayShapeType();
     rectangle.area();
 }
}

