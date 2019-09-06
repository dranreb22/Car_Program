package com.company;

//initializing class to showcase information regarding exterior features of the car
public class ExteriorFeature {
    //initializing private String
    private String exteriorFeature;


    //default constructor with default value of "Generic"
    public ExteriorFeature(){
        exteriorFeature = "Generic";
    }
    //overloaded constructor allowing a value of exteriorFeature to be set
    public ExteriorFeature(String exteriorFeature){
        this.exteriorFeature = exteriorFeature;
    }

    //method to get the exterior feature set as default or assigned by the previous constructors
    public String getExteriorFeature() {
        return exteriorFeature;
    }
    //method to set or edit the value of the exterior feature
    public void setExteriorFeature(String exteriorFeature) {
        this.exteriorFeature = exteriorFeature;
    }

    //overriding toString function
    @Override
    public String toString(){
        return "Exterior " + exteriorFeature;
    }
}
