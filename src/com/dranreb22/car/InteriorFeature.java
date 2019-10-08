package com.dranreb22.car;

//creating class to define InteriorFeature
public class InteriorFeature implements Feature {

  //initializing String interiorFeature. this can be expanded in the future to define multiple features
  private String interiorFeature;

  //default constructor with default value of "Generic"
  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  //overloaded constructor enabling user defined interiorFeature
  public InteriorFeature(String interiorFeature) {

    this.interiorFeature = interiorFeature;
  }

  //overriding toString
  @Override
  public String toString() {
    return "Interior " + interiorFeature;
  }

  @Override
  public String getFeature() {
    return interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }
}
