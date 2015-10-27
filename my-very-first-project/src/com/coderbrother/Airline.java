package com.coderbrother;

import java.util.ArrayList;

public class Airline {
    private String name;
    private ArrayList<Airplane> airplanes;

    public Airline(String name) {
        this.name = name;
        this.airplanes = new ArrayList<Airplane>();
    }

    public String getName() {
        return name;
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    public String describe() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Airline][name: " + name + "]: ");
        for (Airplane airplane : airplanes) {
            stringBuilder.append(airplane);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return describe();
    }
}
