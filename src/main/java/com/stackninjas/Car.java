package com.stackninjas;

import java.util.List;

public class Car {
    private Battery battery;
    private Engine engine;
    private List<Tyre> tyres;

    public Car() {
    }

    public Car(Battery battery, Engine engine, List<Tyre> tyres) {
        this.battery = battery;
        this.engine = engine;
        this.tyres = tyres;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }

    public void setTyres(List<Tyre> tyres) {
        this.tyres = tyres;
    }

    public void drive(){
        battery.supply();
        engine.start();
        for(Tyre tyre : tyres)
            tyre.rotate();
        System.out.println("Car is Running....🏎️💨");
    }

    @Override
    public String toString() {
        return "Car{" +
                "battery=" + battery +
                ", engine=" + engine +
                ", tyres=" + tyres +
                '}';
    }
}
