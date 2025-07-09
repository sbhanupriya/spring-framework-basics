package com.example.di.lazyinit;

import com.example.di.primarybean.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lazy-init.xml");
        System.out.println("Application context created");
        System.out.println("Requesting Eager Bean");
        EagerBean eagerBean = (EagerBean) applicationContext.getBean("eager");
        System.out.println("Requesting Lazy Bean");
        LazyBean lazyBean = (LazyBean) applicationContext.getBean("lazy");
    }
}
