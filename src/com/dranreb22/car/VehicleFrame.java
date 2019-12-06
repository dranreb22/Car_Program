package com.dranreb22.car;

/**
 * Creating class VehicleFrame and implementing Interface Chassis.
 *
 * @author Bernard 12/1/2019
 */

class VehicleFrame implements Chassis {

  //creating object vehicleFrameType that stores a String
  private String vehicleFrameType;

  /**
   * Default constructor with default value of
   * "Unibody" for String vehicleFrameType.
   */
  VehicleFrame() {
    vehicleFrameType = "Unibody";
  }


  /**
   * Overloaded constructor allowing user
   * to assign a value to the object while instantiating it.
   *
   * @param vehicleFrameType The frame type of the vehicle.
   */

  VehicleFrame(String vehicleFrameType) {

    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Method for getting access to the chassis.
   * @return The chassis type.
   */
  @Override
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Method for setting the chassis type.
   * @param vehicleFrameType The chassis/vehicle frame type.
   */
  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Formatting the fields of the object.
   * @return Formatted output of the fields of the object.
   */
  @Override
  public String toString() {
    return "Chassis: " + chassis + "\n"
        + "VehicleFrame: " + vehicleFrameType;
  }
}