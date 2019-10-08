package com.dranreb22.car;

//initializing class to showcase information regarding exterior features of the car
public class ExteriorFeature implements Feature {
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


    //overriding toString function
    @Override
    public String toString(){

        return "Exterior " + exteriorFeature;
    }

    @Override
    public String getFeature() {
        return exteriorFeature;
    }

    @Override
    public void setFeature(String feature) {

    }
}
