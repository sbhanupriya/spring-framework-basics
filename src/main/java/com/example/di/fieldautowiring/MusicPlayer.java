package com.example.di.fieldautowiring;

public class MusicPlayer {
    private Sound sound;
    public void play(){
        sound.use();
    }
    public void setSound(Sound sound) {
        this.sound = sound;
    }
}
