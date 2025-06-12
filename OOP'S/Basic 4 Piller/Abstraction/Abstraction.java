// Interface A
interface A {
    void show();  // abstract method
}

// Interface B
interface B {
    void display();  // abstract method
}

// Class implementing multiple interfaces
class Demo implements A, B {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}

// Abstract class
abstract class Abstraction {
    abstract void hello();  // abstract method
}

// Class extending abstract class
class OnlyOne extends Abstraction {
    public void hello() {
        System.out.println("Hello from Single abstract");
    }
}

   // Main class
public class Abstract {
    public static void main(String[] args) {

        // Interface example
        Demo d = new Demo();
        d.show();         // Output: Show from A
        d.display();      // Output: Display from B

        // Abstract class example
        OnlyOne o = new OnlyOne();
        o.hello();        // Output: Hello from Single abstract
    }
}
