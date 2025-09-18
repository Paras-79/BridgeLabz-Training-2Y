import java.util.*;

public class StudentScoresLv3 {
    public static int[][] getRandomScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); // random 2-digit score
            }
        }
        return scores;
    }
    public static double[][] getTotalAvgPerc(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100) / 100.0;
            double perc = Math.round((total / 300.0 * 100) * 100) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = perc;
        }
        return result;
    }
    public static void displayTabular(int[][] scores, double[][] result) {
        System.out.println("Stud#\tPhysics\tChemistry\tMaths\tTotal\tAvg\tPerc");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n",
                    i+1, scores[i][0], scores[i][1], scores[i][2], result[i][0], result[i][1], result[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int[][] scores = getRandomScores(n);
        double[][] result = getTotalAvgPerc(scores);
        displayTabular(scores, result);
        scanner.close();
    }
}
