package com.dranreb22.car;

import java.util.Date;

/**
 * Car class extends Vehicle class and allows parameters to be passed into it. If the class has no
 * parameters passed, then the variables are set to default values instead.
 *
 * @author Bernard 12/2019
 */

public class Car extends Vehicle {

  private final Feature[] feature;
  private final int carAxle;

  /**
   * Car method default constructor.
   */
  public Car() {
    super();
    /*this.feature = new Feature[]{new InteriorFeature("No Interior Features"),
      new ExteriorFeature("No Exterior Features")};*/
    /*Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Feature")};*/
    this.feature = new Feature[]{new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Feature")};
    this.carAxle = 0;
  }

  /**
   * Overloaded constructor accepts parameters and passes them to the superclass constructor.
   *
   * @param vehicleManufacturedDate The date the vehicle was manufactured
   * @param vehicleManufacturer     The manufacturer of the vehicle
   * @param vehicleMake             The make of the vehicle
   * @param vehicleModel            The model of the vehicle
   * @param vehicleFrame            The frame type of the vehicle
   * @param vehicleType             The type of the vehicle itself
   * @param driveTrain              The type of drive train
   * @param vehicleEngine           From class ManufacturedEngine
   * @param features                 From class Feature
   * @param carAxles                 An integer for the number of axles
   */
  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame,
      String vehicleType, String driveTrain, ManufacturedEngine vehicleEngine,
      Feature[] features, int carAxles) {
    super(vehicleManufacturedDate, vehicleManufacturer,
        vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);

    feature = features;
    carAxle = carAxles;
  }

  /**
   * getExteriorFeatures method creates String listOfFeatures, then appends any additional
   * features.
   *
   * @return listOfFeatures String that lists Exterior Features
   */
  public String getExteriorFeatures() {
    String listOfFeatures = "";

    for (Feature f : this.feature) {
      int i = 0;
      if (this.feature[i] instanceof ExteriorFeature) {
        if (listOfFeatures.length() == 0) {
          listOfFeatures = listOfFeatures + this.feature[i];
        } else {
          listOfFeatures = listOfFeatures + "\n :" + this.feature[i];
        }
      }
    }
    return listOfFeatures;
  }

  /**
   * getInferiorFeature method exists to input values of array Feature[] into String
   * listOfFeatures.
   *
   * @return listOfFeatures String that lists interior features
   */

  public String getInteriorFeatures() {
    String listOfFeatures = "";

    for (Feature f : this.feature) {
      int i = 0;
      if (this.feature[i] instanceof InteriorFeature) {
        if (listOfFeatures.length() == 0) {
          listOfFeatures = listOfFeatures + this.feature[i];
        } else {
          listOfFeatures = listOfFeatures + "\n :" + this.feature[i];
        }
      }
    }
    return listOfFeatures;
  }

  /**
   * formats interior features, exterior features, and axles into an overridden toString method.
   *
   * @return listOfFeatures formatted interior features, exterior features, and number of axles
   */
  @Override
  public String toString() {
    String listOfFeatures = "";

    for (Feature f : this.feature) {
      int i = 0;
      if (listOfFeatures.length() == 0) {
        listOfFeatures = listOfFeatures + this.feature[i];
      } else {
        listOfFeatures = listOfFeatures + "\n \t\t: " + this.feature[i];
      }
    }
    return super.toString() + "\n"
        + "Features: " + listOfFeatures + "\n"
        + "Car Axle: " + carAxle + "\n";
  }
}
