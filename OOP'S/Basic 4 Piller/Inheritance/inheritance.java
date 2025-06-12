class Animal {
    String color = "Brown";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
        super.sound(); // Calls parent method
    }

    void printColor() {
        System.out.println("Child color: " + color);
        System.out.println("Parent color: " + super.color); // Access parent variable
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();            // Constructor chain
        d.sound();                    // Calls child and parent method
        d.printColor();              // Accesses both variables
    }
}
