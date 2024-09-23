// CreditCardPayment.java

public class CreditCardPayment extends Payment {

    public CreditCardPayment(String paymentID, double amount) {
        super(paymentID, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Credit Card payment processed for amount: ₱" + amount);
    }
}
