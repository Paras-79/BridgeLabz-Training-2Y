import java.util.Arrays;

public class RandomStatsLv2 {
    // Generate an array of 'size' 4-digit random integers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    // Find average, min, and max of an int array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
            sum += numbers[i];
        }
        double avg = sum / (double)numbers.length;
        return new double[] {avg, min, max};
    }

    public static void main(String[] args) {
        int[] randNums = generate4DigitRandomArray(5);
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randNums));
        double[] stats = findAverageMinMax(randNums);
        System.out.printf("Average: %.2f\nMin: %.0f\nMax: %.0f\n", stats[0], stats[1], stats[2]);
    }
}
