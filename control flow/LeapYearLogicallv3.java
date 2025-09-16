import java.util.Scanner;

public class LeapYearLogicallv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("The program works only for year >= 1582 (Gregorian calendar).");
        } else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }

        sc.close();
    }
}
