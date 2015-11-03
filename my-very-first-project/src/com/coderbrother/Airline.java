package com.coderbrother;

import java.util.ArrayList;
import java.util.HashMap;

public class Airline {
    private static final HashMap<String, String> AIRLINE_NAME_PER_AIRPLANE_REGISTRATION = new HashMap<String, String>();

    private String name;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;

    public Airline(String name) {
        this.name = name;
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }

    public String getName() {
        return name;
    }

    public void addAirplane(Airplane airplane) {
        String airlineName = AIRLINE_NAME_PER_AIRPLANE_REGISTRATION.get(airplane.getRegistration());
        if (airlineName == null || airlineName.equals(name)) {
            if (!airplanes.contains(airplane)) {
                airplanes.add(airplane);
            }
            AIRLINE_NAME_PER_AIRPLANE_REGISTRATION.put(airplane.getRegistration(), name);
        } else {
            throw new AirlineException("Airplane already registered: " + airlineName);
        }
    }

    public Flight scheduleFlight(final String flightNumber, final String airplaneRegistration) {
        if (StringUtils.isEmpty(flightNumber)) {
            throw new AirlineException("Flight number cannot be empty");
        }

        Airplane airplane = getAirplane(airplaneRegistration);
        if (airplane == null) {
            throw new AirlineException("Airplane doesn't exist: " + airplaneRegistration);
        }

        Flight flight = getFlight(flightNumber);
        if (flight != null) {
            throw new AirlineException("Flight number already exists: " + flightNumber);
        }

        Flight newFlight = new Flight(flightNumber, airplane);
        flights.add(newFlight);
        return newFlight;
    }

    public Airplane getAirplane(final String airplaneRegistration) {
        if (!StringUtils.isEmpty(airplaneRegistration)) {
            for (Airplane airplane : airplanes) {
                if (airplaneRegistration.equals(airplane.getRegistration())) {
                    return airplane;
                }
            }
        }
        return null;
    }

    public Flight getFlight(final String flightNumber) {
        if (!StringUtils.isEmpty(flightNumber)) {
            for (Flight flight : flights) {
                if (flightNumber.equals(flight.getNumber())) {
                    return flight;
                }
            }
        }
        return null;
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

    public class Flight {
        private String number;
        private FlightState state;
        private Airplane airplane;

        private Flight(final String number, final Airplane airplane) {
            this.number = number;
            this.state = FlightState.SCHEDULED;
            this.airplane = airplane;
            trackState();
        }

        public String getNumber() {
            return number;
        }

        public void takeOff() {
            for (Flight flight : flights) {
                if (flight.state == FlightState.IN_THE_AIR
                        && flight.airplane.getRegistration().equals(airplane.getRegistration())) {
                    throw new AirlineException("Airplane is currently in the air");
                }
            }

            if (state == FlightState.SCHEDULED) {
                state = FlightState.IN_THE_AIR;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.IN_THE_AIR);
            }
        }

        public void land() {
            if (state == FlightState.IN_THE_AIR) {
                state = FlightState.LANDED;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.LANDED);
            }
        }

        private void trackState() {
            System.out.printf("[Flight][airlineName: %s, number: %s, state: %s, airplaneRegistration: %s]\n", Airline.this.getName(), number, state, airplane.getRegistration());
        }
    }

    public enum FlightState {
        SCHEDULED, IN_THE_AIR, LANDED;
    }
}
