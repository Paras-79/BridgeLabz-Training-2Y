import java.util.Scanner;

public class HandshakeLv1 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        System.out.println("Maximum possible handshakes: " + calculateHandshakes(students));
        scanner.close();
    }
}

