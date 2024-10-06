package org.springframework;

public class MusicPlayer {
    private Music music;

    // Inversion of control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
