import java.util.Arrays;

public class NumberCheckerLv3Part3 {

    public static int countDigits(int number) {
        int count = 0, n = Math.abs(number);
        if (n == 0) return 1;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];
        int n = Math.abs(number);
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigitsArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuck(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;

        System.out.println("Number: " + number);
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuck(number));
    }
}
