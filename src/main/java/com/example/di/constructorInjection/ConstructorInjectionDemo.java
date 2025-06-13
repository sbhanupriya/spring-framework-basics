package com.example.di.constructorInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionDemo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructor-injection.xml");
        Car car = (Car)applicationContext.getBean("car_hyundai");
        System.out.println(car.toString());
    }
}
