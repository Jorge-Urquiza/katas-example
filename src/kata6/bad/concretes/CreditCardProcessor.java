package kata6.bad.concretes;

import kata6.bad.PaymentProcessor;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processCreditCard(String cardNumber) {
        System.out.println("Processing credit card: " + cardNumber);
    }

    @Override
    public void processPayPal(String email) {
        throw new UnsupportedOperationException("CreditCardProcessor doesn't support PayPal");
    }

    @Override
    public void processCrypto(String walletAddress) {
        throw new UnsupportedOperationException("CreditCardProcessor doesn't support Crypto");
    }
}
