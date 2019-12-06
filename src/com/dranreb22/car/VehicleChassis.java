package com.dranreb22.car;

/**
 * Class that implements the Chassis interface.
 *
 * @author Bernard 12/1/2019
 */
class VehicleChassis implements Chassis {

  //creating private object chassisName of class string
  //to be used later in the class
  private String chassisName;

  /**
   * Default constructor that sets chassisNme to equal the value of the variable chassis, which has
   * the value of "Chassis".
   */
  VehicleChassis() {
    this.chassisName = chassis;
  }

  /**
   * Overloaded constructor allowing user to define chassisName.
   *
   * @param chassisName The name of the chassis to set.
   */

  VehicleChassis(String chassisName) {

    this.chassisName = chassisName;
  }

  /**
   * Method for getting the chassis type.
   *
   * @return The chassis type.
   */
  @Override
  public Chassis getChassisType() {
    //returning an instance of itself?
    //not sure I fully understand this myself yet but
    //looking into it
    return this;
  }

  /**
   * Method for setting the chassis type.
   *
   * @param vehicleChassis The chassis of the vehicle.
   */
  @Override
  public void setChassisType(String vehicleChassis) {

    this.chassisName = vehicleChassis;
  }

  /**
   * Overriding this class's default toString method to print out the chassis name.
   * @return Formatted version of chassis name.
   */

  @Override
  public String toString() {
    return "Chassis Name: " + chassisName;
  }
}