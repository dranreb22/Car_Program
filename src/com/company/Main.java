package com.company;
import java.lang.String;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        //testing VehicleChassis class default constructor and overloaded constructor
        VehicleChassis myChassis = new VehicleChassis();
        //printing test of object
        System.out.println(myChassis);
        VehicleChassis yourChassis = new VehicleChassis("A50");
        //printing test of object
        System.out.println(yourChassis + "\n");

        //testing ManufacturedEngine class default constructor and overloaded constructor
        ManufacturedEngine engine1 = new ManufacturedEngine();
        //printing test of object
        System.out.println(engine1 + "\n");
        ManufacturedEngine engine2 = new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");
        //printing test of object
        System.out.println(engine2 + "\n");

        //testing InteriorFeature class default constructor and overloaded constructor
        InteriorFeature myInterior = new InteriorFeature();
        //printing test of object
        System.out.println(myInterior + "\n");
        InteriorFeature yourInterior = new InteriorFeature("Climate Control");
        //printing test of object
        System.out.println(yourInterior + "\n");

        ExteriorFeature myExterior = new ExteriorFeature();
        //printing test of object
        System.out.println(myExterior + "\n");
        ExteriorFeature yourExterior = new ExteriorFeature("Fog Lamps");
        //printing test of object
        System.out.println(yourExterior + "\n");
    }
}