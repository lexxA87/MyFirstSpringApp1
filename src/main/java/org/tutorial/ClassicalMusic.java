package org.tutorial;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    //private ClassicalMusic() {}

    private List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("9th sonata");
        songs.add("4th sonata");
        songs.add("Classic sonata");
    }

    @Override
    public String getSong() {
        return "9th sonata";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

//    public static ClassicalMusic getClassicalMusic() {
//        System.out.println("Factory for Classical Music");
//        return new ClassicalMusic();
//    }
}
