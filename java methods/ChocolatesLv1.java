import java.util.Scanner;

public class ChocolatesLv1 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[] {number % divisor, number / divisor};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int choco = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int kids = scanner.nextInt();

        int[] result = findRemainderAndQuotient(choco, kids);
        System.out.println("Each child gets: " + result[1] + " chocolates");
        System.out.println("Remaining chocolates: " + result[0]);
        scanner.close();
    }
}

