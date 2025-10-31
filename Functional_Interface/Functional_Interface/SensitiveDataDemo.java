interface SensitiveData {}  // Marker interface

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "secret";
}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        UserCredentials user = new UserCredentials();

        if (user instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data before storage...");
        }
    }
}
