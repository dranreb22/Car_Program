package com.company;

//creating class VehicleFrame and implementing Interface Chassis
class VehicleFrame implements Chassis {
    //creating object vehicleFrameType that stores a String
    private String vehicleFrameType;

    //default constructor with default value of
    //"Unibody" for String vehicleFrameType
    public VehicleFrame(){
        vehicleFrameType = "Unibody";
    };

    //overloaded constructor allowing user/Main
    //to assign a value to the object while instantiating it
    public VehicleFrame(String vehicleFrameType){

        this.vehicleFrameType = vehicleFrameType;
    }

    //overriding methods from interface Chassis
    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String toString() {
        return "Chassis: " + chassis + "\n"
                + "VehicleFrame: " + vehicleFrameType;
    }
}