package com.example.di.fieldautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    public MusicPlayer(){
        System.out.println("Base constructor called");
    }
    @Autowired
    public MusicPlayer(@Qualifier("headphones") Sound sound){
        this.earpods = sound;
        System.out.println("Para constructor called");
    }

    private Sound earpods;
    public void play(){
        earpods.use();
    }
    public void setSound(Sound sound) {
        System.out.println("Setter Injection called");
        this.earpods = sound;
    }
}
