/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.*;
import javax.sound.sampled.*;
import java.io.File;

public class Music_play_in_java_leonora {
    static String start;

    public static void main(String[] args) {
        new Music_play_in_java_leonora();
    }

    public Music_play_in_java_leonora() {

        try {
            File file = new File(
                    "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\HP\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\leonora cut.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            SongLines call = new Line();

            Scanner scan = new Scanner(System.in);

            System.out.print("");
            System.out.print("");
            System.out.print("Press [1]");
            System.out.print(" ");
            System.out.print("");
            start = scan.next();
            clip.start();
            Clear();
            call.FirstLine();
            Clear();
            call.SecondLine();
            Clear();
            call.ThirdLine();
            Clear();
            call.FourthLine();
            Clear();
            System.out.println("Repeat the program? (Yes/No)");
            start = scan.next();

            if (start.equalsIgnoreCase("Yes")) {
                new Music_play_in_java_nothing();
            } else if (start.equalsIgnoreCase("No")) {
                System.out.println("Thank You!!");
            } else {
                System.out.println("Invalid Response");
            }

        } catch (Exception e) {

        }
    }

    public static abstract class SongLines {
        public abstract void FirstLine();

        public abstract void SecondLine();

        public abstract void ThirdLine();

        public abstract void FourthLine();

    }

    public static class Line extends SongLines {

        @Override
        public void FirstLine() {
            try {
                Thread.sleep(30);
                System.out.print("Kailanman");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print(".");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print(".");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print(".");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print(".");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print(".");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print("Ang");
                System.out.print(" ");
                Thread.sleep(490);
                System.out.print("dating");
                System.out.print(" ");
                Thread.sleep(690);
                System.out.print("tamis");
                System.out.print(" ");
                Thread.sleep(900);
                System.out.print("ng");
                System.out.print(" ");
                Thread.sleep(900);
                System.out.print("pagsasama");
                System.out.print(" ");
                Thread.sleep(900);
                System.out.print("nasa'n");
                System.out.print(" ");
                Thread.sleep(900);
                System.out.print("na?");
                System.out.print(" ");
                Thread.sleep(900);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void SecondLine() {
            try {
                Thread.sleep(400);
                System.out.print("(Hinahanap");
                System.out.print(" ");
                Thread.sleep(500);
                System.out.print("hinahanap");
                System.out.print(" ");
                Thread.sleep(500);
                System.out.print("ka");
                System.out.print(" ");
                Thread.sleep(700);
                System.out.print("whoa)");
                System.out.println(" ");
                Thread.sleep(700);
                System.out.print("Ba't");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("sa");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("'ting");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("dal'wa,");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("ako");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("na");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("lang");
                System.out.print(" ");
                Thread.sleep(300);
                System.out.print("ang");
                System.out.print(" ");
                Thread.sleep(500);
                System.out.print("natira?");
                System.out.println(" ");
                Thread.sleep(800);
                System.out.print("Sana'y");
                System.out.print(" ");
                Thread.sleep(1040);
                System.out.print("magkita");
                System.out.print(" ");
                Thread.sleep(750);
                System.out.print("pa");
                System.out.print(" ");
                Thread.sleep(850);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void ThirdLine() {
            try {
                Thread.sleep(400);
                System.out.print("Tinig");
                System.out.print(" ");
                Thread.sleep(700);
                System.out.print("mong");
                System.out.print(" ");
                Thread.sleep(400);
                System.out.print("kay");
                System.out.print(" ");
                Thread.sleep(400);
                System.out.print("ganda,");
                System.out.print(" ");
                Thread.sleep(500);
                System.out.print("maririnig");
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("pa");
                System.out.print(" ");
                Thread.sleep(400);
                System.out.print("ba?");
                System.out.print(" ");
                Thread.sleep(700);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void FourthLine() {
            try {
                Thread.sleep(400);
                System.out.print("Handang");
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("tahaking");
                System.out.print(" ");
                Thread.sleep(900);
                System.out.print("mag-isa");
                System.out.print(" ");
                Thread.sleep(2950);
                System.out.print("kahit");
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("wala");
                System.out.print(" ");
                Thread.sleep(1700);
                System.out.print("ka");
                System.out.print(" ");
                Thread.sleep(500);
                System.out.print("na");
                System.out.print(" ");
                Thread.sleep(600);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void Clear() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
