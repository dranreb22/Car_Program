package com.company;

public class Car extends Vehicle {
    private Feature[] feature;
    private int carAxle;

    public Car () {
        super();
        feature = new Feature[10];
        carAxle = 0;
    }
/* Commenting out due to errors in code; will work out issues at a different time
    public Car(Feature[] feature, int carAxle){
        super();
        // this next line is recommended by the IDE but will ensure if this is implemented correctly
        for (Feature feature1 : this.feature = feature) {

        }
        ;
        this.carAxle = carAxle;
    }
    //erroring out: Start Working Here
    public ExteriorFeature getExteriorFeatures(){
        return ExteriorFeature();
    }

    //erroring out
    public InteriorFeature getExteriorFeatures(){
        return InteriorFeature();
    }*/
}
