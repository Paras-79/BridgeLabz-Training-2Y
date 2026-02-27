import java.util.Scanner;

public class SumNForCompare {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number (>=1): ");
            long n = scanner.nextLong();

            if (n >= 1) {
                long formulaSum = n * (n + 1) / 2;

                long forSum = 0;
                for (long i = 1; i <= n; i++) {
                    forSum += i;
                }

                System.out.println("Sum using formula = " + formulaSum);
                System.out.println("Sum using for loop = " + forSum);
                System.out.println("Both results are equal? " + (formulaSum == forSum));
            } else {
                System.out.println("The number " + n + " is not a natural number");
            }
        }
    }
}
