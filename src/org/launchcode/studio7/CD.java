package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {


    // TODO: Implement your custom interface.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    };
    public void readData() {
        System.out.println("Now playing a CD!");
    };

    public void storeData() {
        System.out.println("CD Data is stored!");

    };

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String name, int capacity, int capacityUsed, ArrayList<String> contents, String discType) {
        super(name, capacity, capacityUsed, contents, discType);


    }

}
