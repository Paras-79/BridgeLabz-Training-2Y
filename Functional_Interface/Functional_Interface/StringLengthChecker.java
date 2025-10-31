import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String message = "Welcome to Java Interface Concepts!";
        int length = getLength.apply(message);
        System.out.println("Message length: " + length);
    }
}
