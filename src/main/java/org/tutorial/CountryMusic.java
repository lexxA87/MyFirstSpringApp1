package org.tutorial;

import org.springframework.stereotype.Component;

@Component
public class CountryMusic implements Music{
    @Override
    public String getSong() {
        return "My Country is awesome!";
    }
}
