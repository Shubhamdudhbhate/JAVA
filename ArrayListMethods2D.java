import java.util.*;

public class ArrayListMethods2D{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take matrix size input
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare matrices
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] transpose = new int[cols][rows];  // Note: flipped size

        // Input for matrix A
        System.out.println("\nEnter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Input for matrix B
        System.out.println("\nEnter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Calculate Sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Calculate Transpose of A
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = A[i][j];
            }
        }

        // Output Matrix Sum
        System.out.println("\nSum of Matrix A + B:");
        for (int[] row : sum) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println("");         // it print  whatever in bracket and then go to next line 
        }

        // Output Transpose of A
        System.out.println("\nTranspose of Matrix A:");
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println("");   // it print  whatever in bracket and then go to next line 
        }

        scanner.close();
    }
}
