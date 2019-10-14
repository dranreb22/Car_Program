package com.dranreb22.car;

import java.util.Date;

//creating class Vehicle and extending the Engine and chassis interfaces
public class Vehicle implements Engine, Chassis {

  //initializing String, Date, and Chassis
  // variables
  private final Date vehicleManufacturedDate;
  private final String vehicleManufacturer;
  private final String vehicleMake;
  private final String vehicleModel;
  private final Chassis vehicleFrame;
  private final String vehicleType;
  private String driveTrain;
  private final Engine vehicleEngine;

  /**
   * Default constructor.
   */
  //default constructor for Vehicle, providing default values
  //for non-specified variables
  Vehicle() {

    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    vehicleFrame = new VehicleFrame();
    vehicleType = "Generic";
    //driveTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();
  }

  /**
   * Constructor that accepts parameters and places them into the pre-defined variables of this
   * class.
   *
   * @param vehicleManufacturedDate The date the vehicle was manufactured
   * @param vehicleManufacturer     The manufacturer of the vehicle
   * @param vehicleMake             The make of the vehicle
   * @param vehicleModel            The model of the vehicle
   * @param vehicleFrame            The frame type of the vehicle
   * @param vehicleType             The type of the vehicle itself
   * @param driveTrain              The type of drive train
   * @param vehicleEngine           From class ManufacturedEngine
   */
  //overloaded constructor for Vehicle, allowing user to
  //input chosen values
  Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame,
      String vehicleType, String driveTrain, Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  //overriding values from superclass Engine Interface
  //into the vehicleEngine object of Interface Engine
  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {
    vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    vehicleEngine.setEngineModel(engineModel);
    //
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    vehicleEngine.setEngineType(fuel);
  }

  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  //overloading toString method to include information
  //regarding Vehicles
  @Override
  public String toString() {
    return "Manufacturer Name: " + vehicleManufacturer
        + "\nManufactured Date: " + vehicleManufacturedDate
        + "\nVehicle Make: " + vehicleMake
        + "\nVehicle Model: " + vehicleModel
        + "\nVehicle Type: " + vehicleType
        //vehicleEngine is an object of Interface Engine
        //calls to toString method of Interface Engine
        + "\n" + vehicleEngine.toString();


  }
}
