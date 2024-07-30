public class AdapterPatternTest {
    public static void main(String[] args) {

        Paytm paytm = new Paytm();
        PhonePe phonePe = new PhonePe();

        PaymentProcessor paytmAdapter = new PaytmAdapter(paytm);
        PaymentProcessor phonePeAdapter = new PhonePeAdapter(phonePe);

        paytmAdapter.processPayment(500.00);
        phonePeAdapter.processPayment(400.00);
    }
}
