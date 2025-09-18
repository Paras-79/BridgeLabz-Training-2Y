import java.util.Scanner;

public class MonthCalendarLv3 {
    // Array for month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to find day of week for 1st date of given month and year (0=Sun, 1=Mon, ...)
    public static int firstDayOfMonth(int year, int month) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int q = 1;
        int k = year % 100;
        int j = year / 100;
        // Zeller's Congruence
        int h = (q + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        // Zeller: 0=Sat, 1=Sun, 2=Mon... Convert to 0=Sun
        return (h + 6) % 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int days = daysInMonth[month];
        if (month == 2 && isLeapYear(year)) days++;

        int startDay = firstDayOfMonth(year, month);

        // Print calendar header
        System.out.printf("%s %d\n", months[month], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces
        for (int i = 0; i < startDay; i++) System.out.print("    ");

        // Print dates
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();

        scanner.close();
    }
}
