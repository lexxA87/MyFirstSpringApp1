package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class);

        Music music = context.getBean("musicBean", Music.class);

        System.out.println(testBean);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
