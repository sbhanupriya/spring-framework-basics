package com.example.scopes;

public class SingletonClass {
    public int counter;
    public SingletonClass(){
        counter = 0;
        System.out.println("Singleton Class created");
    }
    public void increment() {
        counter++;
        System.out.println("Singleton Counter " + counter);
    }
}
