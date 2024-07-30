// PayPalAdapter.java
public class PhonePeAdapter implements PaymentProcessor {
    private final PhonePe phonePe;

    public PhonePeAdapter(PhonePe phonePe) {
        this.phonePe = phonePe;
    }

    @Override
    public void processPayment(double amount) {
        phonePe.sendPayment(amount);
    }
}

