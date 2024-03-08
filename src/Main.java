import entities.Audio;
import entities.FileFormats;
import entities.Image;
import entities.Video;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Video test1 = new Video("test1", FileFormats.MP4, 60);
//        System.out.println(test1.brightnessLevel() + "; " + test1.volumeLevel());
        test1.brightnessDown();
        test1.volumeUp();
//        System.out.println(test1.brightnessLevel() + "; " + test1.volumeLevel());
        test1.brightnessUp();
        test1.brightnessUp();
        test1.brightnessUp();
        test1.volumeDown();
        test1.volumeDown();
//        System.out.println(test1.brightnessLevel() + "; " + test1.volumeLevel());
//        test1.play();
//        System.out.println();
        Audio test2 = new Audio("test2", FileFormats.MP3, 10);
//        System.out.println(test2.volumeLevel());
        test2.volumeUp();
        test2.volumeUp();
//        System.out.println(test2.volumeLevel());
        test2.volumeDown();
        test2.volumeDown();
        test2.volumeDown();
//        System.out.println(test2.volumeLevel());
//        test2.play();
//        System.out.println();
        Image test3 = new Image("test3", FileFormats.JPEG);
        test3.brightnessUp();
        test3.brightnessUp();
        test3.show();
    }
}