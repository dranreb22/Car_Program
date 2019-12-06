package com.dranreb22.car;

/**
 * Interface that serves as a list of feature requirements of methods for implementing classes to
 * utilize.
 *
 * @author Bernard 12/1/2019
 */
interface Feature {

  /**
   * Gets the feature(s) of the vehicle.
   *
   * @return The feature(s) of the vehicle.
   */
  String getFeature();

  /**
   * Sets the feature(s) of the vehicle.
   *
   * @param feature The feature being passed.
   */
  void setFeature(String feature);

}