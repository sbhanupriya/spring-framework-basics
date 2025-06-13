package com.example.di.constructorInjection;

public class Engine {
    private  String type;
    public Engine(){

    }
    public Engine(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
