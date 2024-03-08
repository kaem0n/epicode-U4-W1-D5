import entities.FileFormats;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        Video test = new Video("test", FileFormats.MP4, 60);
        System.out.println(test.brightnessLevel() + "; " + test.volumeLevel());
        test.brightnessDown();
        test.volumeUp();
        System.out.println(test.brightnessLevel() + "; " + test.volumeLevel());
        test.brightnessUp();
        test.brightnessUp();
        test.brightnessUp();
        test.volumeDown();
        test.volumeDown();
        System.out.println(test.brightnessLevel() + "; " + test.volumeLevel());
        test.play();
    }
}