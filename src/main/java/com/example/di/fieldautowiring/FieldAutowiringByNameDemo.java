package com.example.di.fieldautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldAutowiringByNameDemo {
    public static void main(String[] ars){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("field-autowiring-by-name.xml");
        MusicPlayer music = (MusicPlayer) applicationContext.getBean("musicplayer");
        music.play();
    }
}
