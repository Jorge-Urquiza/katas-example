package kata4.good.concretes;

import kata4.good.interfaces.HumidityReadable;

public class HumiditySensor implements HumidityReadable {
    @Override
    public double readHumidity() {
        return 30.3;
    }
}
