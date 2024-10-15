package org.tutorial;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Highway to Hell");
        songs.add("Show must go on!");
        songs.add("Unforgiven");
    }

    @Override
    public String getSong() {
        return "Highway to Hell";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }



    private void doMyInit() {
        System.out.println("Init: I wanna ROCK!!!");
    }
    private void doMyDestroy() {
        System.out.println("Destroy Rock!");
    }
}
