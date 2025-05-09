package kata6.bad.concretes;

import kata6.bad.PaymentProcessor;

public class CryptoProcessor implements PaymentProcessor {
    @Override
    public void processCreditCard(String cardNumber) {
        throw new UnsupportedOperationException("CryptoProcessor doesn't support credit cards");
    }

    @Override
    public void processPayPal(String email) {
        throw new UnsupportedOperationException("CryptoProcessor doesn't support PayPal");
    }

    @Override
    public void processCrypto(String walletAddress) {
        System.out.println("Processing crypto payment to wallet: " + walletAddress);
    }
}
