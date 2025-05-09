package kata6.good.concretes;

import kata6.good.interfaces.CryptoPayment;

public class CryptoProcessor implements CryptoPayment {
    @Override
    public void processCrypto(String walletAddress) {
        System.out.println("Processing crypto payment to wallet: " + walletAddress);
    }
}
