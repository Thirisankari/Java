import java.io.*;
import java.util.*;

class Vehicle {
    void start() {
        System.out.println("The vehicle is starting");
    }

    void stop() {
        System.out.println("The vehicle is stopping");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("The car is driving");
    }

    void honk() {
        System.out.println("The car is honking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Calling a method from the parent class
        car.drive(); // Calling a method from the child class
        car.honk(); // Calling a method from the child class
        car.stop(); // Calling a method from the parent class
    }
}