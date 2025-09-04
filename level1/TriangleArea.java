import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base: ");
            double base = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();

            double areaInches = 0.5 * base * height;
            double areaCm = areaInches * 6.4516; // 1 sq inch = 6.4516 sq cm

            System.out.println("The area of triangle is " + areaInches + " sq inches and " + areaCm + " sq cm");
        }
    }
}
