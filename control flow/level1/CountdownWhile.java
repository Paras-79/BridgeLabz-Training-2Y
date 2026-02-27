import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter starting number (>=1) for countdown: ");
            int counter = scanner.nextInt();

            if (counter < 1) {
                System.out.println("Please enter a number greater than or equal to 1.");
            } else {
                while (counter >= 1) {
                    System.out.println(counter);
                    counter--;
                }
            }
        }
    }
}
