package com.dranreb22.car;

/**
 * The class that enables setting and accessing the exterior features of the class.
 *
 * @author Bernard 12/2019
 */

public class ExteriorFeature implements Feature {


  private final String exteriorFeature;

  /**
   * Generic constructor for the exterior feature(s).
   */
  //default constructor with default value of "Generic"
  ExteriorFeature() {
    exteriorFeature = "Generic";
  }

  /**
   * Overload constructor to set the exterior feature.
   *
   * @param exteriorFeature The exterior feature of the program.
   */
  //overloaded constructor allowing a value of exteriorFeature to be set
  ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * To string method enabling a formatted string of the interior features.
   *
   * @return Formatted String of the interior features.
   */
  @Override
  public String toString() {

    return "Exterior " + exteriorFeature;
  }

  /**
   * Enables accessing the exterior features.
   *
   * @return The feature that was set.
   */
  @Override
  public String getFeature() {
    return exteriorFeature;
  }

  /**
   * Enables setting the exterior features.
   *
   * @param feature The exterior feature to be set.
   */
  @Override
  public void setFeature(String feature) {

  }
}
