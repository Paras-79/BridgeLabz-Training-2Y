import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker svc = new StudentVoteChecker();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int age : ages) {
            boolean canVote = svc.canStudentVote(age);
            if (age < 0) System.out.println("Invalid age.");
            else if (canVote) System.out.println("Age " + age + " can vote.");
            else System.out.println("Age " + age + " cannot vote.");
        }
        scanner.close();
    }
}

