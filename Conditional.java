
import java.util.*;

public class Conditional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();
        scanner.nextLine();                   // compalsery if you use only one object of Scanner class

        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        // FOR LOOP - Print 1 to 5
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // WHILE LOOP - Print 1 to 5
        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // DO-WHILE LOOP - Print 1 to 5
        System.out.println("\nDO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // FOR-EACH LOOP - Print elements of an array
        System.out.println("\nFOR-EACH LOOP:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number = " + num);
        }


//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        
        System.out.println("Enter a any  number in  (1 to 3): ");
        // Scanner sc = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();                        // compalsery if you use only one object of Scanner class


        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");
                break;
            case 2:
                System.out.println("You selected Option 2");
                break;
            case 3:
                System.out.println("You selected Option 3");
                break;
            default:
                System.out.println("Invalid choice");
        }





//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("Weekend is coming");
                break;
            default:
                System.out.println("Regular day");

        }


        scanner.close();          // Close the scanner to avoid resource leaks at last
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
 

        
    }
}
        // Using switch expression (Java 12+)}
