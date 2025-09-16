import java.util.Scanner;

public class FriendsAgeHeightlv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int ageA = sc.nextInt();
        int heightA = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int ageB = sc.nextInt();
        int heightB = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int ageC = sc.nextInt();
        int heightC = sc.nextInt();

        // Youngest
        if (ageA < ageB && ageA < ageC)
            System.out.println("Amar is youngest");
        else if (ageB < ageC)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        // Tallest
        if (heightA > heightB && heightA > heightC)
            System.out.println("Amar is tallest");
        else if (heightB > heightC)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");

        sc.close();
    }
}
