package com.example.javaConfig;

import com.example.Alien;
import com.example.di.fieldautowiring.Earpods;
import com.example.di.fieldautowiring.Headphone;
import com.example.di.fieldautowiring.MusicPlayer;
import com.example.di.primarybean.PaymentService;
import com.example.di.setterInjection.Address;
import com.example.di.setterInjection.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("********** Spring Java Based Configuration ***********");
        System.out.println("********** Prototype Bean  ***********");
        Alien alien = (Alien) applicationContext.getBean("alien1");
        alien.code();
        Alien alien1 = (Alien) applicationContext.getBean("alien1");
        alien1.code();


        System.out.println("***************Di example*************");
        Person person = applicationContext.getBean(Person.class);
        Address address = applicationContext.getBean(Address.class);
        System.out.println(address.toString());
        System.out.println(person.toString());


        System.out.println("***************Primary Bean example *************");
        PaymentService paymentService = applicationContext.getBean("primary-bean",PaymentService.class);
        paymentService.payment();


        System.out.println("***************Qualifier Bean example *************");
        PaymentService paymentService2 = applicationContext.getBean("qualifier-bean",PaymentService.class);
        paymentService2.payment();

        System.out.println("************** ComponentScan **********************");
        Earpods earpods = applicationContext.getBean(Earpods.class);
        earpods.use();
        Headphone headphone = applicationContext.getBean(Headphone.class);
        headphone.use();
        MusicPlayer musicPlayer = applicationContext.getBean(MusicPlayer.class);
        musicPlayer.play();
    }
}
