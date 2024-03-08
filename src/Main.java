import entities.*;
import interfaces.Brightness;
import interfaces.PlayVolume;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        final Scanner sc = new Scanner(System.in);

//        System.out.println("INSERT 5 MULTIMEDIA ELEMENTS");
//        System.out.println();
//        System.out.println("Insert a video...");
//        Video video1 = createVideo(sc);
//        System.out.println("Insert a video...");
//        Video video2 = createVideo(sc);
//        System.out.println("Insert an audio...");
//        Audio audio1 = createAudio(sc);
//        System.out.println("Insert an audio...");
//        Audio audio2 = createAudio(sc);
//        System.out.println("Insert an image...");
//        Image image = createImage(sc);
//
//        MultimediaElement[] media = {video1, video2, audio1, audio2, image};
//        player(sc, media);

        Video test1 = new Video("test1", FileFormats.MP4, 3);
        Video test2 = new Video("test2", FileFormats.MP4, 3);
        Audio test3 = new Audio("test3", FileFormats.MP3, 3);
        Audio test4 = new Audio("test4", FileFormats.MP3, 3);
        Image test5 = new Image("test5", FileFormats.JPEG);
        MultimediaElement[] test = {test1, test2, test3, test4, test5};
        player(sc, test);

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

    public static void player(Scanner sc, MultimediaElement[] arr) {
        System.out.println("Select a media (type the corresponding number; type 0 to exit:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + " - " + arr[i].getFileName());
        }
        String value = sc.nextLine();
        switch (value) {
            case "0" -> sc.close();
            case "1" -> {
                if (arr[0] instanceof PlayVolume) manageVolume(sc, arr[0]);
                if (arr[0] instanceof Brightness) manageBrightness(sc, arr[0]);
                if (arr[0] instanceof PlayVolume) ((PlayVolume) arr[0]).play();
                if (arr[0] instanceof Image) imageHandler(sc, arr[0]);
                System.out.println();
                player(sc, arr);
            }
            case "2" -> {
                if (arr[1] instanceof PlayVolume) manageVolume(sc, arr[1]);
                if (arr[1] instanceof Brightness) manageBrightness(sc, arr[1]);
                if (arr[1] instanceof PlayVolume) ((PlayVolume) arr[1]).play();
                if (arr[1] instanceof Image) imageHandler(sc, arr[1]);
                System.out.println();
                player(sc, arr);
            }
            case "3" -> {
                if (arr[2] instanceof PlayVolume) manageVolume(sc, arr[2]);
                if (arr[2] instanceof Brightness) manageBrightness(sc, arr[2]);
                if (arr[2] instanceof PlayVolume) ((PlayVolume) arr[2]).play();
                if (arr[2] instanceof Image) imageHandler(sc, arr[2]);
                System.out.println();
                player(sc, arr);
            }
            case "4" -> {
                if (arr[3] instanceof PlayVolume) manageVolume(sc, arr[3]);
                if (arr[3] instanceof Brightness) manageBrightness(sc, arr[3]);
                if (arr[3] instanceof PlayVolume) ((PlayVolume) arr[3]).play();
                if (arr[3] instanceof Image) imageHandler(sc, arr[3]);
                System.out.println();
                player(sc, arr);
            }
            case "5" -> {
                if (arr[4] instanceof PlayVolume) manageVolume(sc, arr[4]);
                if (arr[4] instanceof Brightness) manageBrightness(sc, arr[4]);
                if (arr[4] instanceof PlayVolume) ((PlayVolume) arr[4]).play();
                if (arr[4] instanceof Image) imageHandler(sc, arr[4]);
                System.out.println();
                player(sc, arr);
            }
            default -> {
                System.out.println("Invalid input. Try again.");
                System.out.println();
                player(sc, arr);
            }
        }
    }

    public static void manageVolume(Scanner sc, MultimediaElement el) {
        System.out.println();
        System.out.println("SET THE VOLUME OF " + el.getFileName());
        System.out.println("Current volume: " + ((PlayVolume) el).getVolume()  + " (min: 0 - max: 10)");
        System.out.println("Instructions:");
        System.out.println("- Type \"up\" and press Enter to set up the volume (+1)");
        System.out.println("- Type \"down\" and press Enter to set down the volume (-1)");
        System.out.println("- Press Enter to go next");
        String value = sc.nextLine();
        if (Objects.equals(value, "up")) {
            ((PlayVolume) el).volumeUp();
            manageVolume(sc, el);
        } else if (Objects.equals(value, "down")) {
            ((PlayVolume) el).volumeDown();
            manageVolume(sc, el);
        }
    }

    public static void manageBrightness(Scanner sc, MultimediaElement el) {
        System.out.println();
        System.out.println("SET THE BRIGHTNESS OF " + el.getFileName());
        System.out.println("Current brightness: " + ((Brightness) el).getBrightness()  + " (min: 1 - max: 10)");
        System.out.println("Instructions:");
        System.out.println("- Type \"up\" and press Enter to set up the brightness (+1)");
        System.out.println("- Type \"down\" and press Enter to set down the brightness (-1)");
        System.out.println("- Press Enter to go next");
        String value = sc.nextLine();
        if (Objects.equals(value, "up")) {
            ((Brightness) el).brightnessUp();
            manageBrightness(sc, el);
        } else if (Objects.equals(value, "down")) {
            ((Brightness) el).brightnessDown();
            manageBrightness(sc, el);
        }
    }

    public static void imageHandler(Scanner sc, MultimediaElement el) {
        System.out.println();
        ((Image) el).show();
        System.out.println("Press Enter when you are done admiring this beautiful piece of art.");
        sc.nextLine();
        ((Image) el).close();
    }
}