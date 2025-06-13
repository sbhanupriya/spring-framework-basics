package com.example.di.setterInjection;

public class Address {
    public String city;
    public Address(){
        System.out.println("Address Object created");
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
