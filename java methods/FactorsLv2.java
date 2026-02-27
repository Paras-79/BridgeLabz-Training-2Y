import java.util.Scanner;

public class FactorsLv2 {
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to find count
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        // Second loop to fill array
        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;
        return factors;
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
    public static int product(int[] numbers) {
        int prod = 1;
        for (int n : numbers) prod *= n;
        return prod;
    }
    public static int sumOfSquares(int[] numbers) {
        int sum = 0;
        for (int n : numbers) sum += Math.pow(n, 2);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int n : factors) System.out.print(n + " ");
        System.out.println();
        System.out.println("Sum of factors: " + sum(factors));
        System.out.println("Product of factors: " + product(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        scanner.close();
    }
}
