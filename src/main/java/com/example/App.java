package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) applicationContext.getBean("alien");
        alien.age = 25;
        System.out.println(alien.age);


        Alien alien1 = (Alien) applicationContext.getBean("alien");
        System.out.println(alien1.age);
        alien.code();
    }
}
