import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0)
                    System.out.println(number + " is positive and even.");
                else 
                    System.out.println(number + " is positive and odd.");
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println("It is zero.");
            }
        }

        System.out.print("First element is " + numbers[0] + ", last element is " + numbers[4] + ". They are ");
        if (numbers[0] == numbers[4]) System.out.println("equal.");
        else if (numbers[0] > numbers[4]) System.out.println("greater.");
        else System.out.println("less.");
        
        scanner.close();
    }
}
