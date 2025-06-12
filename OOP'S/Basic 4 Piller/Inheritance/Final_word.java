// Prevent class inheritance

// Prevent method overriding

// Create constant variable

final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// class Car extends Vehicle {} ❌ Error: Cannot inherit final class

class Bike {
    final void run() {
        System.out.println("Bike is running");
    }
}

// class SportBike extends Bike {
//     void run() {} ❌ Error: Cannot override final method
// }

public class Final_word {
    public static void main(String[] args) {
        final int speed = 90;
        // speed = 100; ❌ Error: Cannot change final variable
        System.out.println("Speed is " + speed);
    }
}
