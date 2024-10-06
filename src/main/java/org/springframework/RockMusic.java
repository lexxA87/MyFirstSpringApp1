package org.springframework;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Highway to Hell";
    }
}
