package midterm;

public class PaymentService {
    private IPaymentProcessor paymentProcessor;
    public PaymentService(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void makePayment() {
        paymentProcessor.processPayment();
    }
}

