import java.math.BigInteger;
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer to compute factorial: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                BigInteger factorial = BigInteger.ONE;
                for (int i = 1; i <= n; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println(n + "! = " + factorial.toString());
            }
        }
    }
}
