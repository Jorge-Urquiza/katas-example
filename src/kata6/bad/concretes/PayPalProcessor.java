package kata6.bad.concretes;

import kata6.bad.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processCreditCard(String cardNumber) {
        throw new UnsupportedOperationException("PayPalProcessor doesn't support credit cards");
    }

    @Override
    public void processPayPal(String email) {
        System.out.println("Processing PayPal payment: " + email);
    }

    @Override
    public void processCrypto(String walletAddress) {
        throw new UnsupportedOperationException("PayPalProcessor doesn't support Crypto");
    }
}
