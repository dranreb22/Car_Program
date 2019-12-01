package com.dranreb22.car;

import java.util.Date;

/**
 * Interface Engine exists to create setter methods for subclasses.
 *
 * @author Bernard
 */

//initializing abstract class Engine to define gets and sets
interface Engine {

  /**
   * Enables user to set the engine cylinders.
   *
   * @param engineCylinders The number of engine cylinders.
   */
  void setEngineCylinders(int engineCylinders);

  /**
   * Enables user to set the date the engine was manufactured.
   *
   * @param date The date the engine was created.
   */
  void setEngineManufacturedDate(Date date);

  /**
   * Enables user to set the date the manufacturer of the engine.
   *
   * @param manufacturer The manufacturer of the engine.
   */
  void setEngineManufacturer(String manufacturer);

  /**
   * Enables user to set the make of the engine.
   *
   * @param engineMake The make of the engine.
   */
  void setEngineMake(String engineMake);

  /**
   * Enables user to set the model of the engine.
   *
   * @param engineModel The model of the engine.
   */
  void setEngineModel(String engineModel);

  /**
   * Enables user to set the drive train of the engine.
   *
   * @param driveTrain The drive train of the engine.
   */
  void setDriveTrain(String driveTrain);

  /**
   * Enables user to set the fuel type of the engine.
   *
   * @param fuel The fuel type of the engine.
   */
  void setEngineType(String fuel);
}
