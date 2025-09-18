import java.util.Scanner;

public class NumberSignLv1 {
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = checkNumber(num);
        if (result > 0) System.out.println("Positive number");
        else if (result < 0) System.out.println("Negative number");
        else System.out.println("Zero");
        scanner.close();
    }
}

