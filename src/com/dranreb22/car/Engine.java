package com.dranreb22.car;

import java.util.Date;

/**
 * Interface Engine exists to create setter methods for subclasses.
 *
 * @author Bernard
 */

//initializing abstract class Engine to define gets and sets
interface Engine {

  void setEngineCylinders(int engineCylinders);

  void setEngineManufacturedDate(Date date);

  void setEngineManufacturer(String manufacturer);

  void setEngineMake(String engineMake);

  void setEngineModel(String engineModel);

  void setDriveTrain(String driveTrain);

  void setEngineType(String fuel);
}
