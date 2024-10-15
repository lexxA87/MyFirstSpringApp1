package org.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public void playSomeMusic(MusicGenres genre) {
        musicPlayer.playMusicForGenre(genre);
    }

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 10;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer id " + id +
                ":\n" + musicPlayer.playMusicList();
    }
}
