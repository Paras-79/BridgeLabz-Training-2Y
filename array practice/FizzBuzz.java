import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number should be positive!");
            return;
        }

        String[] results = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) results[i - 1] = "FizzBuzz";
            else if (i % 3 == 0) results[i - 1] = "Fizz";
            else if (i % 5 == 0) results[i - 1] = "Buzz";
            else results[i - 1] = Integer.toString(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
        scanner.close();
    }
}
