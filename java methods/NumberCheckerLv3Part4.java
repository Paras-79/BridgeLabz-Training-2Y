public class NumberCheckerLv3Part4 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = sumDigits(square);
        return sum == number;
    }

    public static int sumDigits(int number) {
        int sum = 0, n = Math.abs(number);
        if (n == 0) return 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1, n = Math.abs(number);
        if (n == 0) return false; // edge case
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(numStr);
    }

    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy: " + isSpy(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzz(number));
    }
}

