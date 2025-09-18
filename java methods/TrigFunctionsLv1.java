import java.util.Scanner;

public class TrigFunctionsLv1 {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] {sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f\nCosine: %.4f\nTangent: %.4f\n", result[0], result[1], result[2]);
        scanner.close();
    }
}

