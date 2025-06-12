
class Student {

    int roll;
    String name;
    float GPA;

    // Default Constructor
    Student() {
        System.out.println("Default constructor called!");
        roll = 0;
        name = "Unknown";
        GPA = 0.0f;

    }

    Student(int roll, String name) {
        this.roll = roll;       // 'this.roll' refers to instance variable
        this.name = name;       // 'name' on right is the parameter
    }

    // Parameterized Constructor
    Student(int r, String n, float gpa) {
        System.out.println("Parameterized constructor called!");
        roll = r;
        name = n;
        GPA = gpa;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
        System.out.println("******************");

    }

    // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adds two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Method 4: Concatenates two strings
    String add(String a, String b) {
        return a + b;
    }

}

public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student();  // Default constructor
        s1.display();

        System.out.println();

        Student s2 = new Student(102, "Shubham");  // Parameterized constructor
        s2.display();

        System.out.println();

        Student s3 = new Student(103, "Shubham", 8.64f);  // Parameterized constructor
        s3.display();


        Student calc = new Student();

        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(3.5, 2.7));
        System.out.println("Sum of 2 strings: " + calc.add("Hello, ", "World!"));




    }
}
