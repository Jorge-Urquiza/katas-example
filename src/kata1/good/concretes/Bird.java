package kata1.good.concretes;

import kata1.good.interfaces.Flyable;
import kata1.good.interfaces.Runnable;

public class Bird implements Flyable, Runnable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }
}
