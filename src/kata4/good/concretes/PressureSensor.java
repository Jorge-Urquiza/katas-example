package kata4.good.concretes;

import kata4.good.interfaces.PressureReadable;

public class PressureSensor implements PressureReadable {
    @Override
    public double readPressure() {
        return 300.3;
    }
}
