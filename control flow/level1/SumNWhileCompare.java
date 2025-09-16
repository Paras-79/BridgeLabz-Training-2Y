import java.util.Scanner;

public class SumNWhileCompare {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a natural number (>=1): ");
            long n = scanner.nextLong();

            if (n >= 1) {
                long formulaSum = n * (n + 1) / 2;

                long i = 1;
                long whileSum = 0;
                while (i <= n) {
                    whileSum += i;
                    i++;
                }

                System.out.println("Sum using formula = " + formulaSum);
                System.out.println("Sum using while loop = " + whileSum);
                System.out.println("Both results are equal? " + (formulaSum == whileSum));
            } else {
                System.out.println("The number " + n + " is not a natural number");
            }
        }
    }
}
