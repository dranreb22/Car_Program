package com.company;

import java.util.Date;

public class ManufacturedEngine {
    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    public ManufacturedEngine(){
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineCylinders = 0;
        this.engineType = "Generic";
        this.driveTrain = "Generic";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake,
                              String engineModel, int engineCylinders, String engineType, String driveTrain){
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    };

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    public Date getEngineManufacturedDate() {
        return engineManufacturedDate;
    }

    public void setEngineManufacturedDate(Date engineManufacturedDate) {
        this.engineManufacturedDate = engineManufacturedDate;
    }

    public String getEngineMake() {
        return engineMake;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public String toString() {
        return  "Engine Manufacturer: " + engineManufacturer + "\n"+
                "Engine Manufactured: " + engineManufacturedDate + "\n"+
                "Engine Make: " + engineMake + "\n"+
                "Engine Model: " + engineModel + "\n"+
                "Engine Type: " + engineType + "\n"+
                "Engine Cylinders: " + engineCylinders + "\n"+
                "Drive Train: " + driveTrain;
    }
}
