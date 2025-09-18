
public class EmployeeBonusLv3 {
    // Method to generate random salary (5-digit) and years of service
    public static int[][] generateSalaryAndYears(int n) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + (int)(Math.random() * 90000);  // salary
            arr[i][1] = 1 + (int)(Math.random() * 20);         // years of service (1-20)
        }
        return arr;
    }
    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] salaryAndYears) {
        double[][] arr = new double[salaryAndYears.length][2];
        for (int i = 0; i < salaryAndYears.length; i++) {
            double bonus = (salaryAndYears[i][1] > 5) ?
                    salaryAndYears[i][0] * 0.05 : salaryAndYears[i][0] * 0.02;
            arr[i][0] = bonus;
            arr[i][1] = salaryAndYears[i][0] + bonus;
        }
        return arr;
    }
    public static void displayTabular(int[][] salaryAndYears, double[][] bonusAndNewSalary) {
        double totalBonus = 0, totalOld = 0, totalNew = 0;
        System.out.println("Emp#\tSalary\tYears\tBonus\t\tNewSalary");
        for (int i = 0; i < salaryAndYears.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.2f\t\t%.2f\n",
                    (i+1), salaryAndYears[i][0], salaryAndYears[i][1], bonusAndNewSalary[i][0], bonusAndNewSalary[i][1]);
            totalBonus += bonusAndNewSalary[i][0];
            totalOld += salaryAndYears[i][0];
            totalNew += bonusAndNewSalary[i][1];
        }
        System.out.printf("TOTALS\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOld, totalBonus, totalNew);
    }
    public static void main(String[] args) {
        int[][] salaryAndYears = generateSalaryAndYears(10);
        double[][] bonusAndNewSalary = calculateBonusAndNewSalary(salaryAndYears);
        displayTabular(salaryAndYears, bonusAndNewSalary);
    }
}

