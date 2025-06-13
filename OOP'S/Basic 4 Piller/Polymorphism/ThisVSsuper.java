// Parent Class
class Person {
    String name = "Default Person";

    void display() {
        System.out.println("Person's display()");
    }

    Person() {
        System.out.println("Person Constructor Called");
    }
}

// Child Class
class Student extends Person {
    String name = "Student Name";

    Student() {
        super(); // calls Person() constructor
        System.out.println("Student Constructor Called");
    }

    void displayNames() {
        System.out.println("Using this.name: " + this.name);   // refers to Student's name
        System.out.println("Using super.name: " + super.name); // refers to Person's name
    }

    void show() {
        super.display(); // calls Person's display()
        System.out.println("Student's show()");
    }
}

// Main Class
public class ThisVSsuper {
    public static void main(String[] args) {
        Student s = new Student();   // constructor call
        s.displayNames();           // using this and super
        s.show();                   // calling overridden method
    }
}
