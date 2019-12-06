package com.dranreb22.car;

import java.lang.String;
import java.util.Date;

/**
 * Main class exists as a driver to test other programs.
 *
 * @author Bernard 12/1/2019
 */

class Main {

  /**
   * Driver main method to test other classes.
   *
   * @param args default String array of main method
   */
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
    ManufacturedEngine engine2 = new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", 4,
        "88 AKI", "2WD: Two-Wheel Drive");
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

    Car car1 = new Car();
    System.out.println(car1);

    Feature[] f = {new InteriorFeature("AM/FM Radio"),
        new ExteriorFeature("Wood Panels"),
        new InteriorFeature("Air Conditioning"),
        new ExteriorFeature("Moonroof")};

    Car car2 = new Car(new Date(1325599999999L), "Honda", "Honda", "Prelude",
        new VehicleChassis(), "null", "2WD: Two-Wheel Drive",
        new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1",
            4, "88 AKI", "2WD: Two-Wheel Drive"), f, 2);
    System.out.println(car2);

    Car car3 = new Car();
    System.out.println(car3);
  }
}