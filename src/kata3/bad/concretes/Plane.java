package kata3.bad.concretes;

import kata3.bad.Vehicle;

public class Plane implements Vehicle {
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Plane can't drive.");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }

    @Override
    public void sail() {
        throw new UnsupportedOperationException("Plane can't sail.");
    }
}
