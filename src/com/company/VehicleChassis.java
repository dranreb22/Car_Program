package com.company;

class VehicleChassis implements Chassis {
    String chassisName;

    public VehicleChassis() {
        this.chassisName = chassis;
    };

    // review this portion to see proper usage of this.X
    public VehicleChassis(String chassisName) {

        this.chassisName = chassisName;
    }

    @Override
    public String getChassisType() {

        return chassis;
    }

    public void setChassisType(String vehicleChassis){

        this.chassisName = vehicleChassis;
    }

    @Override
    public String toString(){
        return "Chassis Name: "+ chassisName;
    }
}