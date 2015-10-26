package com.coderbrother;

public class PassengerAirplane extends Airplane {
    private int passengerCapacity;

    public PassengerAirplane(String registration) {
        super(registration);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
