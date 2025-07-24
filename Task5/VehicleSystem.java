package tasks.oops;

// Base class
class Vehicle {
    String brand = "Benz";
    int speed = 80;

    void showDetails() {
        System.out.println("Vehicle brand : " + brand);
        System.out.println("Speed of the vehicle : " + speed);
    }
}

// Derived class: Car
class Car extends Vehicle {
    @Override
    void showDetails() {
        System.out.println("Brand of the car : " + brand);
        System.out.println("Speed of the car : " + speed);
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    @Override
    void showDetails() {
        System.out.println("Brand of the bike : " + brand);
        System.out.println("Speed of the bike : " + speed);
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        // Create and display Bike details
        Bike bike = new Bike();
        bike.showDetails();

        // Create and display Car details
        Car car = new Car();
        car.showDetails();
    }
}
