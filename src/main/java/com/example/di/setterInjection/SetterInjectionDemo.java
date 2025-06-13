package com.example.di.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setter-injection.xml");
        Person person = (Person) applicationContext.getBean("person_Bhanu");
        System.out.println(person.toString());


    }
}
