package org.springframework;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    // Inversion of control (IoC)
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    public MusicPlayer() {}

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    private void doMyInit() {
        System.out.println("Creating music player...");
    }
    private void doMyDestroy() {
        System.out.println("Destroying music player...");
    }
}
