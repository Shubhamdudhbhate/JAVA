abstract class Shape {
    abstract void draw();

    void message() {
        System.out.println("Shape class method");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphism  if we don't use abstract thenn it will go to parent class
        // Shape s = new Shape(); ❌ Error: Cannot instantiate the type Shape
        s.draw();
        s.message();
    }
}
