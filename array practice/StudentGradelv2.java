import java.util.Scanner;

public class StudentGradelv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter Physics marks: ");
        double phy = scanner.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chem = scanner.nextDouble();
        System.out.print("Enter Maths marks: ");
        double math = scanner.nextDouble();

        // Compute percentage
        double percentage = (phy + chem + math) / 3;

        // Determine grade
        String grade;
        String remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display results
        System.out.printf("Physics: %.2f\nChemistry: %.2f\nMaths: %.2f\n", phy, chem, math);
        System.out.printf("Percentage: %.2f\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
