import java.util.Scanner;

public class PrimeChecklv3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;  // assume number is prime

        if (num <= 1) {
            isPrime = false; // prime numbers are greater than 1
        } else {
            // check divisibility from 2 to num-1
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // divisible → not prime
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }
}
