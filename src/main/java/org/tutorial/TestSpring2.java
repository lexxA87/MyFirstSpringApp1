package org.tutorial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AppConficSpring.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println("* * * * *");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        computer.playSomeMusic(MusicGenres.ROCK);
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.getName());
    }
}
