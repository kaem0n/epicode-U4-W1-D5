package entities;

import interfaces.PlayVolume;

public class Audio extends MultimediaElement implements PlayVolume {
    // ATTRIBUTES
    private int volume;
    private final int seconds;

    // CONSTRUCTORS
    public Audio(String title, FileFormats format, int seconds) {
        super(title, format);
        this.volume = 5;
        this.seconds = seconds;
    }

    // GETTERS & SETTERS
    @Override
    public int getVolume() {
        return volume;
    }

    // METHODS
    @Override
    public void play() {
        for (int i = seconds; i > 0 ; i--) {
            System.out.println(this.getFileName() + " is playing. Remaining time: " + i + " seconds; " + this.volumeLevel());
            if (i == 1) System.out.println(this.getFileName() + " finished reproduction.");
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
