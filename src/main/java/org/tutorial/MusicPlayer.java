package org.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class MusicPlayer {


    //private Music music;
    @Autowired
    private List<Music> musicList = new ArrayList<>();
    private List<String> rockMusic = new ArrayList<>();
    private List<String> classicalMusic = new ArrayList<>();
    private List<String> countryMusic = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    // Inversion of control (IoC)
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    //public MusicPlayer() {}

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("countryMusic") Music countryMusic) {
        this.rockMusic = rockMusic.getSongs();
        this.classicalMusic = classicalMusic.getSongs();
        this.countryMusic = countryMusic.getSongs();
    }


//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

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

    public String playMusicList() {
        StringBuilder str = new StringBuilder();
        for (Music music : musicList) {
            str.append("Playing: ").append(music.getSong()).append("\n");
        }
        return str.toString();
    }

    public void playMusicForGenre(MusicGenres genre) {
        Random random = new Random();
        int i = random.nextInt( 3);

        switch (genre) {
            case ROCK:
                System.out.println("Playing: " + rockMusic.get(i));
                break;
            case CLASSIC:
                System.out.println("Playing: " + classicalMusic.get(i));
                break;
            case COUNTRY:
                System.out.println("Playing: " + countryMusic.get(i));
                break;
            default:
                System.out.println("Not found this genre...");
                break;
        }
    }

    private void doMyInit() {
        System.out.println("Creating music player...");
    }
    private void doMyDestroy() {
        System.out.println("Destroying music player...");
    }
}
