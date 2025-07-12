package com.example.di.fieldautowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("headphones")
public class Headphone implements Sound{
    @Override
    public void use() {
        System.out.println("System is using headphone");
    }
}
