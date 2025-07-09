package com.example.di.hots;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] agrs){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hots.xml");
        NotificationService notificationService = (NotificationService) applicationContext.getBean("notification_1");
        notificationService.notification();
    }
}
