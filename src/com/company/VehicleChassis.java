package com.company;

class VehicleChassis implements Chassis {
    //creating private object chassisName of class string
    //to be used later in the class
    private String chassisName;

    //default constructor that sets chassisNme to equal the value
    //of the variable chassis, which has the value of "Chassis"
    public VehicleChassis() {
        this.chassisName = chassis;
    };

    //overloaded constructor allowing Main.java or user to
    //define chassisName
    public VehicleChassis(String chassisName) {

        this.chassisName = chassisName;
    }

    //overloading methods from Interface Chassis
    @Override
    public Chassis getChassisType() {
        //returning an instance of itself?
        //not sure I fully understand this myself yet but
        //looking into it
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis){

        this.chassisName = vehicleChassis;
    }

    //overloading this class's default toString method
    //to print out the chassis name in
    @Override
    public String toString(){
        return "Chassis Name: "+ chassisName;
    }
}