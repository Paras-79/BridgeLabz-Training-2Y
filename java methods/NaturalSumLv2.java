import java.util.Scanner;

public class NaturalSumLv2 {
    public static int sumRec(int n) {
        if (n <= 0) return 0;
        return n + sumRec(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (natural number): ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number.");
        } else {
            int sRec = sumRec(n);
            int sFor = sumFormula(n);
            System.out.println("Recursive sum: " + sRec);
            System.out.println("Formula sum:   " + sFor);
            System.out.println("Results match: " + (sRec == sFor));
        }
        scanner.close();
    }
}

