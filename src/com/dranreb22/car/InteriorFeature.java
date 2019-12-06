package com.dranreb22.car;

/**
 * Class that enables uses to manager interior features of a vehicle.
 *
 * @author Bernard 12/1/2019
 */
public class InteriorFeature implements Feature {

  private String interiorFeature;

  /**
   * Constructor setting the interior feature to a default value.
   */
  InteriorFeature() {
    interiorFeature = "Generic";
  }

  /**
   * Overloaded constructor accepting interior feature and setting it.
   *
   * @param interiorFeature The interior feature that should be passed to the object.
   */
  InteriorFeature(String interiorFeature) {

    this.interiorFeature = interiorFeature;
  }

  /**
   * Method to obtain the interior feature of the object.
   *
   * @return The interior feature of the object.
   */
  @Override
  public String getFeature() {
    return interiorFeature;
  }

  /**
   * Method to set the interior feature of the object.
   *
   * @param feature The feature being passed.
   */
  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  /**
   * Overloaded to string method to obtain a formatted string of the interior features.
   *
   * @return Formatted string of interior feature.
   */
  @Override
  public String toString() {
    return "Interior " + interiorFeature;
  }
}
