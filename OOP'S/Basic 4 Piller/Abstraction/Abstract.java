// Abstract class
abstract class Animal {    // it can't be instantiated that is, you cannot create an object of Animal
// but it can be subclassed
    int eyes = 2;

    // Abstract method (must be implemented by subclass)
    abstract void walk();  //it is public and abstract by default
    // Abstract method (can be overridden by subclass) that is o

    // Non-abstract method
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Subclass that extends abstract class
class Horse extends Animal {
    @Override
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Horse horse = new Horse(); // Creating object of Horse
        horse.walk();              // Calls overridden walk() method
        horse.eat();               // Calls non-abstract method from Animal class
    }
}
