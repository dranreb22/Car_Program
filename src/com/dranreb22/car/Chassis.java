package com.dranreb22.car;

/**
 * Interface Chassis creates a final String chassis and sets the method of setChassisType.
 *
 * @author Bernard 12/1/2019
 */

//interface definition for the chassis of the car
interface Chassis {

  // setting the string of chassis to being a constant "chassis"
  String chassis = "Chassis";

  //creating abstract method for get and set chassis type.
  Chassis getChassisType();


  /**
   * Enables the user to pass a chassis type.
   *
   * @param vehicleChassis The chassis of the vehicle.
   */
  //setChassisType accepts a String of vehicleChassis
  void setChassisType(String vehicleChassis);
}