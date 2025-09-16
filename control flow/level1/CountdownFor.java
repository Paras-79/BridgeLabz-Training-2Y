import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter starting number (>=1) for countdown: ");
            int start = scanner.nextInt();

            if (start < 1) {
                System.out.println("Please enter a number greater than or equal to 1.");
            } else {
                for (int i = start; i >= 1; i--) {
                    System.out.println(i);
                }
            }
        }
    }
}
