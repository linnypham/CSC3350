package midterm;

interface IPaymentProcessor {
    void processPayment();
}
class PayPalProcessor implements IPaymentProcessor {
    @Override
    public void processPayment() {
    }
}
class StripeProcessor implements IPaymentProcessor {
    @Override
    public void processPayment() {
    }
}
