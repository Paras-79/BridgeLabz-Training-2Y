import java.util.Scanner;

public class TeamBMILv2 {
    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] teamData) {
        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double heightCm = teamData[i][1];
            double heightM = heightCm / 100.0;
            teamData[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to determine BMI status for all team members
    public static String[] getBMIStatus(double[][] teamData) {
        String[] status = new String[teamData.length];
        for (int i = 0; i < teamData.length; i++) {
            double bmi = teamData[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // [weight, height(cm), BMI]

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }

        calculateBMI(teamData);
        String[] bmiStatus = getBMIStatus(teamData);

        System.out.println("\nPerson\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }

        scanner.close();
    }
}

