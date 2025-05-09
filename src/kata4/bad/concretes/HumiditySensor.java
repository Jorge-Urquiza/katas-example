package kata4.bad.concretes;

import kata4.bad.Sensor;

public class HumiditySensor implements Sensor {
    @Override
    public double readTemperature() {
        throw new UnsupportedOperationException("Temperature not supported.");
    }

    @Override
    public double readPressure() {
        throw new UnsupportedOperationException("Pressure not supported.");
    }

    @Override
    public double readHumidity() {
        return 30.5;
    }
}
