
import java.util.*;

public class ArrayListMethods1D{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at index
        list.add(1, 15);  // [10, 15, 20, 30]

        // Replace
        list.set(2, 25);  // [10, 15, 25, 30]

        // Remove
        list.remove(3);   // [10, 15, 25]

        // Check
        System.out.println("Contains 15? " + list.contains(15));  // true

        // Size
        System.out.println("Size: " + list.size());

        // Print
        System.out.println("List: " + list);

        // Clear
        list.clear();

        System.out.println("After clear: " + list);

//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Grapes"));

// For loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }

// For-each loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

// Lambda
        fruits.forEach(fruit -> System.out.println("Using lambda: " + fruit));

//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        ArrayList<Integer> nums = new ArrayList<>(List.of(5, 3, 8, 1));

        // Ascending sort
        Collections.sort(nums);

        // Descending sort
        Collections.sort(nums, Collections.reverseOrder());

        System.out.println(nums);

//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[n]; // Declare array

        System.out.println("Enter " + n + " elements:");

        // Input loop
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }

        // Output loop
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        System.out.print("Enter size of Your Name-List: ");

        int m = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[m]; // Declare arra

        System.out.println("Enter " + m + " name:");

        // Input loop
        for (int i = 0; i < m; i++) {
            array[i] = scanner.nextLine();

        }

        // Output loop
        System.out.println("Array elements are:");
        for (int i = 0; i < m; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names do you want to add? ");
        int p = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        String name;
        // Add names to list
        for (int i = 0; i < p; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            name = scanner.nextLine();
            names.add(name);
        }

        // Show list
        System.out.println("\nYour name list:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }

        // Update a name
        System.out.print("\nEnter index to update name: ");

        int updateIndex = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        names.set(updateIndex, newName);

        // Remove a name
        System.out.print("\nEnter index to remove name: ");

        int removeIndex = scanner.nextInt();
        scanner.nextLine();

        names.remove(removeIndex);

        // Final list
        System.out.println("\nUpdated name list:");
        for (String s : names) {
            System.out.println(s);
        }


//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
   

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter how many numbers you want to add: ");

        int q = scanner.nextInt();
        scanner.nextLine(); 

        // Input elements
        System.out.println("Enter " + q + " numbers:");
        for (int i = 0; i < q ; i++) {
            numbers.add(scanner.nextInt());
        }

        // Original list
        System.out.println("\nOriginal List: " + numbers);

        // Sort
        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);

        // Reverse
        Collections.reverse(numbers);
        System.out.println("Reversed List (Descending): " + numbers);

        // Search
        System.out.print("Enter a number to search: ");


        int key = scanner.nextInt();
        scanner.nextLine(); 


        if (numbers.contains(key)) {
            System.out.println("✅ " + key + " is in the list at index " + numbers.indexOf(key));
        } else {
            System.out.println("❌ " + key + " is NOT in the list.");
        }


//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//___________________ _________________________________________________________________________________________________________________________________________________________________________________________________________________
                                    

        // 2D Array Input and Output Example

        
        // Take matrix size input
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare 2D array
        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nMatrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }



//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
//____________________________________________________________________________________________________________________________________________________________________________________________________________________________________
                    
   

        scanner.close();

    }

}

