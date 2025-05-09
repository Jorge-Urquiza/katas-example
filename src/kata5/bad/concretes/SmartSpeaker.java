package kata5.bad.concretes;

import kata5.bad.SmartDevice;

public class SmartSpeaker implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Speaker turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker turned off");
    }

    @Override
    public void connectToWiFi(String ssid) {
        System.out.println("Speaker connected to WiFi: " + ssid);
    }

    @Override
    public void playMusic(String track) {
        System.out.println("Playing music: " + track);
    }
}
