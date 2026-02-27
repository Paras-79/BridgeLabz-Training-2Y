import java.util.Random;
import java.util.Scanner;

public class MatrixOpsLv3 {

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] a = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = rand.nextInt(10); // Values 0-9
        return a;
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double v : row) System.out.printf("%7.2f", v);
            System.out.println();
        }
    }

    public static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] t = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                t[j][i] = mat[i][j];
        return t;
    }

    public static double determinant2x2(double[][] mat) {
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] mat) {
        double det = determinant2x2(mat);
        if (Math.abs(det) < 1e-9) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (Math.abs(det) < 1e-9) return null;

        double[][] inv = new double[3][3];
        // Calculate minors, cofactors, adjugate then divide by determinant
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;
        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;
        // Transpose to get adjugate
        return transpose(inv);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int n = sc.nextInt();
        double[][] mat = createRandomMatrix(n, n);

        System.out.println("Matrix:");
        displayMatrix(mat);
        System.out.println("\nTranspose:");
        displayMatrix(transpose(mat));

        if (n == 2) {
            double det = determinant2x2(mat);
            System.out.println("\nDeterminant (2x2): " + det);
            double[][] inv = inverse2x2(mat);
            if (inv != null) {
                System.out.println("\nInverse:");
                displayMatrix(inv);
            } else {
                System.out.println("\nInverse: Not possible (Determinant 0)");
            }
        }

        if (n == 3) {
            double det = determinant3x3(mat);
            System.out.println("\nDeterminant (3x3): " + det);
            double[][] inv = inverse3x3(mat);
            if (inv != null) {
                System.out.println("\nInverse:");
                displayMatrix(inv);
            } else {
                System.out.println("\nInverse: Not possible (Determinant 0)");
            }
        }
        sc.close();
    }
}
