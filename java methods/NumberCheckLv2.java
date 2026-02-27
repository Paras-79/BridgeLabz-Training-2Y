import java.util.Scanner;

public class NumberCheckLv2 {
    public static boolean isPositive(int n) { return n > 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    // Compare returns 1 if a>b, 0 if a==b, -1 if a<b
    public static int compare(int a, int b) {
        return (a > b) ? 1 : ((a < b) ? -1 : 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int n : numbers) {
            if (isPositive(n)) {
                String evenOdd = isEven(n) ? "even" : "odd";
                System.out.println(n + " is positive and " + evenOdd);
            } else {
                System.out.println(n + " is negative");
            }
        }
        int cmp = compare(numbers[0], numbers[4]);
        if (cmp == 0)
            System.out.println("First and last elements are equal");
        else if (cmp > 0)
            System.out.println("First element is greater than last");
        else
            System.out.println("First element is less than last");
        scanner.close();
    }
}

