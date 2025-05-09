package kata4.bad.concretes;

import kata4.bad.Sensor;

public class TemperatureSensor implements Sensor {
    @Override
    public double readTemperature() {
        return 33.3;
    }

    @Override
    public double readPressure() {
        throw new UnsupportedOperationException("Pressure not supported.");
    }

    @Override
    public double readHumidity() {
        throw new UnsupportedOperationException("Humidity not supported.");
    }
}
