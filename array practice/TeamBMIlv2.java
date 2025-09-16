import java.util.Scanner;

public class TeamBMIlv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        double[] height = new double[n];   // in meters
        double[] weight = new double[n];   // in kg
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();

            System.out.print("Enter height (meters) for person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
        }

        // Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display details
        System.out.println("\nPerson\tHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }

        scanner.close();
    }
}
