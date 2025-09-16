import java.util.Scanner;

public class StudentGradelv22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        double[][] marks = new double[n][3]; // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentages = new double[n];
        char[] grades = new char[n];
        String[] remarks = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));

            marks[i][0] = scanner.nextDouble();  // Physics
            marks[i][1] = scanner.nextDouble();  // Chemistry
            marks[i][2] = scanner.nextDouble();  // Maths

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Determine grade and remarks
            double p = percentages[i];
            if (p >= 80) {
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (p >= 70) {
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (p >= 60) {
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (p >= 50) {
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (p >= 40) {
                grades[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }

        // Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t\t%c\t%s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i], remarks[i]);
        }

        scanner.close();
    }
}
