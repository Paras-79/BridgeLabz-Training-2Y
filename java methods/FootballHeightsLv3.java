import java.util.Arrays;

public class FootballHeightsLv3 {
    public static int sum(int[] arr) {
        int s = 0; for (int v : arr) s += v; return s;
    }
    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }
    public static int minHeight(int[] arr) {
        int m = arr[0]; for (int v : arr) if (v < m) m = v; return m;
    }
    public static int maxHeight(int[] arr) {
        int m = arr[0]; for (int v : arr) if (v > m) m = v; return m;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + (int)(Math.random() * 101); //150-250 inclusive
        System.out.println("Heights (cm): " + Arrays.toString(heights));

        System.out.printf("Shortest: %d cm\n", minHeight(heights));
        System.out.printf("Tallest: %d cm\n", maxHeight(heights));
        System.out.printf("Mean Height: %.2f cm\n", mean(heights));
    }
}
