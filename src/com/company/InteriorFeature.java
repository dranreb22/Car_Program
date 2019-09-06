package com.company;

//creating class to define InteriorFeature
public class InteriorFeature {
    //initializing String interiorFeature. this can be expanded in the future to define multiple features
    private String interiorFeature;

    //default constructor with default value of "Generic"
    public InteriorFeature(){
        interiorFeature = "Generic";
    }

    //overloaded constructor enabling user defined interiorFeature
    public InteriorFeature(String interiorFeature){
        this.interiorFeature = interiorFeature;
    }


    //getter and setter for interiorfeature enabled assignment/reassignment and retrieval of String interiorFeature
    public String getInteriorFeature() {
        return interiorFeature;
    }

    public void setInteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    //overriding toString
    @Override
    public String toString(){
        return "Interior " + interiorFeature;
    }
}
