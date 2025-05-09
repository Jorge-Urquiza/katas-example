package kata4.good.concretes;

import kata4.good.interfaces.TemperatureReadable;

public class TemperatureSensor implements TemperatureReadable {
    @Override
    public double readTemperature() {
        return 33.3;
    }
}
