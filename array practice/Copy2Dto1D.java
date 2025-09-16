import java.util.Scanner;

public class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array elements:");
        for (int val : array) System.out.print(val + " ");
        System.out.println();
        scanner.close();
    }
}

