import java.util.Scanner;

public class WindChillLv1 {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double temp = scanner.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double windSpeed = scanner.nextDouble();
        System.out.printf("Wind Chill Temperature: %.2f\n", calculateWindChill(temp, windSpeed));
        scanner.close();
    }
}
