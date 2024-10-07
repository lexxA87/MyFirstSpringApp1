package org.springframework;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "9th sonata";
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory for Classical Music");
        return new ClassicalMusic();
    }
}
