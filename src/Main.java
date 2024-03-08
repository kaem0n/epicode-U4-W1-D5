import entities.Audio;
import entities.FileFormats;
import entities.Image;
import entities.Video;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("INSERT 5 MULTIMEDIA ELEMENTS");
        System.out.println();
        System.out.println("Insert a video...");
        Video video1 = createVideo(sc);
        System.out.println("Insert a video...");
        Video video2 = createVideo(sc);
        System.out.println("Insert an audio...");
        Audio audio1 = createAudio(sc);
        System.out.println("Insert an audio...");
        Audio audio2 = createAudio(sc);
        System.out.println("Insert an image...");
        Image image = createImage(sc);

        sc.close();


//        TESTS

//        Video test1 = new Video("test1", FileFormats.MP4, 60);
//        System.out.println(test1.brightnessLevel() + "; " + test1.volumeLevel());
//        test1.brightnessDown();
//        test1.volumeUp();
//        System.out.println(test1.brightnessLevel() + "; " + test1.volumeLevel());
//        test1.brightnessUp();
//        test1.brightnessUp();
//        test1.brightnessUp();
//        test1.volumeDown();
//        test1.volumeDown();
//        System.out.println(test1.brightnessLevel() + "; " + test1.volumeLevel());
//        test1.play();
//        System.out.println();
//        Audio test2 = new Audio("test2", FileFormats.MP3, 10);
//        System.out.println(test2.volumeLevel());
//        test2.volumeUp();
//        test2.volumeUp();
//        System.out.println(test2.volumeLevel());
//        test2.volumeDown();
//        test2.volumeDown();
//        test2.volumeDown();
//        System.out.println(test2.volumeLevel());
//        test2.play();
//        System.out.println();
//        Image test3 = new Image("test3", FileFormats.JPEG);
//        test3.brightnessUp();
//        test3.brightnessUp();
//        test3.show();
//        test3.close();
    }

    public static Video createVideo(Scanner sc) {
        System.out.println("Define a title:");
        final String title = sc.nextLine();
        System.out.println("Title: " + title);
        System.out.println("Define format (MP4, AVI):");
        final String formatValue = sc.nextLine().toLowerCase();
        FileFormats format;
        if (Objects.equals(formatValue, "mp4")) {
            format = FileFormats.MP4;
            System.out.println("Format: " + format);
        } else if (Objects.equals(formatValue, "avi")) {
            format = FileFormats.AVI;
            System.out.println("Format: " + format);
        } else {
            format = FileFormats.MP4;
            System.out.println("Invalid input, default format selected: MP4");
        }
        System.out.println("Define duration (seconds):");
        final int duration = Integer.parseInt(sc.nextLine());
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Recap - Title: " + title + "; Format: " + format + "; Duration: " + duration + " seconds");
        System.out.println();
        return new Video(title, format, duration);
    }

    public static Audio createAudio(Scanner sc) {
        System.out.println("Define a title:");
        final String title = sc.nextLine();
        System.out.println("Title: " + title);
        System.out.println("Define format (MP3, WAV):");
        final String formatValue = sc.nextLine().toLowerCase();
        FileFormats format;
        if (Objects.equals(formatValue, "mp3")) {
            format = FileFormats.MP3;
            System.out.println("Format: " + format);
        } else if (Objects.equals(formatValue, "wav")) {
            format = FileFormats.WAV;
            System.out.println("Format: " + format);
        } else {
            format = FileFormats.MP3;
            System.out.println("Invalid input, default format selected: MP3");
        }
        System.out.println("Define duration (seconds):");
        final int duration = Integer.parseInt(sc.nextLine());
        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Recap - Title: " + title + "; Format: " + format + "; Duration: " + duration + " seconds");
        System.out.println();
        return new Audio(title, format, duration);
    }

    public static Image createImage(Scanner sc) {
        System.out.println("Define a title:");
        final String title = sc.nextLine();
        System.out.println("Title: " + title);
        System.out.println("Recap - Title: " + title + "; Format: JPEG");
        System.out.println();
        return new Image(title, FileFormats.JPEG);
    }
}