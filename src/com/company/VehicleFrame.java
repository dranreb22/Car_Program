package com.company;

class VehicleFrame implements Chassis {
    private String vehicleFrameType;
    public VehicleFrame(){
        vehicleFrameType = "Unibody";
    };

    public VehicleFrame(String vehicleFrameType){

        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String getChassisType() {
        return chassis;
    }

    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String toString(){
        return "Chassis: " + chassis + "\n"
                + "VehicleFrame: " + vehicleFrameType;
    }



}