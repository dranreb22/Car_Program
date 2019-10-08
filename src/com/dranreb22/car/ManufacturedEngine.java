package com.dranreb22.car;

import java.util.Date;

/*creating class Manufactured Engine and implementing the interface Engine
    which has setters from Engine, as well as defining getters for them.
 */
public class ManufacturedEngine implements Engine {
    //initializing variables defining different aspects of an Engine
    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    //default constructor
    public ManufacturedEngine(){
        this.engineManufacturer = "Generic";
        this.engineManufacturedDate = new Date();
        this.engineMake = "Generic";
        this.engineModel = "Generic";
        this.engineCylinders = 0;
        this.engineType = "Generic";
        this.driveTrain = "Generic";
    }

    //overloaded constructor
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


    //getters and setters for engine attributes. the override is used because
    //some some of these methods were
    public String getEngineManufacturer() {
        return engineManufacturer;
    }


    @Override
    public void setEngineManufacturer(String engineManufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    public Date getEngineManufacturedDate() {
        return engineManufacturedDate;
    }

    @Override
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

    //overriding default toString to print out the information defined in this function
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
