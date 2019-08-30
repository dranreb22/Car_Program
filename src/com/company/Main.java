package com.company;
import java.lang.String;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

interface Chassis {
    static String chassis = "Chassis";
    public String getChassisType();
    public void setChassisType (String vehicleChassis);
}

interface Engine{
    public void setEngineCylinders(int engineCylinders);
    public void setEngineManufacturedDate (Date date);
    public void setEngineManufacturer(String manufacturer);
    public void setEngineMake(String engineMake);
    public void setEngineModel(String engineModel);
    public void setDriveTrain(String driveTrain);
    public void setEngineType(String fuel);
}
public class VehicleChassis implements Chassis {
    String chassisName;

    public VehicleChassis() {
    };

    // review this portion to see proper usage of this.X
    public VehicleChassis(String ChassisName) {
        chassisName = ChassisName;
    }

    public String getChassisType() {
        return chassis;
    }

    public void setChassisType(String VehicleChassis){
         = VehicleChassis;
    }
    public String toString(){
        return chassis;
    }
}