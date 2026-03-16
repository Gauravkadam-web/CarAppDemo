package com.stackninjas;

public class PetrolEngine implements Engine{
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
        System.out.println("Petrol Engine is Started..⛽🚂");
    }
}
