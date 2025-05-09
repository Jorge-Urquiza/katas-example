package kata3.good.concrates;

import kata3.good.interfaces.Drivable;

public class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }
}
