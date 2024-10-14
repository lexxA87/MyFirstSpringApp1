package org.tutorial;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Highway to Hell";
    }

    private void doMyInit() {
        System.out.println("Init: I wanna ROCK!!!");
    }
    private void doMyDestroy() {
        System.out.println("Destroy Rock!");
    }
}
