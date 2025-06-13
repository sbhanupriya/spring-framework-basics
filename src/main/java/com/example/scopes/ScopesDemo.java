package com.example.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopesDemo {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("scopes.xml");

        System.out.println("************Main Execution Starts************");

        PrototypeClass prototypeClass = (PrototypeClass) context.getBean("prototype");
        SingletonClass singletonClass = (SingletonClass) context.getBean("singleton");
        prototypeClass.increment();
        singletonClass.increment();

        System.out.println("2nd object creation");
        PrototypeClass prototypeClass2 = (PrototypeClass) context.getBean("prototype");
        prototypeClass2.increment();
        SingletonClass singletonClass2 = (SingletonClass) context.getBean("singleton");
        singletonClass2.increment();

        System.out.println("************Main Execution Ends************");




    }
}
