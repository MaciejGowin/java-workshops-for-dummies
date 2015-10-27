package com.coderbrother;

public class CargoAirplane extends Airplane {
    private double cargoCapacity;

    public CargoAirplane(String registration) {
        super(registration);
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String describe() {
        return "[CargoAirplane]" + super.describe();
    }
}
