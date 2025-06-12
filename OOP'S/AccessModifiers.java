// Base class
class Person {
    public String name = "Shubham";          // Public: accessible everywhere
    private int age = 22;                    // Private: only within this class
    protected String address = "Mumbai";     // Protected: accessible in same package and subclasses

    public void showDetails() {
        System.out.println("Name (public): " + name);
        System.out.println("Age (private): " + age);     // OK: inside same class  then only possiblre
        System.out.println("Address (protected): " + address);
    }
}

// Derived class in same package
class Student extends Person {
    public void displayStudentInfo() {
        System.out.println("Name (inherited public): " + name);        // OK
        // System.out.println("Age: " + age);                          // ❌ Error: private not accessible
        System.out.println("Address (inherited protected): " + address); // OK
    }
}

// Main class
public class AccessModifiers {
    public static void main(String[] args) {
        Person p = new Person();
        p.showDetails();

        Student s = new Student();
        s.displayStudentInfo();

        System.out.println("Access from main:");
        System.out.println("Public name: " + p.name);        // OK
        // System.out.println("Private age: " + p.age);      // ❌ Error
        // System.out.println("Protected address: " + p.address); // ❌ Error: Not inherited here directly
    }
}
