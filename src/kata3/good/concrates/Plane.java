package kata3.good.concrates;

import kata3.good.interfaces.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }
}
