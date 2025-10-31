interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Default refund of ₹" + amount + " processed.");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " via PayPal.");
    }
}

public class PaymentProcessorDemo {
    public static void main(String[] args) {
        PaymentProcessor pp = new PayPal();
        pp.processPayment(5000);
        pp.refund(1000);
    }
}
