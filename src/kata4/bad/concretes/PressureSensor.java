package kata4.bad.concretes;

import kata4.bad.Sensor;

public class PressureSensor implements Sensor {
    @Override
    public double readTemperature() {
        throw new UnsupportedOperationException("Temperature not supported.");
    }

    @Override
    public double readPressure() {
        return 100.30;
    }

    @Override
    public double readHumidity() {
        throw new UnsupportedOperationException("Humidity not supported.");
    }
}
