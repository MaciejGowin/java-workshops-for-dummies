package com.coderbrother;

public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println(airplanes[index].getRegistration());
        }

        System.out.println("Finished: " + programName);
    }
}
