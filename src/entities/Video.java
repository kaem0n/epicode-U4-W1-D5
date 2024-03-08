package entities;

import interfaces.Brightness;
import interfaces.PlayVolume;

public class Video extends MultimediaElement implements Brightness, PlayVolume {
    // ATTRIBUTES
    private int brightness;
    private int volume;
    private final int seconds;

    // CONSTRUCTORS
    public Video(String title, FileFormats format, int seconds) {
        super(title, format);
        this.brightness = 5;
        this.volume = 5;
        this.seconds = seconds;
    }

    // GETTERS & SETTERS
    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    // METHODS
    @Override
    public void brightnessUp() {
        if (brightness < 10) {
            brightness++;
        }
    }

    @Override
    public void brightnessDown() {
        if (brightness > 1) {
            brightness--;
        }
    }

    @Override
    public String brightnessLevel() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < brightness; i++) str.append("*");
        return "Brightness: (" + str + ")";
    }

    @Override
    public void play() {
        for (int i = seconds; i > 0 ; i--) {
            System.out.println(this.getFileName() + " is playing. Remaining time: " + i + " seconds; " + this.volumeLevel() + "; " + this.brightnessLevel());
        }
    }

    @Override
    public void volumeUp() {
        if (volume < 10) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public String volumeLevel() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < volume; i++) str.append("!");
        return "Volume: (" + str + ")";
    }
}
