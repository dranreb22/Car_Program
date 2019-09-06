package com.company;

//interface definition for the chassis of the car
interface Chassis {

    // setting the string of chassis to being a constant "chassis"
    final String chassis = "Chassis";

    //creating abstract method for get and set chassis type.
    Chassis getChassisType();


    //setchassistype accepts a String of vehicleChassis
    void setChassisType (String vehicleChassis);
}