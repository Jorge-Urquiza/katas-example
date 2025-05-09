package kata5.bad.concretes;

import kata5.bad.SmartDevice;

public class SmartLight implements SmartDevice {
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
        System.out.println("Light was connected to the WiFi: " + ssid);
    }

    @Override
    public void playMusic(String track) {
        throw new UnsupportedOperationException("SmartLight can't play music");
    }
}
