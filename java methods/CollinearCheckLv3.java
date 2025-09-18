import java.util.Scanner;

public class CollinearCheckLv3 {
    // Check collinearity using slopes
    public static boolean areCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        // Points are collinear if all slopes are equal (with some precision tolerance)
        double epsilon = 1e-9;
        return Math.abs(slopeAB - slopeBC) < epsilon && Math.abs(slopeAB - slopeAC) < epsilon;
    }

    // Check collinearity using area of triangle formula
    public static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sample input: A(2,4), B(4,6), C(6,8)
        System.out.print("Enter x1 y1 for point A: ");
        double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
        System.out.print("Enter x2 y2 for point B: ");
        double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();
        System.out.print("Enter x3 y3 for point C: ");
        double x3 = scanner.nextDouble(), y3 = scanner.nextDouble();

        boolean slopeCollinear = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by slope formula? " + slopeCollinear);
        System.out.println("Collinear by area formula? " + areaCollinear);

        scanner.close();
    }
}
