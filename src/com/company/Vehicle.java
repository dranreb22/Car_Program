package com.company;

import java.util.Date;

//creating class Vehicle and extending the Engine and chassis interfaces
public class Vehicle implements Engine, Chassis {
    //initializing String, Date, and Chassis
    // variables
    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

    //default constructor for Vehicle, providing default values
    //for nonspecified variables
    public Vehicle () {
        this.vehicleManufacturedDate = new Date();
        this.vehicleManufacturer = "Generic";
        this.vehicleMake = "Generic";
        this.vehicleModel = "Generic";
        this.vehicleFrame = new VehicleFrame();
        this.vehicleType = "Generic";
        this.driveTrain = "Generic";
        this.vehicleEngine = new ManufacturedEngine();
    }

    //overloaded constructor for Vehicle, allowing user to
    //input chosen values
    public Vehicle (Date vehicleManufacturedDate, String vehicleManufacturer,
                    String vehicleMake, String vehicleModel, Chassis vehicleFrame,
                    String vehicleType, String driveTrain, Engine vehicleEngine){
        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.driveTrain = driveTrain;
        this.vehicleEngine = vehicleEngine;
    }

    //overloading values from Engine Interface
    //into the vehicleEngine object of Interface Engine
    @Override
    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate (Date date){
        vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer){
        vehicleEngine.setEngineManufacturer(manufacturer);
    };

    @Override
    public void setEngineMake(String engineMake){
        vehicleEngine.setEngineMake(engineMake);
    };

    @Override
    public void setEngineModel(String engineModel){
        vehicleEngine.setEngineModel(engineModel);
    };

    @Override
    public void setDriveTrain(String driveTrain){
        vehicleEngine.setDriveTrain(driveTrain);
    };

    @Override
    public void setEngineType(String fuel){
        vehicleEngine.setEngineType(fuel);
    };

    @Override
    public Chassis getChassisType(){
        return vehicleFrame;
    };

    @Override
    public void setChassisType (String vehicleChassis){
        this.vehicleFrame.setChassisType(vehicleChassis);
    };

    //overloading toString method to include information
    //regarding Vehicles
    @Override
    public String toString(){
        return "Manufacturer Name: " + vehicleManufacturer + "\n" +
                "Manufactured Date: " + vehicleManufacturedDate + "\n"+
                "Vehicle Make: " + vehicleMake + "\n" +
                "Vehicle Model: " + vehicleModel + "\n" +
                "Vehicle Type: " + vehicleType + "\n" +
                //vehicleEngine is an object of Interface Engine
                //calls to toString method of Interface Engine
                vehicleEngine.toString();
    }
}
