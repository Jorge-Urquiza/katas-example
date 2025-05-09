package kata3.bad.concretes;

import kata3.bad.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving...");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car can't fly.");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Car can't sail.");
    }
}
