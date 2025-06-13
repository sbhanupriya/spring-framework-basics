package com.example.di.setterInjection;

public class Person {
    private String name;
    private Address address;
    public Person(){
        System.out.println("Person Object Created");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
