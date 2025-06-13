package com.example.di.constructorInjection;

public class Car {
    private String model;
    private Engine engine;
    private String year;
    public Car(){
    }
    public Car(String model, Engine engine, String year){
        this.engine = engine;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", year='" + year + '\'' +
                '}';
    }
}
