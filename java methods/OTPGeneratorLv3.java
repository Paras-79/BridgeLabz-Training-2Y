import java.util.HashSet;

public class OTPGeneratorLv3 {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false; // duplicate found
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.print("Generated OTPs: ");
        for (int otp : otps) System.out.print(otp + " ");
        System.out.println("\nAre all OTPs unique? " + areOTPsUnique(otps));
    }
}

