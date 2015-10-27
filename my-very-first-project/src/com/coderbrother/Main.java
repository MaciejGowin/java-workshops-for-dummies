package com.coderbrother;

public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineType(EngineType.JET);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineType(EngineType.TURBOPROP);
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineType(EngineType.JET);
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineType(EngineType.TURBOPROP);
        airplane4.setEngineQuantity(2);

        Airline airline1 = new Airline("Ryanair");
        airline1.addAirplane(airplane1);
        airline1.addAirplane(airplane2);

        Airline airline2 = new Airline("EasyJet");
        airline2.addAirplane(airplane3);
        airline2.addAirplane(airplane4);

        Airline[] airlines = new Airline[] { airline1, airline2 };

        for (int index = 0; index < airlines.length; index++) {
            System.out.printf("Airline: %s\n", airlines[index]);
        }

        System.out.println("Finished: " + programName);
    }
}
