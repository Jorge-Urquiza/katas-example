package kata5.good.concretes;

import kata5.good.interfaces.MusicPlayable;
import kata5.good.interfaces.PowerControllable;
import kata5.good.interfaces.WiFiConnectable;

public class SmartSpeaker implements PowerControllable, WiFiConnectable, MusicPlayable {
    @Override
    public void playMusic(String track) {
        System.out.println("Playing music: " + track);
    }

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
}
