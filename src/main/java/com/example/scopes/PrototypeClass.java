package com.example.scopes;

public class PrototypeClass {
    public int counter;
    public PrototypeClass(){
        counter = 0;
        System.out.println("PrototypeClass created");
    }
    public void increment() {
        counter++;
        System.out.println("Prototype Counter " + counter);
    }

}
