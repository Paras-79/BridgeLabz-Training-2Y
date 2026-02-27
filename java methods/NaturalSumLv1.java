import java.util.Scanner;

public class NaturalSumLv1 {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Sum: " + sumNaturalNumbers(n));
        scanner.close();
    }
}

