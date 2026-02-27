import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            int years = scanner.nextInt();

            if (years > 5) {
                double bonus = salary * 0.05;
                System.out.println("Bonus amount is " + bonus);
            } else {
                System.out.println("No bonus. Years of service: " + years);
            }
        }
    }
}
