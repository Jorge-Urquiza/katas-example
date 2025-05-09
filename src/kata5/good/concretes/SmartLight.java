package kata5.good.concretes;

import kata5.good.interfaces.PowerControllable;
import kata5.good.interfaces.WiFiConnectable;

public class SmartLight implements PowerControllable, WiFiConnectable {
    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off");
    }

    @Override
    public void connectToWiFi(String ssid) {
        System.out.println("Light connected to WiFi: " + ssid);
    }
}
