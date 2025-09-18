import java.util.Random;
import java.util.Scanner;

public class MatrixOperationsLv3 {
    // Create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10); // Values 0-9
        return mat;
    }

    // Add two matrices
    public static int[][] addMatrix(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    // Subtract two matrices
    public static int[][] subtractMatrix(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, n = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < n; k++)
                    result[i][j] += a[i][k] * b[k][j];
            }
        return result;
    }

    // Print matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.printf("%4d", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Matrix dimensions
        System.out.print("Enter rows and cols of matrix A: ");
        int rowsA = sc.nextInt(), colsA = sc.nextInt();
        System.out.print("Enter rows and cols of matrix B: ");
        int rowsB = sc.nextInt(), colsB = sc.nextInt();
        // Matrix creation
        int[][] A = createRandomMatrix(rowsA, colsA);
        int[][] B = createRandomMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);

        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nA + B:");
            printMatrix(addMatrix(A, B));
            System.out.println("\nA - B:");
            printMatrix(subtractMatrix(A, B));
        } else {
            System.out.println("\nAdd/Subtract: Not possible (size mismatch)\n");
        }

        if (colsA == rowsB) {
            System.out.println("\nA * B:");
            printMatrix(multiplyMatrix(A, B));
        } else {
            System.out.println("\nMultiply: Not possible (A cols != B rows)\n");
        }

        sc.close();
    }
}

