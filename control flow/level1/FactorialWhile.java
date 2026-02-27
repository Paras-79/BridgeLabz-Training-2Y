import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a non-negative integer to compute factorial: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                BigInteger factorial = BigInteger.ONE;
                int i = n;
                while (i > 1) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                    i--;
                }
                System.out.println(n + "! = " + factorial.toString());
            }
        }
    }
}
