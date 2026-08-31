package Inheritance;

interface Camera {

    void takePhoto();

}

interface MusicPlayer {

    void playMusic();

}

public class Inheritance_Multiple implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {

        Inheritance_Multiple phone = new Inheritance_Multiple();

        phone.takePhoto();
        phone.playMusic();
    }
}