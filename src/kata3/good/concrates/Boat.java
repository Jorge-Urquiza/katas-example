package kata3.good.concrates;

import kata3.good.interfaces.Sailable;

public class Boat implements Sailable {
    @Override
    public void sail() {
        System.out.println("Boat is sailing...");
    }
}
