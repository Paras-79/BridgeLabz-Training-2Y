public class NumberCheckerLv3 {
    public static int countDigits(int number) {
        int count = 0, n = Math.abs(number);
        if (n == 0) return 1;
        while (n > 0) { n /= 10; count++; }
        return count;
    }
    public static int[] getDigits(int number) {
        int count = countDigits(number), n = Math.abs(number);
        int[] digits = new int[count];
        for (int i = count-1; i >= 0; i--) { digits[i] = n % 10; n /= 10; }
        return digits;
    }
    public static boolean isDuck(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int number) {
        int sum = 0, n = Math.abs(number);
        int[] digits = getDigits(number);
        int pow = digits.length;
        for (int d : digits) sum += Math.pow(d, pow);
        return sum == Math.abs(number);
    }
    public static int[] largest2ndLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits)
            if (d > largest) { second = largest; largest = d; }
            else if (d > second && d < largest) second = d;
        return new int[]{largest, second};
    }
    public static int[] smallest2ndSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits)
            if (d < smallest) { second = smallest; smallest = d; }
            else if (d < second && d > smallest) second = d;
        return new int[]{smallest, second};
    }
    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);
        System.out.println("Count of digits: " + digits.length);
        System.out.println("Digits: " + java.util.Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuck(number));
        System.out.println("Armstrong Number: " + isArmstrong(number));
        int[] large = largest2ndLargest(digits);
        int[] small = smallest2ndSmallest(digits);
        System.out.println("Largest: " + large[0] + ", 2nd Largest: " + large[1]);
        System.out.println("Smallest: " + small[0] + ", 2nd Smallest: " + small[1]);
    }
}
