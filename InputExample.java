import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.print("Hello, World! \nI am Shubham\n");

        int a, b;
        String p;
        int q;

        // Use only one Scanner and try-with-resources
        try (Scanner input = new Scanner(System.in)) {

            // Input two integers
            System.out.println("Enter two integers:");
            a = input.nextInt();  
            b = input.nextInt();
            System.out.println("You entered: " + a + " and " + b);

            // Clear leftover newline
            input.nextLine();

            // Input name and age
            System.out.println("Enter Your Age:");
            q = input.nextInt();

            input.nextLine(); // clear newline

            System.out.println("Enter Your Name:");
            p = input.nextLine();

            System.out.println("Your Name is " + p + " and Your Age is " + q);

            System.out.println("Enter Your Country- Name:");
            String Country = input.nextLine(); // Read name     only defined in this scope
            System.out.println("Enter Your Roll_No:");
            int Roll_No = input.nextInt(); // Read age          only defined in this scope  inside try
        
            System.out.println("Country: " + Country+ "Roll No: " + Roll_No);

            input.close(); 

        }

            System.out.println("Your Name is " + p + " and Your Age is " + q);  
//          System.out.println("Name: " + Country+ "Age: " + Roll_No);           // this create an Error because Country and Roll_No are not defined in this scope


//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________

        int age = 20;
        double height = 5.9;
        char grade = 'A';
        boolean passed = true;
        String name = "Shubham";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);




//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false


//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________



        // Arithmetic operations
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        System.out.println("Product of " + a + " and " + b + " is: " + (a * b));
        System.out.println("Difference of " + a + " and " + b + " is: " + (a - b));
        System.out.println("Division of " + a + " by " + b + " is: " + (a / b));
        System.out.println("Modulus of " + a + " and " + b + " is: " + (a % b));

        // Increment and Decrement
        System.out.println("Increment of a is: " + (++a));
        System.out.println("Decrement of b is: " + (--b));

        // Bitwise operations
        System.out.println("Bitwise AND of a and b is: " + (a & b));
        System.out.println("Bitwise OR of a and b is: " + (a | b));
        System.out.println("Bitwise XOR of a and b is: " + (a ^ b));
        System.out.println("Left shift of a by 2: " + (a << 2));
        System.out.println("Right shift of b by 2: " + (b >> 2));

        // Logical operations
        System.out.println("Logical AND (a > 5 && b < 30): " + (a > 5 && b < 30));
        System.out.println("Logical OR (a < 15 || b > 25): " + (a < 15 || b > 25));

        // Ternary operator
        System.out.println("Ternary operation result: " + (a > b ? "a is greater" : "b is greater"));

        // String operations
        System.out.println("String concatenation: " + "Hello" + " " + "World");
        System.out.println("String length: " + "Hello".length());
        System.out.println("Character at index 1: " + "Hello".charAt(1));
        System.out.println("Substring from index 1: " + "Hello".substring(1));
        System.out.println("Uppercase: " + "Hello".toUpperCase());
        System.out.println("Lowercase: " + "Hello".toLowerCase());
        System.out.println("Trimmed string: " + "  Hello World  ".trim());
        System.out.println("Replaced string: " + "Hello World".replace("World", "Java"));
        System.out.println("Split string: " + String.join(", ", "Hello World".split(" ")));
        System.out.println("Formatted string: " + String.format("Sum of %d and %d is %d", a, b, sum));

        // Math functions
        System.out.println("Random number: " + Math.random());
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Power of 2^3: " + Math.pow(2, 3));



//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________

    }
}
