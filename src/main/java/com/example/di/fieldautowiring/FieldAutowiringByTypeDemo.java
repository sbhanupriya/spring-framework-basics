package com.example.di.fieldautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldAutowiringByTypeDemo {
    public static void main(String[] ars){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("field-autowiring-by-type.xml");
        MusicPlayer music = (MusicPlayer) applicationContext.getBean("musicplayer");
        music.play();
    }
}
