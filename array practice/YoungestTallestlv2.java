import java.util.Scanner;

public class YoungestTallestlv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + friends[i]);
            age[i] = scanner.nextInt();
            height[i] = scanner.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            if (height[i] > height[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest friend is " + friends[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("Tallest friend is " + friends[tallestIndex] + " with height " + height[tallestIndex]);
        scanner.close();
    }
}
