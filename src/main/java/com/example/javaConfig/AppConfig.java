package com.example.javaConfig;

import com.example.Alien;
import com.example.di.primarybean.PaymentService;
import com.example.di.primarybean.PaymentStrategy;
import com.example.di.primarybean.PaypalPayment;
import com.example.di.primarybean.StripePayment;
import com.example.di.setterInjection.Address;
import com.example.di.setterInjection.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.di.fieldautowiring")
public class AppConfig {
    @Bean(name = {"alien", "alien1", "alien2"})
    @Scope("prototype")
    public Alien alien(){
        return new Alien();
    }
    @Bean
    public Person person(Address address){
        Person person = new Person();
        person.setAddress(address);
        person.setName("Bhanu");
        return person;
    }
    @Bean
    public Address address(){
        Address address = new Address();
        address.setCity("Vancouver");
        return address;
    }
    @Bean(name = "qualifier-bean")
    public PaymentService paymentService(@Qualifier("paypalPayment") PaymentStrategy strategy){
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(strategy);
        return paymentService;
    }
    @Bean(name = "primary-bean")
    public PaymentService paymentService2(PaymentStrategy strategy){
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(strategy);
        return paymentService;
    }

    @Bean
    public PaypalPayment paypalPayment(){
        return new PaypalPayment();
    }
    @Bean
    @Primary
    public StripePayment stripePayment(){
        return new StripePayment();
    }

}
