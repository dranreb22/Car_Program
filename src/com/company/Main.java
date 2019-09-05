package com.company;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
	VehicleChassis myChassis = new VehicleChassis();
	System.out.println(myChassis );
	VehicleChassis yourChassis = new VehicleChassis("A50");
    System.out.println(yourChassis + "\n");

    ManufacturedEngine engine1 = new ManufacturedEngine();
    System.out.println(engine1 + "\n");
    ManufacturedEngine engine2 = new ManufacturedEngine( "Honda", new Date(), "H-Series", "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive");
    System.out.println(engine2 + "\n");
    }
}



