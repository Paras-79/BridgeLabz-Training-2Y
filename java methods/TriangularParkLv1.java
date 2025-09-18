import java.util.Scanner;

public class TriangularParkLv1 {
    public static double computeRounds(double a, double b, double c, double totalDistance) {
        double perimeter = a + b + c;
        return totalDistance / perimeter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side A (meters): ");
        double a = scanner.nextDouble();
        System.out.print("Enter side B (meters): ");
        double b = scanner.nextDouble();
        System.out.print("Enter side C (meters): ");
        double c = scanner.nextDouble();
        double rounds = computeRounds(a, b, c, 5000);
        System.out.printf("Rounds needed to complete 5km: %.2f\n", rounds);
        scanner.close();
    }
}

