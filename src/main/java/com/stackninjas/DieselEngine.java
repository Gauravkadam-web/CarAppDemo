package com.stackninjas;

public class DieselEngine implements Engine{
    private FuelPump fuelPump;

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    @Override
    public void start() {
        fuelPump.work();
        System.out.println("Diesel Engine is Started..⛽🚂");
    }
}
