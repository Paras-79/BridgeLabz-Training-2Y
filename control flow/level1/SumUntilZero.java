import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        double total = 0.0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number (0 to stop): ");
            double value = scanner.nextDouble();

            while (value != 0.0) {
                total += value;
                System.out.print("Enter a number (0 to stop): ");
                value = scanner.nextDouble();
            }

            System.out.println("Total = " + total);
        }
    }
}
