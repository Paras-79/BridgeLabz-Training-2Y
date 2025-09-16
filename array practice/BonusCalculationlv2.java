import java.util.Scanner;

public class BonusCalculationlv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            double s = scanner.nextDouble();
            double y = scanner.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Enter positive salary and non-negative years.");
                i--; // repeat this iteration
                continue;
            }
            salary[i] = s;
            yearsOfService[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) bonus[i] = salary[i] * 0.05;
            else bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.printf("Total bonus payout: %.2f\n", totalBonus);
        System.out.printf("Total old salary: %.2f\n", totalOldSalary);
        System.out.printf("Total new salary: %.2f\n", totalNewSalary);
        scanner.close();
    }
}
