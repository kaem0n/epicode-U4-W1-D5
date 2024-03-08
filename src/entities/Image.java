package entities;

import interfaces.Brightness;

public class Image extends MultimediaElement implements Brightness {
    // ATTRIBUTES
    private int brightness;

    // CONSTRUCTORS
    public Image(String title, FileFormats format) {
        super(title, format);
        this.brightness = 5;
    }

    // METHODS
    public void show() {
        System.out.println(this.getFileName() + " showing...; " + this.brightnessLevel());
    }

    public void close() {
        System.out.println(this.getFileName() + " closed..");
    }

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
}
