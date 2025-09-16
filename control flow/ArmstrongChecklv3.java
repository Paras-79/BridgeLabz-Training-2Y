import java.util.Scanner;

public class ArmstrongChecklv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // keep a copy of input
        int sum = 0;

        // While loop to extract digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // get last digit
            sum += digit * digit * digit;   // cube and add
            originalNumber = originalNumber / 10; // remove last digit
        }

        // check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}
