package com.dranreb22.car;

import java.util.Date;

/**
 * Creating class Manufactured Engine and implementing the interface Engine which has setters from
 * Engine, as well as defining getters for them.
 */
public class ManufacturedEngine implements Engine {

  //initializing variables defining different aspects of an Engine
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   * Default constructor providing generic values to variables.
   */
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "Generic";
    this.driveTrain = "Generic";
  }

  /**
   * Overloaded constructor accepting defined parameters.
   *
   * @param engineManufacturer     The manufacturer of the vehicle
   * @param engineManufacturedDate The date the vehicle's engine was manufactured
   * @param engineMake             The make of the vehicle's engine
   * @param engineModel            The model of the vehicle's engine
   * @param engineCylinders        The number of cylinders in the engine
   * @param engineType             The type of the vehicle's engine itself
   * @param driveTrain             The type of drive train
   */
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake,
      String engineModel, int engineCylinders, String engineType, String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }


  /**
   * Getting object's engine manufacturer.
   *
   * @return The manufacturer of the engine.
   */
  public String getEngineManufacturer() {
    return engineManufacturer;
  }


  /**
   * Setting the object's engine manufacturer.
   *
   * @param engineManufacturer The manufacturer of the engine.
   */
  @Override
  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  /**
   * Getting the date the engine was manufactured.
   *
   * @return The date the engine was manufactured.
   */
  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  /**
   * Set the date the engine was manufactured.
   *
   * @param engineManufacturedDate The date the engine was manufactured.
   */

  @Override
  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  /**
   * Getting the make of the engine.
   *
   * @return The make of the engine.
   */
  public String getEngineMake() {
    return engineMake;
  }

  /**
   * Setting the make of the engine.
   *
   * @param engineMake The make of the engine.
   */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * Getting the model of the engine.
   *
   * @return The model of the engine.
   */
  public String getEngineModel() {
    return engineModel;
  }

  /**
   * Setting the model of the engine.
   *
   * @param engineModel The model of the engine.
   */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * Method for accessing the number of cylinders of the engine.
   *
   * @return The number of cylinders in the engine.
   */
  public int getEngineCylinders() {
    return engineCylinders;
  }

  /**
   * Sets the number of engine cylinders
   *
   * @param engineCylinders The number of engine cylinders.
   */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * Method for getting the type of the engine.
   *
   * @return The type of the engine.
   */
  public String getEngineType() {
    return engineType;
  }

  /**
   * Method for setting the type of the engine.
   *
   * @param engineType The type of the engine.
   */
  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  /**
   * Method for getting the drive train of the engine.
   *
   * @return The drive train of the engine.
   */
  public String getDriveTrain() {
    return driveTrain;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * Method overriding default toString to print out the information defined in this object.
   *
   * @return Formatted to string of the object's fields.
   */
  @Override
  public String toString() {
    return "Engine Manufacturer: " + engineManufacturer
        + "\nEngine Manufactured: " + engineManufacturedDate
        + "\nEngine Make: " + engineMake
        + "\nEngine Model: " + engineModel
        + "\nEngine Type: " + engineType
        + "\nEngine Cylinders: " + engineCylinders
        + "\nDrive Train: " + driveTrain;
  }
}
