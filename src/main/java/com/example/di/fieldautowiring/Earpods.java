package com.example.di.fieldautowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("earpods")
public class Earpods implements Sound{
    @Override
    public void use() {
        System.out.println("System is using earpods");
    }
}
