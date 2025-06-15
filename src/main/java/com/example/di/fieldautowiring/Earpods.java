package com.example.di.fieldautowiring;

public class Earpods implements Sound{
    @Override
    public void use() {
        System.out.println("System is using earpods");
    }
}
