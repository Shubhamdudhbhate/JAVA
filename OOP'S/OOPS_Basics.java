// Class Definition
class Student {
    // Data Members (Properties)
    int roll;
    String name;

    // Method to set values
    void setDetails(int r, String n) {
        roll = r;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

// Main Class
public class OOPS_Basics {
    public static void main(String[] args) {
        // Object Creation
        Student s1 = new Student();  // s1 is object of class Student

        s1.setDetails(101, "Shubham");  // calling method
        s1.display();  // displaying values
    }
}
