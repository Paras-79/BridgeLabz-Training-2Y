
public class NumberCheckerLv3Part2 {

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

    public static int sumDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumSquaresDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        int sum = sumDigits(number);
        return (number % sum == 0);
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigits(number);
        int[] freqArr = new int[10];

        for (int d : digits) freqArr[d]++;
        
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = freqArr[i];
        }
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sumDigits(number));
        System.out.println("Sum of squares of digits: " + sumSquaresDigits(number));
        System.out.println("Is Harshad number: " + isHarshad(number));

        System.out.println("Digit frequencies:");
        int[][] freq = digitFrequency(number);
        for (int[] pair : freq) {
            if (pair[1] > 0) {
                System.out.println("Digit " + pair[0] + " occurs " + pair[1] + " times");
            }
        }
    }
}
