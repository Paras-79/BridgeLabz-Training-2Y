import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter day (1-31): ");
            int day = scanner.nextInt();

            boolean validDate = (month >= 1 && month <= 12 && day >= 1 && day <= 31);
            boolean isSpring = false;
            if (validDate) {
                // Spring: March 20 to June 20 inclusive
                if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
                    isSpring = true;
                }
            }

            if (!validDate) {
                System.out.println("Invalid date entered.");
            } else if (isSpring) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
    }
}
