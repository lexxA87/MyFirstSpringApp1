package org.springframework;

public class CountryMusic implements Music{
    @Override
    public String getSong() {
        return "My Country is awesome!";
    }
}
