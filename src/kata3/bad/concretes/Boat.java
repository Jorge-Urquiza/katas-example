package kata3.bad.concretes;

import kata3.bad.Vehicle;

public class Boat implements Vehicle
{
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Boat can't drive.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Boat can't fly.");
    }

    @Override
    public void sail() {
        System.out.println("Boat is sailing...");
    }
}
