package com.example.di.fieldautowiring;

public class Headphone implements Sound{
    @Override
    public void use() {
        System.out.println("System is using headphone");
    }
}
