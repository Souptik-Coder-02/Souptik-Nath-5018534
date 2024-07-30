public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("123456");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(250.00);

        PaymentStrategy payPalPayment = new PayPalPayment("souptik.nath@gmail.com", "pass123");
        context.setPaymentStrategy(payPalPayment);
        context.pay(300.00);
    }
}
