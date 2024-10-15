package org.tutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //TestBean testBean = context.getBean("testBean", TestBean.class);

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

       //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
       // MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        //secondMusicPlayer.setVolume(39);

        //System.out.println(testBean);
        //musicPlayer.playMusicList();
        //musicPlayer.playMusic();
        System.out.println("* * * * *");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusicForGenre(MusicGenres.CLASSIC);
//        musicPlayer.playMusicForGenre(MusicGenres.ROCK);
//        musicPlayer.playMusicForGenre(MusicGenres.COUNTRY);
        computer.playSomeMusic(MusicGenres.ROCK);
        System.out.println("* * * * *");
        //boolean comp = musicPlayer == secondMusicPlayer;
        //System.out.println(comp);
        //System.out.println(musicPlayer);
       // System.out.println(secondMusicPlayer);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());

        context.close();
    }
}
