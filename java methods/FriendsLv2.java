import java.util.Scanner;

public class FriendsLv2 {
    public static int findYoungest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[idx]) idx = i;
        return idx;
    }
    public static int findTallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[idx]) idx = i;
        return idx;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ":");
            ages[i] = scanner.nextInt();
            heights[i] = scanner.nextDouble();
        }
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest: " + names[youngest] + " (Age " + ages[youngest] + ")");
        System.out.println("Tallest: " + names[tallest] + " (Height " + heights[tallest] + ")");
        scanner.close();
    }
}

