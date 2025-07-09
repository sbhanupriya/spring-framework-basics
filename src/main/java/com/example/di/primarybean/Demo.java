package com.example.di.primarybean;

import com.example.di.setterInjection.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("primary-bean.xml");
        PaymentService service = (PaymentService) applicationContext.getBean("service");
        service.payment();
    }
}
