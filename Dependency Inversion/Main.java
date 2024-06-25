package midterm;

public class Main {
    public static void main(String[] args) {
        IPaymentProcessor processor = new PayPalProcessor();
        PaymentService paymentService = new PaymentService(processor);
        paymentService.makePayment();
        // Switching to another implementation
        processor = new StripeProcessor();
        paymentService = new PaymentService(processor);
        paymentService.makePayment();
    }
}
