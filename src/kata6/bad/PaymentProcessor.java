package kata6.bad;

public interface PaymentProcessor {
    void processCreditCard(String cardNumber);
    void processPayPal(String email);
    void processCrypto(String walletAddress);
}
