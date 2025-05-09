package kata6.good.concretes;

import kata6.good.interfaces.CreditCardPayment;

public class CreditCardProcessor implements CreditCardPayment {
    @Override
    public void processCreditCard(String cardNumber) {
        System.out.println("Processing credit card: " + cardNumber);
    }
}
