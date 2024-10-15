package org.tutorial;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMusic implements Music{
    private List<String> songs = new ArrayList<>();

    public CountryMusic() {
        songs.add("My Country is awesome!");
        songs.add("Cow cow cow!!!");
        songs.add("My farm");
    }

    @Override
    public String getSong() {
        return "My Country is awesome!";
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
