package kata6.good.concretes;

import kata6.good.interfaces.PayPalPayment;

public class PayPalProcessor implements PayPalPayment {
    @Override
    public void processPayPal(String email) {
        System.out.println("Processing PayPal payment: " + email);
    }
}
